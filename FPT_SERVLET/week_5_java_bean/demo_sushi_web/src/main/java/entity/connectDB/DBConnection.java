package entity.connectDB;

import java.sql.*;

public class DBConnection {
    private static final String jdbcURL = "jdbc:sqlserver://";
    private static final String HOST = "QUANG-TRIEU\\QUANG_TRIEU";
    private static final String PORT = "1433";
    private static final String DATABASE = "databaseName=J3.L.P0013";
    private static final String USER_NAME = "sa";
    private static final String PASSWORD = "12345678";

    private static Connection connection;


    public Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //map DRIVER
            connection = DriverManager.getConnection(jdbcURL + HOST + ":" + PORT + ";" + DATABASE, USER_NAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void close(Connection conn, PreparedStatement ps, ResultSet rs)
            throws SQLException {
        if (rs != null && !rs.isClosed()) {
            rs.close();
        }

        if (ps != null && !ps.isClosed()) {
            ps.close();
        }
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }
}
