package model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainForConnectJDBC {

    public static void main(String[] args) {

        try {
            String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=StudentDB22;";

            String user = "sa";
            String pass = "12345678";

            Class.forName(driverName);

            Connection con = DriverManager.getConnection(url, user, pass);

            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM Student2022";
            ResultSet result = stmt.executeQuery(sql);

            while (result.next()) {
                String numberDB = result.getString(1).trim();
                String nameDB = result.getString(2);
                String courseDB = result.getString(3);
                // tao thanh student tam va in ra
                Student tempStudent = new Student(numberDB, nameDB, courseDB);
                System.out.println("" + tempStudent.toString());
            }

            result.close();
            stmt.close();
            con.close();



        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MainForConnectJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



}
