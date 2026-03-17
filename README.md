# student-service
Microservice for managing student information including registration, retrieval, and listing using Spring Boot and Spring Data JPA.

## ⚙️ Features
- Add new student
- View all students
- Get student by ID
- Update student details
- Delete student

---

## 🏗️ Tech Stack
- Spring Boot 3.5.6
- Spring Data JPA
- H2 Database
- Swagger OpenAPI
- JUnit & Mockito

---

## 🚀 Running the Service

```bash
mvn spring-boot:run

Runs on: http://localhost:8081

📄 API Endpoints
Method	Endpoint	Description
POST	/students	Add student
GET	/students	Get all students
GET	/students/{id}	Get student by ID
PUT	/students/{id}	Update student
DELETE	/students/{id}	Delete student

📘 Sample Request

{
  "studentId": "1",
  "studentName": "Laxmi",
  "grade": "12",
  "mobileNumber": "1234566",
  "schoolName": "test school"
}

Swagger UI

http://localhost:8081/swagger-ui.html
