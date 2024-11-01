# API Educacional com Spring Boot

<img src="https://user-images.githubusercontent.com/74038190/212284115-f47cd8ff-2ffb-4b04-b5bf-4d1c14c0247f.gif" width="1000">

Este projeto é uma aplicação Spring Boot que implementa uma API RESTful para gerenciar entidades relacionadas a disciplinas e monitores. A seguir, apresentamos uma descrição detalhada do processo de desenvolvimento, incluindo as ferramentas utilizadas, as etapas de criação e modelagem do código, e os testes realizados.

## Ferramentas Utilizadas

*   **Spring Boot**: Framework utilizado para criar a aplicação web.
*   **Spring Initializr**: Ferramenta online para gerar a estrutura inicial do projeto Spring Boot.
*   **IntelliJ IDEA**: Ambiente de desenvolvimento integrado (IDE) utilizado para escrever e gerenciar o código.
*   **Maven**: Sistema de gerenciamento de dependências utilizado para gerenciar as bibliotecas do projeto.
*   **H2 Database**: Banco de dados em memória utilizado para persistir os dados durante o desenvolvimento.
*   **Postman**: Ferramenta utilizada para testar a API RESTful.

## Etapas de Criação do Projeto

### 1. Criação do Projeto com Spring Initializr

Iniciamos o projeto utilizando o [Spring Initializr](https://start.spring.io/):

*   **Tipo de Projeto**: Maven Project
*   **Linguagem**: Java
*   **Versão**: Spring Boot 3.2.11
*   **Grupo**: com.example
*   **Artefato**: pw-study
*   **Nome**: pw-study
*   **Descrição**: Projeto de Estudo
*   **Pacote Base**: com.example.pwstudy
*   **Dependências**:
    *   Spring Web
    *   Spring Data JPA
    *   H2 Database
    *   Spring Boot DevTools
    *   Spring Boot Starter Test

Após configurar as opções, geramos e baixamos o projeto, que foi importado no IntelliJ IDEA.

### 2. Estrutura do Projeto

Após importar o projeto no IntelliJ IDEA, a estrutura do diretório foi organizada da seguinte forma:
