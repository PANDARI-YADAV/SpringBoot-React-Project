# 💼 Job Application

A backend project built using **Spring Boot**, **Spring Data JPA**, and **PostgreSQL**, focused on mastering CRUD operations and RESTful API development. This project manages job listings with functionality to create, read, update, delete, and search jobs.

---

## 🎯 Project Objective

This project is designed to improve backend development skills using Spring Boot, by implementing a RESTful API with full CRUD capabilities and database integration.

---

## 🛠️ Technologies Used
- **Frontend:** React.js
- **Backend:** Spring Boot
- **ORM:** Spring Data JPA
- **Database:** PostgreSQL
- **API Style:** RESTful (using `@RestController`, `@GetMapping`, `@PostMapping`, etc.)


---

## 📦 Features

- ✅ **Add Job**
  - Create a new job post with the following fields:  
    `id`, `role`, `requiredSkill`, `description`, `experienceYears`

- 📝 **Edit Job**
  - Update existing job details using `PUT` request

- ❌ **Delete Job**
  - Delete a job post by `id`

- 🔍 **Search Jobs**
  - Search for jobs using a keyword (such as role or skill)

- 📋 **View All Jobs**
  - Retrieve a list of all job posts from the database

---

## 🗃️ Sample API Endpoints

| Method | Endpoint                    | Description            |
|--------|-----------------------------|------------------------|
| GET    | `/jobPosts`                 | Get all jobs           |
| POST   | `/jobPosts`                 | Add a new job          |
| PUT    | `/jobPosts/{id}`            | Update a job by ID     |
| DELETE | `/jobPosts/{id}`            | Delete a job by ID     |
| GET    | `/jobPosts/search/{keyword}`| Search jobs by keyword |

---

## ⚙️ How to Run the Backend

1. **Clone the repo**
   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   cd backend
