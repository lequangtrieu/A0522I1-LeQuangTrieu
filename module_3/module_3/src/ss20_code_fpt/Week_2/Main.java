//package ss20_code_fpt.Week_2;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    private static List<Employee> arr = new ArrayList<>();
//    private static Employee employee = new Employee();
//    private static final Scanner input = new Scanner(System.in);
//
//    public static void main(String[] args) {
//
//        int choice = -1;
//        while (true) {
//            System.out.println("1. Input information for 10 employees");
//            System.out.println("2. Display information for each employee");
//            System.out.println("3. Calculate the total salary.");
//            System.out.println("4. Sort Employee descending by name.");
//            System.out.println("5. Exit");
//            choice = Integer.parseInt(input.nextLine());
//
//            switch (choice) {
//                case 1:
//                    arr.add(employee.infoEmployee());
//                    break;
//                case 2:
//                    for (int i = 0; i < arr.size(); i++) {
//                        System.out.println(arr.get(i).toString());
//                    }
//                    break;
//                case 3:
//                    System.out.println("enter the index of the people you wanna find total salary:");
//                    int index = Integer.parseInt(input.nextLine());
//                    int salary_basic = 1050000;
//                    double total = salary_basic * arr.get(index).getLevel_salary();
//                    System.out.println(total);
//                    break;
//                case 4:
//                   break;
//                };
//                    break;
//                case 5: System.exit(5);
//                default:
//                    System.out.println("Invalid");
//            }
//        }
//    }
//}
