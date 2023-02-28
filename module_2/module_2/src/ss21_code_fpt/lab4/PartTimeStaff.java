package ss21_code_fpt.lab4;

public class PartTimeStaff extends Staff{

    double salary;
    double time;

    public PartTimeStaff() {
    }

    public PartTimeStaff(double salary, double time) {
        this.salary = salary;
        this.time = time;
    }

    public PartTimeStaff(int id, String name, String birthday, double amountDay, double salary, double time) {
        super(id, name, birthday, amountDay);
        this.salary = salary;
        this.time = time;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "PartTimeStaff{" +
                "salary=" + salary +
                ", time=" + time +
                '}';
    }

    @Override
    public double total() {
        return this.getAmountDay() * 1000000 * 0.5 * this.getTime();
    }


}
