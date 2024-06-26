package DTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String jdbcURL = "jdbc:sqlserver://";
    private static final String HOST = "QUANG-TRIEU\\QUANG_TRIEU";
    private static final String PORT = "1433";
    private static final String DATABASE = "databaseName=product_management_vku_2";
    private static final String USER_NAME = "sa";
    private static final String PASSWORD = "12345678";

    private static final String PROPERTIES = "encrypt=true;trustServerCertificate=true;";

    private static Connection connection;


    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //map DRIVER
            connection = DriverManager.getConnection(jdbcURL + HOST + ":" + PORT + ";" + DATABASE + ";" + PROPERTIES, USER_NAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
