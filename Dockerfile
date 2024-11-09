FROM gradle:8.0.2-jdk17 AS build

WORKDIR /app
COPY . .
RUN ./gradlew clean build --no-daemon


FROM openjdk:17-jdk-slim

COPY --from=build /app/build/libs/java-spring-healthz.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
