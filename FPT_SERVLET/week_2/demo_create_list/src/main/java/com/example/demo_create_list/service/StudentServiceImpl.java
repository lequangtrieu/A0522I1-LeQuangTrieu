package com.example.demo_create_list.service;

import com.example.demo_create_list.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private static final List<Student> list = new ArrayList<>();

    static {
        list.add(new Student(1001, "Nguyễn Trường Xuân", "M", "20/05/1999"));
        list.add(new Student(1002, "Nguyễn Thị Thanh Xuân", "F",
                "20/05/2000"));
        list.add(new Student(1003, "Nguyễn Minh Xuân", "M", "20/05/2001"));
        list.add(new Student(1004, "Nguyễn Thanh Xuân", "M", "20/05/2002"));
        list.add(new Student(1005, "Nguyễn Trường Sinh", "F", "20/05/1998"));
    }

    @Override
    public void add(Student student) {
        list.add(student);
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                break;
            }
        }
    }

    @Override
    public void update(Student student) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == student.getId()) {
                list.set(i, student);
            }
        }
    }

    @Override
    public void searchById(int id) {

    }

    @Override
    public Integer getList() {
        return list.size();
    }

    @Override
    public Student getStudent(int id) {
        return list.get(id);
    }

    @Override
    public List<Student> getAllList() {
        return list;
    }
}
