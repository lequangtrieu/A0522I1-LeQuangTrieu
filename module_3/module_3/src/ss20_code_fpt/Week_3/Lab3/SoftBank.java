package ss20_code_fpt.Week_3.Lab3;

import java.time.LocalDate;

public abstract class SoftBank {
    private int id;
    private String name;
    private LocalDate foundedDate;
    private String address;
    private int amountSenior;
    private int amountJunior;

    public SoftBank() {
    }

    public SoftBank(int id, String name, LocalDate foundedDate, String address, int amountSenior, int amountJunior) {
        this.id = id;
        this.name = name;
        this.foundedDate = foundedDate;
        this.address = address;
        this.amountSenior = amountSenior;
        this.amountJunior = amountJunior;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFoundedDate() {
        return foundedDate;
    }

    public void setFoundedDate(LocalDate foundedDate) {
        this.foundedDate = foundedDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAmountSenior() {
        return amountSenior;
    }

    public void setAmountSenior(int amountSenior) {
        this.amountSenior = amountSenior;
    }

    public int getAmountJunior() {
        return amountJunior;
    }

    public void setAmountJunior(int amountJunior) {
        this.amountJunior = amountJunior;
    }

    @Override
    public String toString() {
        return "SoftBank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", foundedDate=" + foundedDate +
                ", address='" + address + '\'' +
                ", amountSenior=" + amountSenior +
                ", amountJunior=" + amountJunior +
                '}';
    }

    public abstract double estimateCost();
}
