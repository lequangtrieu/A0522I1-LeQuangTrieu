package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
    void create(Student student);

    void update(Student student);

    void delete(String id);

    List<Student> findAll();

    Student findById(String id);
}
