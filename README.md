# 🪐 ConsumerDbzPlanetSuaMatricula - Explorador de Planetas de Dragon Ball Z 🚀

<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin Badge"/>
  <img src="https://img.shields.io/badge/Android%20Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white" alt="Android Studio Badge"/>
  <img src="https://img.shields.io/badge/API%20REST-brightgreen?style=for-the-badge" alt="REST API Badge"/>
</p>

## 📜 Sobre o Projeto

Esta solução em **Kotlin** para Android, chamada `ConsumerDbzPlanetSuaMatricula`, é um exercício da disciplina de **Desenvolvimento Mobile Kotlin** no **Colégio | Faculdade | Cotemig**.

O objetivo é consumir a **Dragon Ball API** para buscar dados de um planeta específico do universo Dragon Ball.

## ✨ Requisitos da Atividade

O projeto foi desenvolvido para atender aos seguintes requisitos listados:

* **Modelagem de Dados:** Criação de uma pasta `Models` e uma Classe de Modelo que representa todas as propriedades do JSON de retorno para esta rota.
* **Input do Usuário:** Solicitar ao usuário para informar o **ID** que deverá ser passado como parâmetro na URL da API.
* **Requisição Segura:** Fazer a consulta da rota API utilizando o bloco **`Try-Catch`**, tratando os possíveis erros de *Request* ou *Desserialização* da resposta.
* **Visualização:** Imprimir os campos `name`, `description` e `image` no **LogCat** do Android Studio e/ou criar uma tela (`Activity`) de resposta para mostrar o resultado.

## 🔗 Rota da API

A rota principal utilizada para a consulta de planetas é:

~~~
https://dragonball-api.com/api/planets/
~~~

O parâmetro `planets` possui a responsabilidade pelo retorno de determinados planetas do anime.

## 👨‍🏫 Informações Acadêmicas

* **Disciplina:** Desenvolvimento Mobile Kotlin
* **Professor:** Daniel Henrique Matos de Paiva
* **Instituição:** Colégio | Faculdade | Cotemig
* **Entrega:** A entrega deve ser individual e exportada para um arquivo `.zip` (`File, Export to .zip`) para submissão no Google Classroom.

## ⚠️ Padrões de Código

* Todos os algoritmos pedidos estão escritos em linguagem **Kotlin**.
* Todos os algoritmos estão devidamente **indentados**.

---
*Esta lista de exercício deve ser entregue no prazo proposto.*