# ScreenMatch

Um projeto **backend** desenvolvido em Java com Spring, simulando um sistema de busca e gerenciamento de informações sobre filmes e séries. Este projeto é parte de um bootcamp de Java e explora a integração com APIs externas e persistência de dados.

---

## 🚀 Sobre o Projeto

O ScreenMatch foi concebido como o **backend de um potencial serviço de streaming**, similar a plataformas como Netflix ou Amazon Prime Video. Ele permite a busca por filmes e séries através de uma API externa (OMDb API), persistindo os dados de séries no banco de dados e possibilitando a consulta de informações detalhadas, incluindo temporadas e episódios.

O objetivo principal deste projeto é consolidar conhecimentos em:

* Consumo de APIs RESTful.
* Manipulação de dados JSON com Jackson.
* **Persistência de dados com Spring Data JPA, utilizando Hibernate como ORM, e PostgreSQL.**
* Estruturação de projetos Spring Boot com Maven.

---

## ✨ Funcionalidades

* **Buscar Séries:** Pesquisa séries por nome utilizando a OMDb API e salva as informações no banco de dados.
* **Buscar Episódios:** Obtém detalhes sobre as temporadas e episódios de uma série específica.
* **Listar Séries Buscadas:** Exibe uma lista das séries que já foram pesquisadas e salvas no sistema.

---

## 🛠️ Tecnologias Utilizadas

* **Java 17+**: Linguagem de programação.
* **Spring Boot**: Framework para o desenvolvimento de aplicações Java.
* **Spring Data JPA**: Para abstração da persistência de dados.
* **Hibernate**: **ORM (Object-Relational Mapping)** utilizada para mapear objetos Java para o banco de dados.
* **Maven**: Ferramenta de automação de construção de projetos.
* **Jackson**: Biblioteca para processamento de JSON.
* **PostgreSQL**: Sistema de gerenciamento de banco de dados relacional.
* **OMDb API**: API externa utilizada para obter dados de filmes e séries.

---

## ⚙️ Como Executar o Projeto

Para executar o ScreenMatch em sua máquina local, siga os passos abaixo:

### Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas:

* **JDK 17** ou superior.
* **Maven** 3.6+
* **PostgreSQL** (com um banco de dados configurado para o projeto, por exemplo, `screenmatch_db`).

### Configuração do Banco de Dados

1.  Crie um banco de dados PostgreSQL. Por exemplo:
    ```sql
    CREATE DATABASE screenmatch_db;
    ```
2.  No arquivo `application.properties` (ou `application.yml`) localizado em `src/main/resources`, configure as propriedades de conexão com o seu banco de dados PostgreSQL. Exemplo:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/screenmatch_db
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.format_sql=true
    ```
    **Lembre-se de substituir `seu_usuario` e `sua_senha` pelas suas credenciais.**

### Chave da OMDb API

Obtenha uma chave gratuita na [OMDb API](http://www.omdbapi.com/apikey.aspx) e substitua `6585022c` (no seu código `Principal.java`) pela sua chave.

### Passos para Executar

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/screenmatch.git](https://github.com/seu-usuario/screenmatch.git) # Substitua pelo link do seu repositório
    ```
2.  **Construa o projeto com Maven:**
    ```bash
    mvn clean install
    ```
3.  **Execute a aplicação:**
    ```bash
    mvn spring-boot:run
    ```

A aplicação será iniciada e o menu interativo será exibido no console.

---

## 🤝 Contribuições

Este projeto faz parte de um bootcamp de Java. Contribuições são bem-vindas para aprimoramento e aprendizado conjunto! Sinta-se à vontade para abrir issues ou pull requests.

---

## 🎓 Autor

* **viniciusbalestra** - [https://github.com/viniciusbalestra]
