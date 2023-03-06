package ss20_code_fpt.Assignment.model;

public abstract class Staff {
    private String staffType;
    private String id;
    private String name;
    private int age;
    private String address;
    private String email;
    private int salary;

    public Staff() {
    }

    public Staff(String id, String name, int age, String address, String email, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.salary = salary;
    }

    public Staff(String staffType, String id, String name, int age, String address, String email, int salary) {
        this.staffType = staffType;
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }

    @Override
    public String toString() {
        return "Staff{" +
//                "staffType='" + staffType + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

    public abstract int totalIncome();

    public double incomeTax() {
        if (this.totalIncome() < 9000000) {
            return this.totalIncome();
        } else if (this.totalIncome() < 15000000) {
            return this.totalIncome() * 0.1;
        } else {
            return this.totalIncome() * 0.12;
        }
    }

    public String infoWriteCSV() {
        return this.getStaffType()
                + "," + this.getId()
                + "," + this.getName()
                + "," + this.getAge()
                + "," + this.getAddress()
                + "," + this.getEmail()
                + "," + this.getSalary();
    }

    public String getFirstName(String name) {
        String[] arr = name.split(" ");
        return arr[arr.length - 1];
    }

    public int getIntegerId(String id) {
        String[] arr = id.split("D");
        return Integer.parseInt(arr[arr.length - 1]);
    }
}
