/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.example.fix_demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author datqu
 */
public class StudentList implements Serializable {

    private ArrayList<Student> list = new ArrayList<>();

    public StudentList() {
        list.add(new Student(1001, "Nguyễn Trường Xuân", "M", "20/05/1999"));
        list.add(new Student(1002, "Nguyễn Thị Thanh Xuân", "F", "20/05/2000"));
        list.add(new Student(1003, "Nguyễn Minh Xuân", "M", "20/05/2001"));
        list.add(new Student(1004, "Nguyễn Thanh Xuân", "M", "20/05/2002"));
        list.add(new Student(1005, "Nguyễn Trường Sinh", "F", "20/05/1998"));
    }

    public ArrayList<Student> add(Student s) {
        list.add(s);
        return list;
    }

    public ArrayList<Student> delete(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
            }
        }   
        return list;
    }

    public ArrayList<Student> update(Student student) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == student.getId()) {
                list.set(i, student);
            }
        }
        return list;
    }

    public Student getStudent(int id) {
        for (Student student : list) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public ArrayList<Student> search(Predicate p) {
        ArrayList<Student> rs = new ArrayList<>();
        for (Student s : list) {
            if (p.test(s)) {
                rs.add(s);
            }
        }
        return rs;
    }

    public ArrayList<Student> searchByID(int id) {
        String idd = String.valueOf(id);
        ArrayList<Student> l = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (String.valueOf(list.get(i).getId()).contains(idd)) {
                l.add(list.get(i));
            }
        }
        return l;
    }

    public ArrayList<Student> searchByName(String name) {
        ArrayList<Student> l = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().contains(name)) {
                l.add(list.get(i));
            }
        }
        return l;
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }
}
