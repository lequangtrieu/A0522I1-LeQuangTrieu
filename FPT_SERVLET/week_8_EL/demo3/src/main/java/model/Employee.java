package model;

public class Employee {
    private String id;
    private Address address;
    private Name name;

    public Employee() {
    }

    public Employee(String id, Address address, Name name) {
        this.id = id;
        this.address = address;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
