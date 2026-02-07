# 🎵 Projeto Música — Plataforma Web para Conexão entre Músicos

Este repositório contém o código-fonte do **Musique**, uma aplicação web em desenvolvimento com o objetivo de criar uma plataforma profissional voltada exclusivamente para músicos.

A aplicação propõe um ambiente onde músicos possam criar perfis, apresentar suas habilidades, instrumentos e experiências, enquanto contratantes podem encontrar e se conectar com profissionais de forma simples e eficiente. A ideia segue uma lógica semelhante a redes profissionais, porém focada no universo musical.

Este é um projeto de médio a longo prazo, com foco em aprendizado contínuo, boas práticas de arquitetura, organização de código e construção de uma aplicação robusta e escalável.

---

## 🏗️ Arquitetura e Estrutura do Projeto

O projeto segue o padrão **MVC (Model-View-Controller)** com separação clara de responsabilidades:

- **Model**: Entidades JPA e lógica de negócio
- **View**: Interface Angular no frontend
- **Controller**: APIs REST no Spring Boot

A estrutura do projeto está organizada da seguinte forma:
```
projeto-musica/
├── backend/           # API REST (Spring Boot)
│   ├── src/main/java/
│   │   └── com/projetomusica/backend/
│   │       ├── config/     # Configurações (Security, CORS, etc.)
│   │       ├── controller/ # Controllers REST
│   │       ├── model/      # Entidades JPA
│   │       ├── repository/ # Repositórios de dados
│   │       └── service/    # Lógica de negócio
│   └── src/main/resources/
│       └── application.properties
└── frontend/          # Interface Angular
    ├── src/
    │   ├── app/
    │   │   ├── components/    # Componentes reutilizáveis
    │   │   ├── pages/         # Páginas da aplicação
    │   │   ├── services/      # Comunicação com API
    │   │   └── models/        # Interfaces e modelos
    │   ├── assets/            # Recursos estáticos
    │   └── styles/            # Estilos globais
    └── angular.json
```

---

## ⚙️ Tecnologias Utilizadas (The Stack)

O projeto utiliza uma stack moderna, com separação clara entre backend e frontend.

### 🔧 Backend
| Tecnologia | Objetivo |
|-----------|----------|
| Java 17 (Temurin OpenJDK) | Linguagem principal da aplicação |
| Spring Boot | Criação de APIs REST, organização da aplicação e injeção de dependências |
| PostgreSQL | Banco de dados relacional |
| JPA / Hibernate | Mapeamento objeto-relacional (ORM) |
| Maven | Gerenciamento de dependências e build |
| Spring Security | Autenticação e autorização |

### 🎨 Frontend
| Tecnologia | Objetivo |
|-----------|----------|
| Angular | Framework para construção da interface e componentização |
| TypeScript | Linguagem principal do frontend com tipagem estática |
| RxJS | Programação reativa e gerenciamento de estado |
| Angular CLI | Ferramenta de build e desenvolvimento |
| HttpClient | Comunicação com APIs REST |
| CSS / Angular Material | Estilização e componentes UI |

---

## 🚀 Começando o Desenvolvimento Local

### 1️⃣ Clonar o repositório
```bash
git clone https://github.com/MatheusBach-Dev/projeto-musica.git
cd projeto-musica
```

### 2️⃣ Configurar e rodar o Backend (Java + Spring Boot)
```bash
cd backend
```

Configure o arquivo `application.properties` com as informações do banco de dados PostgreSQL:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/projeto_musica
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Execute a aplicação:
```bash
./mvnw spring-boot:run
```

O backend ficará disponível em: **http://localhost:8080**

### 3️⃣ Configurar e rodar o Frontend (Angular)

Em um novo terminal:
```bash
cd frontend
npm install
ng serve
```

O frontend estará disponível em: **http://localhost:4200**

---

## 📋 Funcionalidades Planejadas

- [ ] Sistema de autenticação e autorização
- [ ] Perfis de músicos com portfólio
- [ ] Sistema de busca e filtros avançados
- [ ] Avaliações e recomendações
- [ ] Upload de arquivos de áudio/vídeo
- [ ] Dashboard para contratantes

---

## 🛠️ Padrões e Boas Práticas

- **Arquitetura MVC**: Separação clara de responsabilidades
- **RESTful APIs**: Endpoints bem estruturados e padronizados
- **Clean Code**: Código limpo e bem documentado
- **Versionamento**: Commits semânticos e branches organizadas
- **Testes**: Implementação gradual de testes unitários e de integração
- **Segurança**: Implementação de autenticação JWT e validações

---

## 📌 Observações Importantes

- Este projeto está em **constante evolução**
- Novas funcionalidades, melhorias de arquitetura e refatorações serão implementadas ao longo do desenvolvimento
- O foco principal é **aprendizado prático**, organização de código e simulação de um projeto próximo à realidade do mercado
- Boas práticas de versionamento, commits semânticos e estruturação de código estão sendo aplicadas continuamente

---

## 🤝 Contribuições

Este é um projeto de aprendizado pessoal, mas sugestões e feedbacks são sempre bem-vindos!

---

## 📄 Licença

Este projeto é proprietário e não pode ser utilizado, copiado ou distribuído sem autorização dos autores.
