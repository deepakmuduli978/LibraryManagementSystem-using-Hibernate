# 📚 Library Management System using Hibernate

This project is a **Library Management System** developed using **Java and Hibernate ORM**.
It manages library operations such as storing **student details, book details, and book issue records** in a database.

The project demonstrates how **Hibernate simplifies database operations using Object Relational Mapping (ORM)**.

---

## 🚀 Features

* Add and store **Student details**
* Add and store **Book information**
* Issue books to students
* Store **book issue records**
* Database interaction using **Hibernate ORM**
* Uses **JPA annotations for entity mapping**

---

## 🛠 Technologies Used

* Java
* Hibernate ORM
* MySQL Database
* Maven
* JPA (Java Persistence API)
* JDBC

---

## 📁 Project Structure

```
LibraryManagementHibernate
│
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── example
│       │           ├── App.java
│       │           ├── student.java
│       │           ├── book.java
│       │           └── issue.java
│       │
│       └── resources
│           └── hibernate.cfg.xml
│
└── pom.xml
```

## 🗄 Database Tables

The system contains three main tables:

### 1️⃣ Student

Stores student information.

Fields:

* Student ID
* Student Name
* Email
* Department

### 2️⃣ Book

Stores book details.

Fields:

* Book ID
* Book Name
* Author
* Date of Purchase

### 3️⃣ Issue

Stores issued book records.

Fields:

* Issue ID
* Student ID
* Book ID
* Issue Date

---

## ⚙️ Hibernate Configuration

Hibernate configuration is done in **hibernate.cfg.xml**.

Example configuration:

<hibernate-configuration>
 <session-factory>

<property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property> <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/library</property> <property name="hibernate.connection.username">root</property> <property name="hibernate.connection.password">password</property>

<property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property> <property name="hibernate.hbm2ddl.auto">update</property> <property name="hibernate.show_sql">true</property>

 </session-factory>
</hibernate-configuration>

---

## ▶️ How to Run the Project

1. Clone the repository

git clone https://github.com/your-username/LibraryManagementHibernate.git

2. Open the project in **IntelliJ / Eclipse / VS Code**

3. Create a **MySQL database**

4. Update the database credentials in **hibernate.cfg.xml**

5. Run the project by executing:

App.java

---

## 🎯 Purpose of the Project

This project is created for learning:

* Hibernate ORM
* JPA Annotations
* Java Database Integration
* Backend development with Java

---

## 👨‍💻 Author

**Deepak Muduli**

**java Backend Developer**

---
