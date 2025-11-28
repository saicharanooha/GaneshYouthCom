FROM eclipse-temurin:17-jdk-jammy AS builder

WORKDIR /app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

RUN chmod +x ./mvnw
RUN ./mvnw dependency:go-offline

COPY src ./src

RUN ./mvnw clean package -DskipTests

# List what was built (for debugging)
RUN ls -la /app/target/

# Runtime stage
FROM eclipse-temurin:17-jre-jammy

WORKDIR /app

# Copy WAR file (not JAR) and rename to app.jar
COPY --from=builder /app/target/*.war app.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "app.jar"]