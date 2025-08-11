# ===== Stage 1: Build the app =====
FROM eclipse-temurin:21-jdk AS builder

# Set working directory
WORKDIR /app

# Copy Maven wrapper and pom.xml first (for better caching)
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn

# Download dependencies (cached unless pom.xml changes)
RUN ./mvnw dependency:go-offline

# Copy source code
COPY src src

# Package the application (skip tests for faster build)
RUN ./mvnw clean package -DskipTests

# ===== Stage 2: Run the app =====
FROM eclipse-temurin:21-jdk-alpine

# Set working directory
WORKDIR /app

# Copy only the built jar from the builder stage
COPY --from=builder /app/target/*.jar app.jar

# Expose port (Render will map this to $PORT)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
