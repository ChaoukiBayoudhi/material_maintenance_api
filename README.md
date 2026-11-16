# Material maintenance API

A REST API built with Spring Boot around 2 JPA entities, using PostgreSQL.

## Tech stack

- Java 23, built with Maven
- Spring Boot 3.4.1
- Spring Web (REST controllers)
- Spring Data JPA (Hibernate)
- Spring Data REST
- Lombok
- PostgreSQL driver
- Database: PostgreSQL (`maintenancedb` in `application.properties`)

## Data model

| Entity | Fields |
|---|---|
| `Materiel` | id, nom, type, statut |
| `Intervention` | id, materiel, technicien, description, date |

## REST endpoints

Found in the controllers (`MaintenanceController`):

| Method | Path |
|---|---|
| GET | `/api/materiels` |
| POST | `/api/interventions` |

## Project structure

- `com.example.material_maintenance_api`: MaterialMaintenanceApiApplication
- `com.example.material_maintenance_api.Components`: MaintenanceITDataLoader
- `com.example.material_maintenance_api.Entities`: Intervention, Materiel
- `com.example.material_maintenance_api.Enumerations`: StatutMateriel
- `com.example.material_maintenance_api.Repositories`: InterventionRepository, MaterielRepository
- `com.example.material_maintenance_api.Web`: MaintenanceController
- Tests: 1 test class

## How to run

Requirements: a JDK 23+ and Maven (or the included Maven wrapper).
Create the `maintenancedb` database and set your own username and password in `src/main/resources/application.properties`.

```bash
./mvnw spring-boot:run
```

The API then listens on `http://localhost:9995`.

---

Author: [Chaouki Bayoudhi](https://github.com/ChaoukiBayoudhi)
