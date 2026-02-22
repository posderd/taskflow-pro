# TaskFlow Pro – Role-Based Smart Task Management REST API

## 📌 Overview
TaskFlow Pro is a role-based task management backend built using Spring Boot and JPA.  
It supports user management, task creation, filtering, and pagination.

This project demonstrates clean layered architecture and relational entity mapping.

---

## 🚀 Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database (In-memory)
- Maven

---

## 🏗️ Architecture
Layered Architecture:

Controller → Service → Repository → Entity

---

## 🔥 Features

- Role-based user creation (ADMIN / USER)
- Task creation linked to users
- Enum-based status and priority management
- Filtering tasks by:
  - Status
  - Priority
- Pagination support
- Relational mapping (User ↔ Task)

---

## 📡 API Endpoints

### Create User
POST `/api/users`

### Create Task
POST `/api/tasks/{userId}`

### Get All Tasks (Paginated)
GET `/api/tasks?page=0&size=5`

### Filter by Status
GET `/api/tasks/status/{status}`

### Filter by Priority
GET `/api/tasks/priority/{priority}`

---

## 🧠 Design Decisions

- Used layered architecture for separation of concerns.
- Enums stored as STRING for readability.
- Implemented pagination to simulate production-level API behavior.
- Used H2 in-memory DB for development convenience.

---

## 🔮 Future Improvements

- JWT Authentication
- Persistent Database (PostgreSQL/MySQL)
- Docker support
- Caching with Redis
- CI/CD pipeline integration

---

## 👨‍💻 Author
Howard
