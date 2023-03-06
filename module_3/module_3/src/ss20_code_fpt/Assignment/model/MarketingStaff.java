package ss20_code_fpt.Assignment.model;

public class MarketingStaff extends Staff{
    private int sales;
    private int commission;

    public MarketingStaff() {
    }

    public MarketingStaff(int sales, int commission) {
        this.sales = sales;
        this.commission = commission;
    }

    public MarketingStaff(String id, String name, int age, String address, String email, int salary, int sales, int commission) {
        super(id, name, age, address, email, salary);
        this.sales = sales;
        this.commission = commission;
    }

    public MarketingStaff(String staffType, String id, String name, int age, String address, String email, int salary, int sales, int commission) {
        super(staffType, id, name, age, address, email, salary);
        this.sales = sales;
        this.commission = commission;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "MarketingStaff{" +
//                "staffType='" + this.getStaffType() + '\'' +
                "id='" + this.getId() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", address='" + this.getAddress() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", salary=" + this.getSalary() +
                ", sales=" + sales +
                ", commission=" + commission +
                ", totalIncome=" + this.totalIncome() +
                ", incomeTax=" + this.incomeTax() +
                '}';
    }

    @Override
    public int totalIncome() {
        return this.getSalary() + this.sales + this.commission;
    }

    @Override
    public double incomeTax() {
        return super.incomeTax();
    }

    @Override
    public String infoWriteCSV() {
        return super.infoWriteCSV()
                + "," + this.getSales()
                + "," + this.getCommission();
    }

    @Override
    public String getFirstName(String name) {
        return super.getFirstName(name);
    }

    @Override
    public int getIntegerId(String id) {
        return super.getIntegerId(id);
    }
}
