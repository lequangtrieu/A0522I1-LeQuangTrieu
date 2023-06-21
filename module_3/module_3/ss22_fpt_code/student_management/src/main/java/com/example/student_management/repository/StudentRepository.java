package com.example.student_management.repository;

import com.example.student_management.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentRepository {
    List<Student> listStudent();

    void createStudent(Student student) throws SQLException;

    boolean update(Student student) throws SQLException;

    boolean delete(Student student) throws SQLException;

    List<Student> search(String keySearch);
}
