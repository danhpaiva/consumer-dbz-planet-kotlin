# 🪐 ConsumerDbzPlanetSuaMatricula - Explorador de Planetas de Dragon Ball Z 🚀

<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin Badge"/>
  <img src="https://img.shields.io/badge/Android%20Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white" alt="Android Studio Badge"/>
  <img src="https://img.shields.io/badge/API%20REST-brightgreen?style=for-the-badge" alt="REST API Badge"/>
</p>

## 📜 Sobre o Projeto

[cite_start]Este projeto é uma solução em **Kotlin** para Android desenvolvida como exercício da disciplina de **Desenvolvimento Mobile Kotlin** [cite: 2] no **Colégio | Faculdade | [cite_start]Cotemig**[cite: 1, 5].

[cite_start]O objetivo é criar uma aplicação (`ConsumerDbzPlanetSuaMatricula` [cite: 12][cite_start]) que consuma a **Dragon Ball API** [cite: 14] [cite_start]para buscar dados de um planeta específico do universo Dragon Ball[cite: 13].

## ✨ Requisitos Cumpridos

A solução aborda os seguintes pontos chave, com foco em boas práticas de desenvolvimento mobile:

1.  [cite_start]**Modelagem de Dados:** Criação de uma pasta `Models` e uma Classe de Modelo Kotlin que mapeia todas as propriedades do JSON de retorno da API para a rota `/api/planets/{id}`[cite: 18].
2.  [cite_start]**Interação com o Usuário:** A aplicação solicita ao usuário o **ID** do planeta a ser pesquisado, que é passado como parâmetro na URL da API[cite: 19].
3.  [cite_start]**Tratamento de Exceções:** A consulta à API é encapsulada em um bloco **`Try-Catch`** para tratar possíveis erros de requisição (Rede) ou de desserialização da resposta JSON[cite: 20].
4.  [cite_start]**Visualização:** Os dados retornados (`name`, `description` e `image`) são impressos no **LogCat** do Android Studio e/ou exibidos em uma tela (`Activity`) de resposta[cite: 21].

## 🔗 Detalhes da API

| Recurso | Descrição | Rota Base |
| :--- | :--- | :--- |
| **Planetas** | Busca um planeta específico pelo seu ID. | [cite_start]`https://dragonball-api.com/api/planets/{id}` [cite: 15] |

## 👨‍🏫 Informações Acadêmicas

* [cite_start]**Disciplina:** Desenvolvimento Mobile Kotlin [cite: 2]
* [cite_start]**Professor:** Daniel Henrique Matos de Paiva [cite: 3]
* **Instituição:** Colégio | Faculdade | [cite_start]Cotemig [cite: 1, 5]
* [cite_start]**Entrega:** A atividade deve ser entregue individualmente [cite: 10][cite_start], em formato `.zip` (File, Export to .zip)[cite: 22].

## ⚠️ Padrões de Código

* [cite_start]Todos os algoritmos estão escritos em linguagem **Kotlin**[cite: 8].
* [cite_start]O código está devidamente **indentado** [cite: 9] para garantir a legibilidade.

---
*Developed by: Daniel Paiva*