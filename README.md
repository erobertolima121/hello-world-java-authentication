# HelloWorld Authorization

Uma aplicação simples utilizando JAVA, MAVEN e Spring Boot Security.

Comandos:
--------
    mvn clean package
    
Como utilizar:
--------
    - Executar HelloWorldAuthentication para subir a aplicação (porta 8080)
    - Utilizar a rota http://localhost:8080/user (POST) passando o usuário e senha como parametros no body (x-wwww-form-urlencoded) para obter o token de retorno
    - Executar a rota http://localhost:8080/hello (GET) passando o token Bearer obtido como Authorization