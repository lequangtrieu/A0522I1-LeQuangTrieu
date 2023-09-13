package com.example.demo_create_list.service;

import com.example.demo_create_list.model.Student;

import java.util.List;

public interface StudentService {
    void add(Student student);
    void deleteById(int id);
    void update(Student student);
    void searchById(int id);

    Integer getList();

    Student getStudent(int id);

    List<Student> getAllList();
}
