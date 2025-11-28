 Option 1: Use JRE instead of JDK (smaller, runtime only)
FROM eclipse-temurin:17-jre-jammy

WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
# Option 2: Use Alpine for minimal size
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]