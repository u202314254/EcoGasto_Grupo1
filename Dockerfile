# Etapa de build con Maven
FROM maven:3.9.9-eclipse-temurin-24 AS build

WORKDIR /app

# Copiamos el pom.xml y descargamos dependencias
COPY pom.xml ./pom.xml
RUN mvn dependency:go-offline

# Copiamos todo el código fuente y demás archivos necesarios
COPY src ./src

# Ahora sí construimos el jar
RUN mvn clean package -DskipTests

# Imagen final con solo Java (más liviana)
FROM eclipse-temurin:24-jdk-alpine
WORKDIR /app

# Copiamos el jar desde la etapa de build
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]

