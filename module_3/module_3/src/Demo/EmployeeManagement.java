package Demo;

import java.util.*;

public class EmployeeManagement {
    private static final Scanner input = new Scanner(System.in);
    private static ArrayList<Employee> arr = new ArrayList<>();
    private static Employee employee = new Employee();


    public static void main(String[] args) {
        while (true) {
            Menu.menu();
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    arr.add(employee.infoEmployee());
                    break;
                case 2:
                    for (int i = 0; i < arr.size(); i++) {
                        System.out.println(arr.get(i).toString());
                    }
                    break;
                case 3:
                    System.out.println("enter the index of the people you wanna calculate salary:");
                    int index = Integer.parseInt(input.nextLine());
                    double total = arr.get(index).getSalary() * arr.get(index).getLevel_salary();
                    System.out.println(total);
                    break;
                case 4:
                    Employee tmp;
                    for (int i = 0; i < arr.size() - 1; i++) {
                        for (int j = 0; j < arr.size(); j++) {
                            if (arr.get(i).getName().compareTo(arr.get(j).getName()) < 0) {
                                tmp = arr.get(i);
                                arr.set(j, arr.get(i));
                                arr.set(i, tmp);
                            }
                        }
                    }
                    for (int i = 0; i < arr.size(); i++) {
                        System.out.println(arr.get(i).getName());
                    }
                    break;
                case 5: System.exit(5);
                default:
                    System.out.println("Invalid");
            }
        }

    }
}
