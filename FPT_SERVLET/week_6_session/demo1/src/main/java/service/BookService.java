package service;

import model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookService {
    public List<Book> getAllList() {
        List<Book> list = new ArrayList<>();

        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from product");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");

                Book book = new Book(id, name);
                list.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Book findById(String id) {
        List<Book> list = this.getAllList();
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                return list.get(i);
            }
        }
        return null;
    }



}
