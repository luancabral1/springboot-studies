# API REST de Usuários

Exercício para praticar a criação de endpoints REST com Spring Boot.

## Objetivo

Criar uma rota que retorna uma lista de usuários em formato JSON.

## Tecnologias

- Java
- Spring Boot
- Maven
- Spring Web

## Como executar

Entre na pasta do exercício:

```bash
cd 02-rest-api-usuarios
```

Execute o projeto:

```bash
mvn spring-boot:run
```

Acesse:

```text
http://localhost:8080/users
```

## Endpoint

```text
GET /users
```

## Conceitos praticados

- `@RestController`
- `@GetMapping`
- Retorno de objetos em JSON
- Organização básica em pacotes
- Criação de uma classe `User`

## Status

Estudo inicial.
