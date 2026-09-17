# Placement Management System

Spring Boot + PostgreSQL training project.

## Modules from the assignment
- Student Module
- Certificate Module
- Placement Module
- College Module
- Admin Module
- User Module

The project is intentionally modular so one module can be submitted separately and all modules can later be combined.

## Stack
Java 25 | Spring Boot 3.5.6 | Spring Web | Spring Data JPA | PostgreSQL | Maven | Postman

## Run on Windows

1. Create database:
```sql
CREATE DATABASE placement_management;
```

2. Open `src/main/resources/application.properties` and replace `CHANGE_ME` with the local PostgreSQL password.

3. Run:
```powershell
mvn spring-boot:run
```

4. Server:
`http://localhost:8080`

5. Health:
`GET http://localhost:8080/api/health`

## APIs
- `/api/students`
- `/api/certificates`
- `/api/placements`
- `/api/colleges`
- `/api/admins`
- `/api/users`

Each supports GET all, GET by id, POST, PUT by id, and DELETE by id.

## Separation
For a Student-only submission, keep:
- `pom.xml`
- `src/main/resources/application.properties`
- `PlacementManagementApplication.java`
- `HealthController.java`
- `student/`

Remove the other five module folders after checking dependencies.

Never submit `.env` or `target/`.

## Clone
```powershell
git clone YOUR_REPOSITORY_URL
cd placement-management
code .
mvn spring-boot:run
```
