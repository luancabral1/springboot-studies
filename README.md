# 🍃 Estudos Spring Boot

Este repositório reúne exercícios que desenvolvi durante meus estudos em **Java com Spring Boot**.

A ideia é manter meu aprendizado organizado e registrar minha evolução na criação de APIs backend com Spring Boot.

![Java](https://img.shields.io/badge/Java-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-green?style=for-the-badge&logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-red?style=for-the-badge&logo=apachemaven&logoColor=white)
![Status](https://img.shields.io/badge/status-em%20evolução-blue?style=for-the-badge)
![Estudos](https://img.shields.io/badge/tipo-estudos-purple?style=for-the-badge)

---

## 🎯 Objetivo

Consolidar minha base em Spring Boot através de exemplos práticos, exercícios e pequenos projetos, com foco em conceitos importantes para desenvolvimento backend:

- Criação de APIs REST
- Controllers e endpoints
- Estrutura de projetos com Maven
- Organização em pacotes
- Retorno de dados em JSON
- Camadas de uma aplicação backend
- Preparação para projetos com banco de dados, JPA e Spring Security

---

## 📚 Conteúdo

| Seção | Tema | O que contém |
|---|---|---|
| `01-primeira-api` | Primeira API Spring Boot | Estrutura inicial de uma aplicação Spring Boot com endpoint simples |
| `02-rest-api-usuarios` | API REST de usuários | Endpoint retornando uma lista de usuários em JSON |

---

## 🗂️ Estrutura do repositório

```text
springboot-studies/
├── 01-primeira-api/
│   ├── src/
│   ├── pom.xml
│   └── README.md
├── 02-rest-api-usuarios/
│   ├── src/
│   ├── pom.xml
│   └── README.md
├── .gitignore
├── LICENSE
└── README.md
```

---

## ▶️ Como executar os exemplos

Entre na pasta do exercício desejado e execute o projeto com Maven.

Exemplo:

```bash
cd 01-primeira-api
mvn spring-boot:run
```

Outro exemplo:

```bash
cd 02-rest-api-usuarios
mvn spring-boot:run
```

Depois acesse no navegador, Postman, Insomnia ou Thunder Client:

```text
http://localhost:8080
```

---

## 📝 Observação

Este repositório representa minha evolução prática em Spring Boot. Alguns exercícios são simples de propósito, pois foram criados para fixar conceitos específicos antes de avançar para projetos maiores com banco de dados, autenticação, validações e arquitetura em camadas.

---

## 🚀 Próximos passos

- Criar CRUD com Spring Boot
- Adicionar busca por ID
- Separar o projeto em `controller`, `service` e `repository`
- Integrar com banco de dados usando JPA/Hibernate
- Adicionar validações
- Criar tratamento de exceções
- Adicionar testes
- Estudar Spring Security

---

## 👤 Autor

Luan Cabral  
GitHub: [@luancabral1](https://github.com/luancabral1)  
LinkedIn: [Luan Cabral](https://www.linkedin.com/in/luan-cabral-307784378/)

---

## 📄 Licença

Este projeto está sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.
