//package jdbcConnectBasic;
//
//import java.sql.*;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class DatabaseConnection {
//    // Database credentials
//    private static final String URL = "jdbc:mysql://localhost:3306/practice";
//    private static final String USER = "root";
//    private static final String PASSWORD = "onkar";
//
//    // Static method to establish and return a database connection
//    public static Connection getConnection() throws SQLException {
//        return DriverManager.getConnection(URL, USER, PASSWORD);
//    }
//}
