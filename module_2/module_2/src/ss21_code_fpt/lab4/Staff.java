package ss21_code_fpt.lab4;

public abstract class Staff {
    private int id;
    private String name;
    private String birthday;
    private double amountDay;

    public Staff() {
    }

    public Staff(int id, String name, String birthday, double amountDay) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.amountDay = amountDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getAmountDay() {
        return amountDay;
    }

    public void setAmountDay(double amountDay) {
        this.amountDay = amountDay;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", amountDay=" + amountDay +
                '}';
    }

    public abstract double total();
}
