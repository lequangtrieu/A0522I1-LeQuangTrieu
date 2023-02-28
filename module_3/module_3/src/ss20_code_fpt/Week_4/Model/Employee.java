package ss20_code_fpt.Week_4.Model;

import java.time.LocalDate;

public class Employee {
    private String id;
    private String lastname;
    private String firstname;
    private LocalDate birthday;
    private double amountDayOfWork;

    public Employee() {
    }

    public Employee(String id, String lastname, String firstname, LocalDate birthday, double amountDayOfWork) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.birthday = birthday;
        this.amountDayOfWork = amountDayOfWork;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public double getAmountDayOfWork() {
        return amountDayOfWork;
    }

    public void setAmountDayOfWork(double amountDayOfWork) {
        this.amountDayOfWork = amountDayOfWork;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", birthday=" + birthday +
                ", amountDayOfWork='" + amountDayOfWork + '\'' +
                '}';
    }
}
