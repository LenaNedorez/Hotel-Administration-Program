# Program for hotel administration
This project is a hotel administration application developed in Java.

# Functionality
- Guest Registration: Add new guests with their contact details and stay information
- Guest Checkout: Remove guests from the system and update room status
- Room Status Tracking: View available and occupied rooms
- Room Management: Enter room information, bed types, and other features

# Technologies
- Java: Programming language
- Gradle: Project build system
- AWT/Swing: Libraries for creating a graphical interface
- MySQL: Database management system
- JDBC: Interface for interacting with databases

# Installation
1. Make sure you have Java, Gradle, and MySQL installed
2. Clone this repository
3. Create a MySQL database named “hotel_db” and import the schema from the <sql/schema.sql> file
4. Edit <src/main/resources/application.properties> file to configure the database connection settings
5. Run the application with command: <gradle run>

## ER diagram:
![ER_Diagram](https://github.com/user-attachments/assets/ff367938-5ff2-4ce9-ad48-502d694d2817)
