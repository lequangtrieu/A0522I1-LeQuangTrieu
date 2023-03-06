package demo.vn.repository;

import demo.vn.model.Student;

import java.util.List;

public interface StudentRepository {
    void create(Student student);
    void delete(Student student);
    void update(Student student);
    Student findById(String id);
    List<Student> findAll();
}
