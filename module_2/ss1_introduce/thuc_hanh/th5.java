import java.util.Scanner;
public class th5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight (in kilogram):");
        weight = scanner.nextDouble();

        System.out.print("Your height (in meter):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}

//public class th5 {
//    public static void main(String[] args) {
//        System.out.println("check BMI");
//        Scanner scanner = new Scanner(System.in);
//        double bmi, weight, height;
//        System.out.println("enter the weight: ");
//        weight = scanner.nextDouble();
//        System.out.println("enter the height: ");
//        height = scanner.nextDouble();
//        bmi = weight / Math.pow(height, 2);
//
//        if(bmi < 18.5) {
//            System.out.println("underweight");
//        } else if(bmi < 25) {
//                System.out.println("normal");
//            } else if(bmi < 30) {
//                    System.out.println("overweight");
//                } else {
//                    System.out.println("obese");
//                }
//    }
//}
