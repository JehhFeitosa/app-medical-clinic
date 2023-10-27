# app-medical-clinic
Application responsible for managing the registration of doctors and patients in a clinic

![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)

Trello with features
https://trello.com/b/O0lGCsKb/api-voll-med

Layout mobile 
https://www.figma.com/file/N4CgpJqsg7gjbKuDmra3EV/Voll.med



## Features 💻


- [x] POST (Doctors Registration)
   <details><summary>Curl</summary>
        <p>
  
        curl --location --request POST 'http://localhost:8080/medicos' \
        --header 'Content-Type: application/json' \
        --data-raw '{
        "nome" : "Feitosa",
        "email" : "feitosa@gmail.com",
        "crm" : "123456",
        "especialidade" : "ORTOPEDIA",
        "endereco" : {
            "logradouro" : "Rua: Primeiro de Maio",
            "bairro" : "Maria Beatriz",
            "cep" : "06365745",
            "cidade" : "Brasilia",
            "uf" : "SP",
            "numero" : "1",
            "complemento" : "complemento"
        }
        }'   
<br>

- [x] GET (List of Doctors)
   <details><summary>Curl</summary>
        <p>
  
        curl --location --request GET 'http://localhost:8080/medicos' 
<br>

- [x] PUT (Update of Doctors)
   <details><summary>Curl</summary>
        <p>
  
        curl --location --request PUT 'http://localhost:8080/medicos' \
        --header 'Content-Type: application/json' \
        --data-raw '{
         "id": 5,
         "nome" : "Joana"
        }'
<br>


<a href="https://github.com/JehhFeitosa">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/58116519?s=400&u=8b96c6759c724308b3cfb9e6a2480fad3f5107c2&v=4" width="100px;" alt=""/>
 <br />
 <sub><b>Jéssica Feitosa</b></sub></a> <a href="https://www.linkedin.com/in/j%C3%A9ssicafeitosa/" title="Rocketseat">🚀</a>
<br><br>

Made in Jessica Feitosa 👋🏽 Get in touch!

[![Linkedin Badge](https://img.shields.io/badge/-Jessica-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/jéssicafeitosa/)](https://www.linkedin.com/in/jéssicafeitosa/)
---
