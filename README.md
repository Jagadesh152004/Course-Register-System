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
![Home Page](<img width="1920" height="1000" alt="Screenshot 2026-06-16 101258" src="https://github.com/user-attachments/assets/f54e7709-46bf-47cb-a7e7-8e828c93b0ed" />)

### Course Registration
![Course](<img width="1920" height="997" alt="Screenshot 2026-06-16 161657" src="https://github.com/user-attachments/assets/850bf949-5783-47e4-a653-7bba225631c0" />)

### Enrolled Courses
![Endrolled Page](<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/daaea693-0686-4645-b83f-2fc57ff6ee41" />)

### Register Page
![Register Page](<img width="1920" height="986" alt="Screenshot 2026-06-16 162457" src="https://github.com/user-attachments/assets/0e7c540f-92d4-4434-9e08-7ed59bd4cc37" />)

---

## 👨‍💻 Author

**Jagadesh**

GitHub:
https://github.com/Jagadesh152004

---

## 📜 License

This project is developed for educational and portfolio purposes.
