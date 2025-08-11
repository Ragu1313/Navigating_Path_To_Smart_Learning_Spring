# Use an official OpenJDK 17 image as base

FROM eclipse-temurin:17-jdk-alpine

# Set the working directory inside the container

WORKDIR /app

# Copy your jar file into the container
# (Replace target/app.jar with your actual jar path)

COPY target/app.jar app.jar

# Expose the port your app runs on (Render uses this to map traffic)

EXPOSE 8080

# Command to run your application

ENTRYPOINT ["java", "-jar", "app.jar"]
