package model;

public class Motel {
    private int id;
    private String name;
    private String phoneNumber;
    private String dateBegin;
    private String note;
    private int idPayment;

    public Motel() {
    }

    public Motel(int id, String name, String phoneNumber, String dateBegin, String note, int idPayment) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.dateBegin = dateBegin;
        this.note = note;
        this.idPayment = idPayment;
    }

    public Motel(String name, String phoneNumber, String dateBegin, String note, int idPayment) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.dateBegin = dateBegin;
        this.note = note;
        this.idPayment = idPayment;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(String dateBegin) {
        this.dateBegin = dateBegin;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }
}
