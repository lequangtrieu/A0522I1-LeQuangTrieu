package ss20_code_fpt.Week_4.Model;

import java.time.LocalDate;

public class MainEmployee extends Employee {
    private double timeOT;

    private double salary;

    public MainEmployee() {
    }

    public MainEmployee(double timeOT, double salary) {
        this.timeOT = timeOT;
        this.salary = salary;
    }

    public MainEmployee(String id, String lastname, String firstname, LocalDate birthday, double amountDayOfWork, double timeOT, double salary) {
        super(id, lastname, firstname, birthday, amountDayOfWork);
        this.timeOT = timeOT;
        this.salary = salary;
    }

    public double getTimeOT() {
        return timeOT;
    }

    public void setTimeOT(double timeOT) {
        this.timeOT = timeOT;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "MainEmployee{" +
                "timeOT=" + timeOT +
                ", salary=" + salary +
                '}';
    }
}
