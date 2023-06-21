package com.example.student_management.repository;

import com.example.student_management.model.Student;

import javax.annotation.PreDestroy;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository{
    private static final String SELECT_ALL_STUDENT = "select * from student";

    private static final String CREATE_STUDENT = "insert into student values (?,?,?,?);";

    @Override
    public List<Student> listStudent() {
        List<Student> list = new ArrayList<>();

        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_STUDENT);
            ResultSet resultSet =preparedStatement.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                double average = resultSet.getDouble("average");

                Student student = new Student(id, name, email, average);
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void createStudent(Student student) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(CREATE_STUDENT);
        preparedStatement.setString(1, student.getId());
        preparedStatement.setString(2, student.getName());
        preparedStatement.setString(3, student.getEmail());
        preparedStatement.setDouble(4, student.getAverage());
        preparedStatement.executeUpdate();
    }

    @Override
    public boolean update(Student student) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Student student) throws SQLException {
        return false;
    }

    @Override
    public List<Student> search(String keySearch) {
        return null;
    }
}
