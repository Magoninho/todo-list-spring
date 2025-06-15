# Todo List - Spring Boot

Este é um projeto de exemplo de uma API para gerenciamento de tarefas (to-do list) desenvolvida com Spring Boot e PostgreSQL.

## Tecnologias Utilizadas

- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **PostgreSQL**: Banco de dados relacional utilizado para persistência dos dados.
- **Spring Data JPA**: Abstração para acesso a dados com JPA.
- **Maven**: Gerenciador de dependências e build.

## Pré-requisitos

- Java 21 ou superior
- Maven 3.9.x ou superior
- PostgreSQL

## Configuração do Banco de Dados

1. Crie o banco de dados utilizando o script [`src/main/resources/create_db.sql`](src/main/resources/create_db.sql).
2. Crie as tabelas utilizando o script [`src/main/resources/create_tables.sql`](src/main/resources/create_tables.sql).
3. Certifique-se de que as configurações de acesso ao banco em [`src/main/resources/application.properties`](src/main/resources/application.properties) estejam corretas para o seu ambiente.

## Como Rodar o Projeto

1. Clone este repositório.
2. Instale as dependências e compile o projeto:
```sh
./mvnw clean install
```
3. Execute a aplicação:
```sh
./mvnw spring-boot:run
```
A aplicação estará disponível em `http://localhost:3000`.

## Documentação da API
A documentação completa dos endpoints da API está disponível [aqui](/docs/api.md)

