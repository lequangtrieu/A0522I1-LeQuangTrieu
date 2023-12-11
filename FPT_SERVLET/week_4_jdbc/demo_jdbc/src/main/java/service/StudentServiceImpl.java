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
    public void add(Student student) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into Student([name], gender, dateOfBirth) values (?,?,?);");

//        preparedStatement.setInt(1, student.getId());
        preparedStatement.setString(1, student.getName());
        preparedStatement.setString(2, student.getGender());
        preparedStatement.setString(3, student.getDob());
        preparedStatement.executeUpdate();
    }

    @Override
    public void deleteById(int id) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("delete from student where id = ?;");

        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    @Override
    public void update(Student student) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("update student set name = ?, gender = ?, dateOfBirth = ? where id = ?;");

        preparedStatement.setString(1, student.getName());
        preparedStatement.setString(2, student.getGender());
        preparedStatement.setString(3, student.getDob());
        preparedStatement.setInt(4, student.getId());
        preparedStatement.executeUpdate();
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
    public Student getStudentById(int id) throws SQLException {
        Student student = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from student where id = ?;");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int idStudent = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String gender = resultSet.getString("gender");
            String dob = resultSet.getString("dateOfBirth");

            student = new Student(idStudent, name, gender, dob);
        }
        return student;
    }

    @Override
    public List<Student> searchByName(String nameSearch) throws SQLException {
        List<Student> list = new ArrayList<>();

        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from student where [name] like ?;");
//        preparedStatement.setString(1, "%" + nameSearch + "%");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String gender = resultSet.getString("gender");
            String dob = resultSet.getString("dateOfBirth");

            Student student = new Student(id, name, gender, dob);
            list.add(student);
        }
        return list;
    }

    @Override
    public List<Student> searchAllField(String name, String gender, int minId, int maxId) throws SQLException {
        List<Student> list = new ArrayList<>();
        Connection connection = DBConnection.getConnection();

        String sql = "SELECT * FROM student WHERE 1=1";

        if (name != null && !name.isEmpty()) {
            sql += " AND name LIKE ?";
        }
        if (gender != null && !gender.isEmpty()) {
            sql += " AND gender = ?";
        }
        if (minId > 0 && maxId > 0) {
            sql += " AND id BETWEEN ? AND ?";
        }

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        int index = 1;

        if (name != null && !name.isEmpty()) {
            preparedStatement.setString(index++, "%" + name + "%");
        }
        if (gender != null && !gender.isEmpty()) {
            preparedStatement.setString(index++, gender);
        }
        if (minId > 0 && maxId > 0) {
            preparedStatement.setInt(index++, minId);
            preparedStatement.setInt(index, maxId);
        }

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setGender(resultSet.getString("gender"));
            student.setDob(resultSet.getString("dateOfBirth"));
            list.add(student);
        }

        return list;
    }
}
