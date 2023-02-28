package ss20_code_fpt.Lab_EduNext;

import java.util.Scanner;

public class Student {
    private static final Scanner input = new Scanner(System.in);
    private String name;
    private double score;

    private String level() {
        if (score >= 9) {
            return "A";
        } else if (score >= 8) {
            return "B";
        } else if (score >= 7) {
            return "C";
        } else if (score >= 6) {
            return "D";
        } else {
            return "F";
        }
    }

    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String output() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score + '\'' +
                ", level=" + level() +
                '}';
    }

    public void input() {
        System.out.println("enter name:");
        name = input.nextLine();
        System.out.println("enter score:");
        score = Double.parseDouble(input.nextLine());
    }

    public static void main(String[] args) {
        Student student = new Student("Trieu", 9.5);
        System.out.println(student.output());
        Student student2 = new Student();
        student2.input();
        System.out.println(student2.output());
    }
}
