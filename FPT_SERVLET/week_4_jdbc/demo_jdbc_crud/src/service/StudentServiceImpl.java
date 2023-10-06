package service;

import model.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService{
    private final Scanner input = new Scanner(System.in);
    @Override
    public void add() {

        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();

            System.out.println("enter sno:");
            String sno = input.nextLine();
            System.out.println("enter sname:");
            String sname = input.nextLine();
            System.out.println("enter scourse:");
            String scourse = input.nextLine();


            String sql = "insert into Student2022 values ('" + sno +"', '"+ sname +"', '"+scourse+"');";

            statement.executeUpdate(sql);
            System.out.println("add success!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById() {
        System.out.println("enter id you wanna delete: ");
        String sno = input.nextLine();

        boolean flag = false;
        for (int i = 0; i < this.getAllList().size(); i++) {
            if (sno.equals(this.getAllList().get(i).getNo())) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("id is not valid");
            return;
        }

        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();


            String sql = "DELETE FROM Student2022 WHERE sno = '"+sno+"';";
            statement.executeUpdate(sql);
            System.out.println("delete success");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update() {
        System.out.println("enter id you wanna update: ");
        String sno = input.nextLine();
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < this.getAllList().size(); i++) {
            if (sno.equals(this.getAllList().get(i).getNo())) {
                flag = true;
                index = i;
                break;
            }
        }

        if (!flag) {
            System.out.println("id is not valid");
            return;
        }

        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();

            System.out.println("info student:");
            System.out.println(this.getAllList().get(index));
            System.out.println("please update new info:");

            System.out.println("enter newName: ");
            String newName = input.nextLine();
            System.out.println("enter newCourse: ");
            String newCourse = input.nextLine();

            String sql = "UPDATE Student2022 SET sname = '"+newName+"', scourse = '"+newCourse+"' WHERE sno = '"+sno+"';";
            statement.executeUpdate(sql);
            System.out.println("update success");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Student> getAllList() {
        List<Student> list = new ArrayList<>();

        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM Student2022";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String sno = resultSet.getString("sno").trim();
                String sname = resultSet.getString("sname").trim();
                String scourse = resultSet.getString("scourse").trim();


                Student student = new Student(sno, sname, scourse);
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Student getStudentById(String id) {
        return null;
    }

    @Override
    public void displayList() {
        for (int i = 0; i < this.getAllList().size(); i++) {
            System.out.println(this.getAllList().get(i));
        }
    }
}
