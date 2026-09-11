# 1. Escolhe uma imagem leve do Linux que já vem com o Java 17 instalado
FROM eclipse-temurin:17-jdk-alpine

# 2. Cria uma pasta segura dentro do container para a nossa aplicação
WORKDIR /app

# 3. Pega o arquivo .jar criado pelo Maven na esteira e joga para dentro do container
COPY target/*.jar app.jar

# 4. Diz ao container para expor a porta padrão do Spring Boot
EXPOSE 8080

# 5. O comando que o Linux vai executar para ligar o Spring Boot quando o container subir
ENTRYPOINT ["java", "-jar", "app.jar"]
