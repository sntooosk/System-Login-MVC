# SISTEMA LOGIN MVC

O Sistema Login MVC é um projeto de exemplo que demonstra a implementação de um sistema de login usando o padrão de arquitetura Model-View-Controller (MVC). O objetivo deste projeto é fornecer um exemplo básico de como estruturar um sistema de login seguindo as melhores práticas de design de software.

## Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas em seu sistema antes de prosseguir com este projeto:

- JDK (Java Development Kit)
- Apache Maven
- Algum ambiente de desenvolvimento integrado (IDE) como Eclipse, IntelliJ IDEA ou NetBeans (opcional)

## Configuração do projeto

Siga as etapas abaixo para configurar e executar o projeto:

1. Clone este repositório para o seu diretório local:
   
   git clone https://github.com/seu-usuario/sistema-login-mvc.git
   

2. Navegue até o diretório do projeto:
   
   cd sistema-login-mvc
   

3. Compile o projeto usando o Maven:
   
   mvn compile
   

4. Execute o projeto:
   
   mvn exec:java -Dexec.mainClass="com.example.Main"
   

## Estrutura do projeto

O projeto Sistema Login MVC segue a seguinte estrutura de diretórios:


sistema-login-mvc
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           ├── controllers
│   │   │           │   └── LoginController.java
│   │   │           ├── models
│   │   │           │   └── User.java
│   │   │           └── views
│   │   │               └── LoginView.java
│   │   └── resources
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── ...
├── pom.xml
└── README.md


- O diretório `src/main/java` contém os arquivos Java relacionados ao projeto principal, incluindo os pacotes `controllers`, `models` e `views`. O `LoginController.java` é responsável por controlar a lógica de negócio do sistema de login, o `User.java` representa o modelo de usuário e o `LoginView.java` é a interface de usuário para o login.
- O diretório `src/test/java` contém os arquivos de teste para o projeto (opcional).
- O arquivo `pom.xml` é o arquivo de configuração do Maven que define as dependências e as configurações do projeto.

## Contribuição

Se você quiser contribuir para este projeto, sinta-se à vontade para abrir uma solicitação de pull. Ficarei feliz em analisar suas contribuições.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
