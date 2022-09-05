package Contants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseConnection {
    public static Connection connection;
    public Connection getConnection() {
        String databaseName = "qlbanhang";
        String databaseUser = "root";
        String databasePassword = "admin";
        String url = "jdbc:mysql://localhost:3306/" + databaseName;
//	//SQL SERVER
//	private static String SQLURL="jdbc:sqlserver://localhost:1433;"
//								+"databaseName=qlbanhang;"
//								+"integratedSecurity=true";
//	private static String SQLname = "sa";
//	private static String SQLpass = "admin";
        try {
            connection = DriverManager.getConnection(url, databaseUser, databasePassword);
        } catch (SQLException e) {
            e.printStackTrace();
            e.getCause();
        }
        return connection;
    }
}
