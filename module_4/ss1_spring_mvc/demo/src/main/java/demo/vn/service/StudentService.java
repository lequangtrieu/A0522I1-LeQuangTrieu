package demo.vn.service;

import demo.vn.model.Student;

import java.util.List;

public interface StudentService {
    void create(Student student);
    void delete(Student student);
    void update(Student student);
    Student findById(String id);
    List<Student> findAll();
}
