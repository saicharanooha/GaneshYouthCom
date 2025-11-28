# Use official OpenJDK 17 slim image

FROM openjdk:17-jdk-slim-bullseye

# Set working directory inside container

WORKDIR /app

# Copy the Spring Boot JAR file into the container

COPY target/*.jar app.jar

# Expose the port your Spring Boot app runs on

EXPOSE 8080

# Run the Spring Boot application

ENTRYPOINT ["java", "-jar", "app.jar"]
