# Technical Test - Pet Store API

## 1. Project Setup

Project created from [https://start.spring.io](https://start.spring.io)

- **Build tool:** Gradle - Groovy
- **Language:** Java
- **Spring Boot version:** 3.2.7
- **Packaging:** Jar
- **Java version:** 17
- **Dependencies:** Spring Web

## 2. Import & Build

- Download the project and import it into IntelliJ IDEA.
- Once imported, execute the Gradle commands needed to download the dependencies and build the project.

## 3. Folder Structure

Create a folder structure that organizes the code as follows:

- **Controller** — Classes to define REST APIs
- **Service** — Classes to implement the business logic
- **Client** — Classes to connect to third-party APIs
- **Model** — Classes to hold data in objects

## 4. GET Endpoint

Develop the following REST API:

```
GET /api/pet/{petId}
```

- **Input parameters:** `petId` — Path parameter
- **Output parameters:** `id`, `name`, `status`

## 5. External API Consumption (GET)

To obtain the data that the `GET /api/pet/{petId}` endpoint returns, consume the following external API:

- `GET /pet/{petId}` from [Petstore Swagger](https://petstore.swagger.io/#/)

## 6. Service Layer (GET)

Develop a Service layer that prints the obtained data to the console before returning it as the API response.

## 7. Test the GET Endpoint

Execute and test the project.

## 8. POST Endpoint

Develop the following REST API:

```
POST /api/pet
```

- **Input parameters:** `id`, `status`, `name`
- **Output parameters:** `transactionId`, `dateCreated`, `status`, `name`

## 9. External API Consumption (POST)

The data must be saved in an external system. Consume the following external API:

- `POST /pet` from [Petstore Swagger](https://petstore.swagger.io/#/)

## 10. Service Layer (POST)

Develop a Service layer that:

- Prints the obtained information to the console before returning it as the API response.
- Generates the response field `transactionId` with a **UUIDv4** format.
- Generates the response field `dateCreated` using the **current system date**.

## 11. Test the POST Endpoint

Execute and test the project.