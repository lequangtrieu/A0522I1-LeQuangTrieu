package ss20_code_fpt.Progress1.Model;

public class SaleEmployee extends Employee{
    private double allowance;
    private double sales;
    private double commission;

    public SaleEmployee() {
    }

    public SaleEmployee(double allowance, double sales, double commission) {
        this.allowance = allowance;
        this.sales = sales;
        this.commission = commission;
    }

    public SaleEmployee(String name, String address, int age, double allowance, double sales, double commission) {
        super(name, address, age);
        this.allowance = allowance;
        this.sales = sales;
        this.commission = commission;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "SaleEmployee{" +
                "name='" + this.getName() + '\'' +
                ", totalSalary=" + this.totalSalary() +
                '}';
    }

    @Override
    public double totalSalary() {
        return this.allowance + (this.commission * this.sales);
    }
}
