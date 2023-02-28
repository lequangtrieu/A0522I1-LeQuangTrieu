package ss23_demo;

public class Teacher extends Person{
    private int salary;
    private int bonus;

    public Teacher() {
    }

    public Teacher(int salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public Teacher(String name, int age, String address, int salary, int bonus) {
        super(name, age, address);
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
