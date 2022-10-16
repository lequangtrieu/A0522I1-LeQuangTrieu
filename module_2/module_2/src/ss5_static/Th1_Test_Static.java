package ss5_static;

public class Th1_Test_Static {
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
