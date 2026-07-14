# Spring Boot DevOps Sample

A lightweight Spring Boot application demonstrating a simple REST service with basic health/version endpoints and a ready-to-use Maven-based DevOps setup.

## Project Summary

This repository contains a minimal Spring Boot service built with Java 21 and Maven. It is designed to showcase:

- Spring Boot web application structure
- REST controller with health check and version endpoints
- Maven build lifecycle with wrapper support
- CI/CD pipeline readiness via `Jenkinsfile`

## Why this project matters for recruiters

This repository is a good fit for evaluating:

- Java and Spring Boot fundamentals
- Maven project configuration and build tooling
- REST API implementation and controller design
- DevOps readiness through Jenkins pipeline integration
- Ability to maintain a small, clean, production-style repository

## Key Features

- `GET /` — returns a simple welcome message
- `GET /health` — returns application health status (`UP`)
- `GET /version` — returns the service version (`1.0.0`)

## Technology Stack

- Java 21
- Spring Boot 4.1
- Spring Web
- Maven
- Lombok (compile-time / optional)
- Jenkins pipeline integration with `Jenkinsfile`

## Repository Structure

- `src/main/java/com/example/spring_boot_devops/` — main application classes
- `src/main/java/com/example/spring_boot_devops/controller/` — REST controllers
- `src/test/java/com/example/spring_boot_devops/` — unit tests
- `pom.xml` — Maven build and dependency configuration
- `mvnw`, `mvnw.cmd` — Maven wrapper for consistent builds
- `Jenkinsfile` — pipeline configuration for continuous delivery

## Setup and Run Locally

### Prerequisites

- Java 21
- Git

### Build and run

```bash
./mvnw clean package
./mvnw spring-boot:run
```

The application starts on port `8080` by default.

### Verify endpoints

```bash
curl http://localhost:8080/
curl http://localhost:8080/health
curl http://localhost:8080/version
```

## Testing

Run the test suite with:

```bash
./mvnw test
```

## Notes for Recruiters

This repository demonstrates a candidate's ability to:

- Build and configure a Spring Boot web application
- Create REST endpoints and simple controller logic
- Use Maven wrapper for reproducible builds
- Organize a Java project with standard source layout
- Prepare a repository for DevOps automation and CI/CD

## Contributions

This project is a sample/demo repository and can be extended with additional features such as:

- advanced API endpoints
- database integration
- security and authentication
- containerization with Docker
- full CI/CD workflows
