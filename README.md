 📚 Digital Library Book Management System

A Spring Boot application for managing a Digital library Management system, integrated with MySQL and Dockerized for easy deployment.

---

1. Prerequisites

Ensure you have the following installed:

- IntelliJ IDEA (For development) - [Download](https://www.jetbrains.com/idea/download/)
- JDK 17+ (For running Spring Boot) - [Download](https://adoptium.net/)
- Maven (For dependency management) - [Download](https://maven.apache.org/download.cgi)
- MySQL 8.0+ (For database) - [Download](https://dev.mysql.com/downloads/)
- Docker & Docker Compose (For containerization) - [Download](https://www.docker.com/products/docker-desktop)

---

 2. Project Setup

1. Clone the Repository

git clone [https://github.com/harsha-jain/Digital_Library_Book_Management_System.git]
cd DigitalLibraryBookManagementSystem

 2.Configure MySQL (If Running Locally)
Start MySQL service.
Open MySQL CLI or a GUI like MySQL Workbench and create a database:


CREATE DATABASE libraryd_b;
Update src/main/resources/application.properties:

application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/librarydb
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update

 3. Docker Setup
To run the application using Docker, follow these steps:
   1. Build the JAR File
      sh
      mvn clean package -DskipTests
   2. Create & Run Docker Containers
      docker-compose up -d
   3. Verify Running Containers
      docker ps

4. API Endpoints
 Book Management APIs
HTTP Method	Endpoint	Description
GET	/api/books	Get all books
GET	/api/books/{id}	Get book by ID
POST	/api/books	Add a new book
PUT	/api/books/{id}	Update book details
DELETE	/api/books/{id}	Delete a book

5.Start the Application Locally
Application will run at http://localhost:8080

6.Test APIs Using Postman
GET http://localhost:8080/api/books

7.. Stopping the Application
  If using Docker, stop the containers:
  docker-compose down

8. For future implementaion we can follow these steps:
- Add more API documentation (Swagger).
- Deploy to AWS or Kubernetes.
- Integrate authentication (JWT).
