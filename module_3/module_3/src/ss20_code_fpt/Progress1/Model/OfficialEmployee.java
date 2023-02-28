package ss20_code_fpt.Progress1.Model;

public class OfficialEmployee extends Employee{
    private double basicSalary;
    private double levelSalary;

    public OfficialEmployee() {
    }

    public OfficialEmployee(double basicSalary, double levelSalary) {
        this.basicSalary = basicSalary;
        this.levelSalary = levelSalary;
    }

    public OfficialEmployee(String name, String address, int age, double basicSalary, double levelSalary) {
        super(name, address, age);
        this.basicSalary = basicSalary;
        this.levelSalary = levelSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getLevelSalary() {
        return levelSalary;
    }

    public void setLevelSalary(double levelSalary) {
        this.levelSalary = levelSalary;
    }

    @Override
    public String toString() {
        return "OfficialEmployee{" +
                "name='" + this.getName() + '\'' +
                ", totalSalary=" + this.totalSalary() +
                '}';
    }

    @Override
    public double totalSalary() {
        return this.basicSalary * this.levelSalary;
    }
}
