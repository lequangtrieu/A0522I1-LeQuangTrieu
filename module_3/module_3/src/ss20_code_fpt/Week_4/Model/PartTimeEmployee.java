package ss20_code_fpt.Week_4.Model;

import java.time.LocalDate;
import java.util.Scanner;

public class PartTimeEmployee extends Employee{
    private static final Scanner input = new Scanner(System.in);

    private double salary;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(double salary) {
        this.salary = salary;
    }

    public PartTimeEmployee(String id, String lastname, String firstname, LocalDate birthday, double amountDayOfWork, double salary) {
        super(id, lastname, firstname, birthday, amountDayOfWork);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "id='" + getId() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                ", firstname='" + getFirstname() + '\'' +
                ", birthday=" + getBirthday() +
                ", amountDayOfWork='" + getAmountDayOfWork() + '\'' +
                "salary=" + salary +
                '}';
    }
}
