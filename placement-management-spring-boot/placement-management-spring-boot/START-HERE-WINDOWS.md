# START HERE - WINDOWS

1. Open this folder in VS Code.
2. Check:
```powershell
java -version
mvn -version
```
3. In PostgreSQL create:
```sql
CREATE DATABASE placement_management;
```
4. Set the PostgreSQL password in:
`src/main/resources/application.properties`
5. Run:
```powershell
mvn spring-boot:run
```
6. Test:
`GET http://localhost:8080/api/health`

Example Student POST:
```json
{
  "name": "Arun Kumar",
  "email": "arun@gmail.com",
  "phone": "9876543210",
  "department": "CSE",
  "graduationYear": 2026
}
```

Hibernate creates/updates tables automatically because `spring.jpa.hibernate.ddl-auto=update` is enabled.
