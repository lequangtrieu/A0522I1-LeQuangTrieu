package ss22_case_study.Test;

import java.io.*;
import java.util.*;

public class Student {
    private static final Scanner input = new Scanner(System.in);
    private static Map<Student, Integer> studentMap = new LinkedHashMap<>();
    private String id;
    private String name;
    private String age;


    public Student() {
    }

    public Student(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + age;
    }

    private static Student infoStudent() {
        System.out.println("enter the EmployeeId: ");
        String id = input.nextLine();
        System.out.println("enter the name: ");
        String name = input.nextLine();
        System.out.println("enter the age: ");
        String age = input.nextLine();
        Student student = new Student(id, name, age);
        return student;
    }

    public static void main(String[] args) throws IOException {
        Student student1 = new Student("abc", "abc", "abc");
        Student student4 = new Student("abc", "abc", "abc");
        Student student2 = new Student("xyz", "xyz", "xyz");
        Student student3 = new Student("3", "3", "3");
        studentMap.put(student1, 1);
        studentMap.put(student3, 5);
        studentMap.put(student4, 1);

        FileWriter fileWriter = new FileWriter("D:\\CODEGYM\\module_2\\module_2\\src\\ss22_case_study\\Test\\test.csv");
        BufferedWriter bw = new BufferedWriter(fileWriter);
//        bw.write("abc");


        Set<Student> students = studentMap.keySet();
        for (Student student :
                students) {
            bw.write(student + "," + studentMap.get(student));
            bw.write("\n");
            System.out.println(student + "," + studentMap.get(student));
        }
        bw.close();
//
//        for (int i = 0; i < studentMap.size(); i++) {
//            System.out.println("Student = " + studentMap.values() + " : " + studentMap.get(student));
//        }

//        System.out.println(studentMap);
//        FileWriter fileWriter = new FileWriter("D:\\CODEGYM\\module_2\\module_2\\src\\ss22_case_study\\Test\\test.csv");
//        BufferedWriter bw = new BufferedWriter(fileWriter);
//        bw.write(studentMap.toString());
//        bw.close();
    }



}
