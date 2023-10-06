package service;

import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private static final String SELECT_ALL_STUDENT = "select * from student";
    @Override
    public void add(Student student) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void searchById(int id) {

    }

    @Override
    public List<Student> getAllList() {
        List<Student> list = new ArrayList<>();

        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_STUDENT);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                String dob = resultSet.getString("dateOfBirth");

                Student student = new Student(id, name, gender, dob);
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }
}
