package ss20_code_fpt.Week_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
    private static final Scanner input = new Scanner(System.in);
    private String name;
    private int age;
    private String address;
    private int salary;
    private double level_salary;

    public Employee() {
    }

    public Employee(String name, int age, String address, int salary, double level_salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.level_salary = level_salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getLevel_salary() {
        return level_salary;
    }

    public void setLevel_salary(double level_salary) {
        this.level_salary = level_salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", level_salary=" + level_salary +
                '}';
    }

    public Employee infoEmployee() {
        List<Employee> arr = new ArrayList<>();
        System.out.println("name: ");
        String name = input.nextLine();
        System.out.println("age:");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("address:");
        String address = input.nextLine();
        System.out.println("salary:");
        int salary = Integer.parseInt(input.nextLine());
        System.out.println("level_salary:");
        double level_salary = Double.parseDouble(input.nextLine());
        Employee employee = new Employee(name, age, address, salary, level_salary);
        return employee;
    }


}
