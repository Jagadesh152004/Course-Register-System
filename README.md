# 🎓 Course Registration System

A full-stack Course Registration System that allows students to view available courses and register for courses online.

## 🚀 Live Demo

### Frontend
https://course-register-system.vercel.app

### Backend API
https://course-register-system.onrender.com

---

## 📌 Features

- View all available courses
- Register for a course
- Store registration details in MySQL database
- Retrieve enrolled course information
- Responsive user interface
- RESTful API integration
- Cloud-hosted database

---

## 🛠️ Tech Stack

### Frontend
- HTML5
- CSS3
- JavaScript
- Fetch API
- Vercel Deployment

### Backend
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Maven

### Database
- MySQL
- Railway Cloud Database

### Deployment
- Frontend → Vercel
- Backend → Render
- Database → Railway

---

## 📂 Project Structure

```text
Course-Register-System
│
├── Frontend/
│   ├── index.html
│   ├── style.css
│   └── script.js
│
├── Backend/
│   ├── src/
│   ├── pom.xml
│   ├── mvnw
│   └── Dockerfile
│
└── README.md
```

---

## 🔗 API Endpoints

### Get Available Courses

```http
GET /courses
```

### Get Enrolled Courses

```http
GET /courses/enrolled
```

### Register for a Course

```http
POST /courses/register
```

#### Parameters

| Parameter | Type | Description |
|------------|--------|-------------|
| name | String | Student Name |
| emailID | String | Student Email |
| courseName | String | Selected Course |

---

## ⚙️ Local Setup

### Clone Repository

```bash
git clone https://github.com/Jagadesh152004/Course-Register-System.git
cd Course-Register-System
```

---

### Backend Setup

Navigate to backend folder:

```bash
cd Backend
```

Configure database properties:

```properties
spring.datasource.url=YOUR_DATABASE_URL
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

Run the application:

```bash
./mvnw spring-boot:run
```

---

### Frontend Setup

Navigate to frontend folder:

```bash
cd Frontend
```

Open:

```text
index.html
```

or use VS Code Live Server.

---

## 🌐 Deployment Architecture

```text
┌───────────────────┐
│      Vercel       │
│    Frontend UI    │
└─────────┬─────────┘
          │
          ▼
┌───────────────────┐
│      Render       │
│  Spring Boot API  │
└─────────┬─────────┘
          │
          ▼
┌───────────────────┐
│      Railway      │
│    MySQL Cloud    │
└───────────────────┘
```

---

## 🔒 Environment Variables

Backend uses environment variables for database credentials:

```properties
DB_URL
DB_USERNAME
DB_PASSWORD
```

Example:

```properties
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

---

## 📸 Screenshots

### Home Page
_Add project screenshots here_

### Course Registration
_Add project screenshots here_

### Enrolled Courses
_Add project screenshots here_

---

## 👨‍💻 Author

**Jagadesh**

GitHub:
https://github.com/Jagadesh152004

---

## 📜 License

This project is developed for educational and portfolio purposes.
