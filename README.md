# 📚 Library Management Software

A **CLI-based Library Management System** built in Java to handle common library operations such as adding, removing, updating, viewing, issuing, returning, and searching books.  
Supports multiple user roles (**Admin** and **Student**) with separate functionalities.  

---

## 🚀 Features

### 🔑 User Roles
- **Admin**
  - Add new books to the library
  - Update book details (title, author, category, etc.)
  - Remove books
  - View all available books
- **Student**
  - Search books
  - Issue and return books
  - View borrowed books

### 🔍 Search Functionality
- Search by **Book ID**
- Search by **Book Name**
- Search by **Author Name**
- Search by **Category**

---

## 🗂️ Project Structure

```
Library Management System/
│── src/
│   └── com.library.classes/
│       ├── Admin.java
│       ├── AdminFunctionality.java
│       ├── Book.java
│       ├── BookCategory.java
│       ├── Library.java
│       ├── MainClass.java   <-- Entry Point
│       ├── Student.java
│       ├── StudentFunctionality.java
│       └── UserInput.java
│
└── distribution/
    └── LibraryManagementSoftware.jar   <-- Executable JAR
```

---

## ⚡ Getting Started

### Prerequisites
- Install [Java JDK 21+](https://www.oracle.com/java/technologies/javase-downloads.html)

### Clone Repository
```sh
git clone https://github.com/pritiranjan-01/Library-Management-Software.git
cd Library-Management-Software/Library\ Management\ System/distribution
```

### Run JAR
```sh
java -cp LibraryManagementSoftware.jar com.library.classes.MainClass
```

---

## 📦 Distribution
The compiled **JAR file** is available here:  
➡️ [LibraryManagementSoftware.jar](https://github.com/pritiranjan-01/Library-Management-Software/blob/main/Library%20Management%20System/distribution/LibraryManagementSoftware.jar)

You can download and run it directly without needing the source code.

---

## 🛠️ Tech Stack
- **Language:** Java  
- **Paradigm:** Object-Oriented Programming (OOP)  
- **Type:** CLI (Command Line Interface)  

---

## 🎯 Future Improvements
- Add database support (MySQL/PostgreSQL) for persistent storage

---

## 👨‍💻 Author
Developed by [**Pritiranjan Mohanty**](https://github.com/pritiranjan-01)  

---
