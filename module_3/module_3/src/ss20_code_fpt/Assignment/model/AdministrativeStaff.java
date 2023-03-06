package ss20_code_fpt.Assignment.model;

public class AdministrativeStaff extends Staff{

    public AdministrativeStaff() {
    }

    public AdministrativeStaff(String id, String name, int age, String address, String email, int salary) {
        super(id, name, age, address, email, salary);
    }

    public AdministrativeStaff(String staffType, String id, String name, int age, String address, String email, int salary) {
        super(staffType, id, name, age, address, email, salary);
    }

    @Override
    public String toString() {
        return "AdministrativeStaff{" +
//                "staffType='" + this.getStaffType() + '\'' +
                "id='" + this.getId() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", address='" + this.getAddress() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", salary=" + this.getSalary() +
                ", totalIncome=" + this.totalIncome() +
                ", incomeTax=" + this.incomeTax() +
                "}";
    }

    @Override
    public int totalIncome() {
        return this.getSalary();
    }

    @Override
    public double incomeTax() {
        return super.incomeTax();
    }

    @Override
    public String infoWriteCSV() {
        return super.infoWriteCSV();
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
