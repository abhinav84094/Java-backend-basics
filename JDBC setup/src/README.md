# JDBC MySQL Setup

This project demonstrates a basic JDBC connection between Java and MySQL.

---

## Objective

To understand how Java connects to a MySQL database using JDBC and executes SQL queries.

---

## Technologies Used

- Java
- JDBC
- MySQL
- IntelliJ IDEA

---

## Project Structure
```
JDBC setup/
│
└── src/
    ├── Main.java
    └── db/dbConnection.java
```


---

## What This Project Does

- Establishes connection to MySQL database
- Executes SQL statements
- Retrieves data using ResultSet
- Handles SQL exceptions

---

## Concepts Covered

- DriverManager
- Connection
- Statement
- ResultSet
- Exception Handling

---

## Database Configuration
n API that enables Java app
Make sure:

- MySQL server is running
- Database exists (e.g., `studentdb`)
- Username and password are correct in code

Example connection string:

```java
jdbc:mysql://localhost:3306/studentdb
```

Understanding the Connection String
-

The connection string has the following parts:

jdbc → Java Database Connectivity API

mysql → Database type

localhost → Database server (your own machine)

3306 → Default MySQL port number

studentdb → Name of your database

Complete Example Connection Code
```
Connection connection = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/studentdb",
    "root",
    "your_password"
);
```
Explanation:
-
DriverManager.getConnection() → Establishes a connection to the database

First parameter → Database URL

Second parameter → MySQL username

Third parameter → MySQL password

If authentication is successful, a Connection object is returned.

Steps Performed in This Project
-
Import JDBC package:  
```
import java.sql.*;
```

Establish connection using DriverManager
```
Connection connection = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/studentdb",
    "root",
    "your_password"
);
```

Create a Statement object:  
```
Statement statement = connection.createStatement();
```

Execute SQL query: 

```
ResultSet result = statement.executeQuery("SELECT * FROM students");
```

Process results:

```
while(result.next()) {
    System.out.println(result.getInt("id") + " " + result.getString("name"));
}
```

Close the connection:
```
connection.close();
```
How JDBC Works Internally
-
When the program runs:

JDBC loads the MySQL driver.

Java sends a request to the MySQL server.

MySQL verifies username and password.

If valid, a connection session is created.

SQL queries are sent through this session.

Results are returned to Java as a ResultSet.

JDBC Flow
-
```
Java Application
⬇
JDBC API
⬇
MySQL JDBC Driver
⬇
MySQL Database
```
Common Errors and Solutions
-
Access Denied for User - Check username and password.

Ensure MySQL server is running.

No Suitable Driver Found - Make sure MySQL Connector JAR is added correctly.

Unknown Database - Verify database name in connection string.


## Purpose of This Repository

The purpose of this project is to understand how backend applications communicate with relational databases using JDBC.

---
