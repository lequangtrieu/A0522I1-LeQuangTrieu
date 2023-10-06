package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MagazinesDAO {

    public List<Magazine> getAllList() {
        List<Magazine> list = new ArrayList<>();

        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM magazine_de160447";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String id = resultSet.getString("maz_id").trim();
                String title = resultSet.getString("title").trim();
                String publisher = resultSet.getString("publisher").trim();
                String price = resultSet.getString("price").trim();

                Magazine magazine = new Magazine(id, title, publisher, price);
                list.add(magazine);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void newMagazine(Magazine magazine) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO magazine_de160447 VALUES (?,?,?,?)");
        preparedStatement.setString(1, magazine.getId());
        preparedStatement.setString(2, magazine.getTitle());
        preparedStatement.setString(3, magazine.getPublisher());
        preparedStatement.setString(4, magazine.getPrice());
        preparedStatement.executeUpdate();
    }

}
