package ss5_static;

public class Bt2_Access_Modifier {
    public static void main(String[] args) {
        Bt2_Student bt2_student = new Bt2_Student("Hung", "C02");
        System.out.println(bt2_student.toString());
            bt2_student.setName("Trung");
            bt2_student.setClasses("C03");
        System.out.println(bt2_student.toString());
    }
}
