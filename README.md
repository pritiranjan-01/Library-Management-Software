# 📚 CLI Library Management System  

A simple **Java-based CLI project** to manage library operations such as **Add, Remove, Update, View, Issue, Return, and Search Books**. This project demonstrates **Object-Oriented Programming (OOP) principles** and uses the **Collections framework** to efficiently manage data.  

---

## 🚀 Features  
- ➕ **Add Books** – Add new books with ID, title, author, and category  
- ✏️ **Update Books** – Modify book details like title, author, or category  
- ➖ **Remove Books** – Delete books from the library by ID  
- 👀 **View Books** – Display all available books  
- 📖 **Issue Books** – Students can borrow books  
- 🔄 **Return Books** – Students can return borrowed books  
- 🎓 **Student Management** – Register and manage students  
- 🔍 **Search Books**  
  - Search by **Book Name**  
  - Search by **Author**  
  - Search by **Book ID**  
  - Search by **Category**  
- 🖥 **CLI Menu** – Interactive, user-friendly console-based interface  

---

## 👥 User Types  
- **👨‍💼 Admin**  
  - Add, Update, Remove Books  
  - View all books  
  - Manage student records  
  - View issued/returned books  

- **🎓 Student**  
  - Search books by name, author, ID, or category  
  - Issue and return books  
  - View available books  

---

## 🛠 Tech Stack  
- **Language**: Java (Core)  
- **Concepts**: Object-Oriented Programming (OOP)  
- **Data Structures**: Java Collections (ArrayList, HashMap)  
- **Interface**: Command-Line Interface (CLI)  

---

## 📂 Project Structure  
Library-Management-Software/
│── Library Management System/
│ ├── src/
│ │ └── com/library/classes/
│ │ ├── Admin.java
│ │ ├── AdminFunctionality.java
│ │ ├── Book.java
│ │ ├── BookCategory.java
│ │ ├── Library.java
│ │ ├── MainClass.java
│ │ ├── Student.java
│ │ ├── StudentFunctionality.java
│ │ └── UserInput.java
│ ├── distribution/
│ │ └── LibraryManagementSoftware.jar
│── README.md


---

## ▶️ Run from Source  

1. Clone the repository:  
   ```bash
   git clone https://github.com/pritiranjan-01/Library-Management-Software.git
   cd "Library-Management-Software/Library Management System"
2.Compile the project:
   javac -d bin src/com/library/classes/*.java

3.Run the program:
   java -cp bin com.library.classes.MainClass

# Download the ready-to-use JAR
wget https://github.com/pritiranjan-01/Library-Management-Software/raw/main/Library%20Management%20System/distribution/LibraryManagementSoftware.jar

# Run the application
java -jar LibraryManagementSoftware.jar

📦 Run Using JAR

You can directly download and run the compiled JAR file without compiling the source.
# Download the ready-to-use JAR
wget https://github.com/pritiranjan-01/Library-Management-Software/raw/main/Library%20Management%20System/distribution/LibraryManagementSoftware.jar

# Run the application
java -jar LibraryManagementSoftware.jar

👨‍💻 Author
Pritiranjan Mohanty
