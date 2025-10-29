package com.example.consumerdbzplanet

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resultado)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val planetaImagem = findViewById<ImageView>(R.id.planetaImg)
        val nomeTextView = findViewById<TextView>(R.id.nameTv)
        val descTextView = findViewById<TextView>(R.id.descTv)
        val btnRetornar = findViewById<Button>(R.id.buttonRetornar)

        val id = intent.getStringExtra("ID_EXTRA")
        val idInt = id?.toIntOrNull()

        if (id != null) {
            val dbzApi = RetrofitHelper.getInstance().create(DbzApi::class.java)

            GlobalScope.launch(Dispatchers.IO) {
                try {
                    val response = dbzApi.getPlanetas()

                    if (response.isSuccessful) {
                        val planetas = response.body()

                        val foundPlanet = planetas?.items?.find { it.id == idInt }

                        Log.d("Retorno da API: ", foundPlanet.toString())

                        withContext(Dispatchers.Main) {
                            Glide.with(this@ResultadoActivity)
                                .load(foundPlanet?.image.toString())
                                .into(planetaImagem)
                            nomeTextView.text = "NOME: ${foundPlanet?.name}"
                            descTextView.text = "Descrição: ${foundPlanet?.description.toString()}"
                        }
                    } else {
                        withContext(Dispatchers.Main) {
                            nomeTextView.text = "Erro: ${response.code()}"
                        }
                    }
                } catch (e: Exception) {
                    withContext(Dispatchers.Main) {
                        nomeTextView.text = "Ocorreu um erro: ${e.message}"
                    }
                }
            }
        } else {
            nomeTextView.text = "Planeta não encontrado."
        }

        btnRetornar.setOnClickListener {
            onBackPressed()
        }
    }
}