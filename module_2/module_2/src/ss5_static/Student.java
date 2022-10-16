package ss5_static;

public class Student {
    private int roll;
    private String name;
    private static String college = "BBDIT";

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(roll + " - " + name + " - " + college);
    }
}
