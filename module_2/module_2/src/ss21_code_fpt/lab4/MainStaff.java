package ss21_code_fpt.lab4;

public class MainStaff extends Staff{
    private double salary;

    public MainStaff() {
    }

    public MainStaff(double salary) {
        this.salary = salary;
    }

    public MainStaff(int id, String name, String birthday, double amountDay, double salary) {
        super(id, name, birthday, amountDay);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "MainStaff{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", birthday='" + getBirthday() + '\'' +
                ", amountDay=" + getAmountDay() +
                ", salary=" + salary +
                '}';
    }

    @Override
    public double total() {
        return this.getAmountDay() * 2000000 * 2;
    }
}
