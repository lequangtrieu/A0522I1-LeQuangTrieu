package model;

public class Address {
    private String id;
    private String streetAddress;
    private String city;
    private String zipCode;

    public Address() {
    }

    public Address(String id, String streetAddress, String city, String zipCode) {
        this.id = id;
        this.streetAddress = streetAddress;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return
                " streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'';
    }
}
