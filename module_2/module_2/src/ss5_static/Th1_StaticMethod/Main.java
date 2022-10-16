package ss5_static.Th1_StaticMethod;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "An");
        Student s3 = new Student(333, "Hung");

        s1.display();
        s2.display();
        s3.display();
    }
}
