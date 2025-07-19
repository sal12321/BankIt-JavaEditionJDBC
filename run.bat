@echo off
javac -d . src\com\banking\BankingApp.java
java -cp ".;mysql-connector-j-9.3.0.jar" com.banking.BankingApp
pause
rem This script compiles the BankingApp Java file and runs it with the MySQL connector.
rem Ensure that the MySQL connector JAR file is in the same directory as this script.