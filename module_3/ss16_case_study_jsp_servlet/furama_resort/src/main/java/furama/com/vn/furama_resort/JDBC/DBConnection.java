package furama.com.vn.furama_resort.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "0981534055Trieu";
    private static final String HOST = "localhost";
    private static final String DATABASE = "cs_jsp_servlet";
    private static final String PORT = "3306";

    private static Connection connection;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //map DRIVER
            connection = DriverManager.getConnection("jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE, USER_NAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
