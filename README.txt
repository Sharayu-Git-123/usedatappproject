# UserDatabaseApp Maven Project

## How to Run

1. Make sure MySQL is installed and running on localhost:3306.
2. Create the `userdb` database in MySQL Workbench or CLI:
   CREATE DATABASE userdb;

3. Update `DB_PASSWORD` in `TestDBConnection.java` with your real MySQL password.
4. Open the project in Eclipse or run from terminal:

   mvn compile
   mvn exec:java -Dexec.mainClass=TestDBConnection

## Maven will auto-download the MySQL Connector/J.