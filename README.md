# java-spring-healthz

[![verify](https://github.com/mateusz-uminski/java-spring-healthz/actions/workflows/verify.yaml/badge.svg)](https://github.com/mateusz-uminski/java-spring-healthz/actions/workflows/verify.yaml)

This is a lightweight Spring Boot application that provides a simple health check API endpoint. The application exposes a `/api/v1/healthz` endpoint that returns the service's health status. The endpoint can be used to verify if the application is running and operational.

Besides the README.md further documentation can be found in commits, code comments and nested README files.

Feel free to explore and copy everything you want. Enjoy!


# Prerequisites

## macOS: Export JAVA_HOME

```sh
export JAVA_HOME="$(brew --prefix openjdk@17)"
export PATH="$JAVA_HOME/bin:$PATH"
```


# Usage

## Run the application with Gradle

```sh
./gradlew bootRun
```

## Run the application as a JAR

```sh
./gradlew clean build
java -jar build/libs/java-spring-healthz.jar
```

## Run tests

```sh
./gradlew test
```

## Build a docker image

```sh
docker build -t java-spring-healthz .
```

## Run the docker image

```sh
docker run -p 8080:8080 java-spring-healthz
```

## Example query

```sh
curl -v -XGET 127.0.0.1:8080/api/v1/healthz
```
