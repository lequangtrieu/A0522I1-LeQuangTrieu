/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.example.fix_demo.model;

/**
 *
 * @author datqu
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    StudentList studentList = new StudentList();
    //studentList.delete(1002);
    Student s = new Student(1002, "Mr B", "F", "20/05/2000");
    studentList.update(s);
    System.out.println("" + studentList.getList());
    }
}
