package singletonpattern;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

private Connection connection;
private Statement statement;
private final String address = "jdbc:mysql://localhost:3306/data";
private final String username = "root";
private final String password = "";
private String query;

private static Database database = new Database();

private Database() {
}

public static Database getInstance() {
    return database;
}

public void insertIntoDatabase(Person person) {
    query = "insert into person(name,age) values ('" + person.getName() + "'," + person.getAge() + ");";
    try {
        connection = DriverManager.getConnection(address, username, password);
        statement = connection.createStatement();
        int effect = statement.executeUpdate(query);
        connection.close();
        System.out.println("Data is added successfully.");
    } catch (Exception exception) {
        System.out.println("Data adding is failed.");
    }
}
}
