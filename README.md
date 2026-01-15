# Access Control API

API REST desenvolvida em Java para controle de usuários, autenticação e permissões, com foco em boas práticas de backend, segurança e versionamento de banco de dados.

Este projeto foi criado do zero com o objetivo de consolidar conhecimentos em Spring Boot, Spring Security, JPA e Flyway, simulando um cenário real de aplicação corporativa.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot 3
- Spring Security
- Spring Data JPA (Hibernate)
- PostgreSQL
- Flyway (versionamento de banco)
- Maven
- Lombok
- Git / GitHub

---

## 📌 Funcionalidades Implementadas

- Estrutura inicial de API REST
- Entidade de usuário persistida em banco de dados
- Integração com PostgreSQL
- Controle de schema do banco via Flyway
- Configuração inicial de Spring Security
- Versionamento do projeto com Git

---

## 🛠️ Funcionalidades em Desenvolvimento

- Cadastro de usuários via endpoint REST
- Autenticação baseada em usuário e senha
- Implementação de JWT
- Controle de permissões (roles)
- Auditoria de ações
- Testes automatizados

---

## 🧱 Arquitetura

O projeto segue uma separação clara de responsabilidades, baseada em camadas:

- **Controller** – Camada de entrada da API (REST)
- **Service** – Regras de negócio
- **Repository** – Acesso a dados (JPA)
- **Domain/Entity** – Modelo de dados
- **Security** – Configurações de autenticação e autorização

---

## 🗄️ Banco de Dados

- Banco: **PostgreSQL**
- Versionamento de schema: **Flyway**
- As migrações ficam em:
  ```bash
  src/main/resources/db/migration
  ```

Ao subir a aplicação, o Flyway cria e versiona automaticamente as tabelas necessárias.

---

## ▶️ Como Executar o Projeto

### Pré-requisitos
- Java 17 instalado
- PostgreSQL rodando localmente
- Maven (ou usar o Maven Wrapper do projeto)

### Passos

1. Clone o repositório:
 ```bash
 git clone https://github.com/SEU_USUARIO/access-control-api.git
 ```
2. Acesse a pasta do projeto:
  ```bash
  cd access-control-api
  ```
3. Configure o banco de dados no application.yml ou application.properties
4. Execute a aplicação:
  ```bash
  ./mvnw spring-boot:run
  ```

A API será iniciada em:
```bash
http://localhost:8080
 ```

🔐 Segurança

Atualmente o projeto utiliza a configuração padrão do Spring Security para desenvolvimento.

⚠️ A autenticação via JWT está planejada e será implementada nas próximas versões.

📦 Controle de Versão

Commits pequenos e descritivos

.gitignore configurado para evitar versionamento de arquivos de build e IDE

Projeto público no GitHub para fins de portfólio

🎯 Objetivo do Projeto

Este projeto faz parte de um portfólio pessoal com foco em:

Desenvolvimento backend com Java

Criação de projetos do zero

Boas práticas de arquitetura

Segurança em APIs REST

Simulação de cenários reais de aplicações corporativas

📄 Status do Projeto

🚧 Em desenvolvimento

Novas funcionalidades serão adicionadas de forma incremental.

👤 Autor

Tiago França Silveira
Desenvolvedor Java

---
