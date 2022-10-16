package ss5_static.Bt2_AccessModifier;

public class Main {
    public static void main(String[] args) {
        Student bt2_student = new Student("Hung", "C02");
        System.out.println(bt2_student.toString());
            bt2_student.setName("Trung");
            bt2_student.setClasses("C03");
        System.out.println(bt2_student.toString());
    }
}
