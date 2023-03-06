package ss20_code_fpt.Assignment.model;

public class DepartmentManager extends Staff{
    private int managerSalary;

    public DepartmentManager() {
    }

    public DepartmentManager(int managerSalary) {
        this.managerSalary = managerSalary;
    }

    public DepartmentManager(String id, String name, int age, String address, String email, int salary, int managerSalary) {
        super(id, name, age, address, email, salary);
        this.managerSalary = managerSalary;
    }

    public DepartmentManager(String staffType, String id, String name, int age, String address, String email, int salary, int managerSalary) {
        super(staffType, id, name, age, address, email, salary);
        this.managerSalary = managerSalary;
    }

    public int getManagerSalary() {
        return managerSalary;
    }

    public void setManagerSalary(int managerSalary) {
        this.managerSalary = managerSalary;
    }

    @Override
    public String toString() {
        return "DepartmentManager{" +
//                "staffType='" + this.getStaffType() + '\'' +
                "id='" + this.getId() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", address='" + this.getAddress() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", salary=" + this.getSalary() +
                ", managerSalary=" + managerSalary +
                ", totalIncome=" + this.totalIncome() +
                ", incomeTax=" + this.incomeTax() +
                '}';
    }

    @Override
    public int totalIncome() {
        return this.getSalary() + this.managerSalary;
    }

    @Override
    public double incomeTax() {
        return super.incomeTax();
    }

    @Override
    public String infoWriteCSV() {
        return super.infoWriteCSV()
                + "," + this.getManagerSalary();
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
