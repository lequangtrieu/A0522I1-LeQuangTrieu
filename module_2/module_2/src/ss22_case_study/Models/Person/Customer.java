package ss22_case_study.Models.Person;

public class Customer extends Person{
    private int customerId;
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(int customerId, String customerType, String address) {
        this.customerId = customerId;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String name, String birthday, String gender, String identifyId, String phoneNumber, String email, int customerId, String customerType, String address) {
        super(name, birthday, gender, identifyId, phoneNumber, email);
        this.customerId = customerId;
        this.customerType = customerType;
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return getName()
                + "," +  getBirthday()
                + "," + getGender() + ","
                + getIdentifyId() + ","
                + getPhoneNumber()
                + "," + getEmail()
                + "," + customerId
                + "," + customerType
                + "," + address;
    }


    public String displayCustomer() {
        return "{" +
                "name='" + getName() + '\'' +
                ", birthday='" + getBirthday() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", identifyId='" + getIdentifyId() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                "customerId=" + customerId +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
