package service;

import model.Student;

import java.util.List;

public interface StudentService {
    void add();
    void deleteById();
    void update();
    List<Student> getAllList();
    Student getStudentById(String id);

    void displayList();
}
