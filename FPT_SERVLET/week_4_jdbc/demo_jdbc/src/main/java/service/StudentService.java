package service;


import model.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {
    void add(Student student) throws SQLException;
    void deleteById(int id) throws SQLException;
    void update(Student student) throws SQLException;
    List<Student> getAllList();

    Student getStudentById(int id) throws SQLException;

    List<Student> searchByName(String nameSearch) throws SQLException;

    List<Student> searchAllField(String name, String gender, int minId, int maxId) throws SQLException;

}
