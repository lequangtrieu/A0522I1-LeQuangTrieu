package ss22_case_study.Models.Facility;

import java.util.Objects;

public abstract class Facility {
    private String serviceName;
    private int usingArea;
    private int price;
    private int amountPeople;
    private String rentType;

    public Facility() {
    }

    public Facility(String serviceName, int usingArea, int price, int amountPeople, String rentType) {
        this.serviceName = serviceName;
        this.usingArea = usingArea;
        this.price = price;
        this.amountPeople = amountPeople;
        this.rentType = rentType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUsingArea() {
        return usingArea;
    }

    public void setUsingArea(int usingArea) {
        this.usingArea = usingArea;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmountPeople() {
        return amountPeople;
    }

    public void setAmountPeople(int amountPeople) {
        this.amountPeople = amountPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usingArea=" + usingArea +
                ", price=" + price +
                ", amountPeople=" + amountPeople +
                ", rentType='" + rentType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return usingArea == facility.usingArea && price == facility.price && amountPeople == facility.amountPeople && Objects.equals(serviceName, facility.serviceName) && Objects.equals(rentType, facility.rentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName, usingArea, price, amountPeople, rentType);
    }
}
