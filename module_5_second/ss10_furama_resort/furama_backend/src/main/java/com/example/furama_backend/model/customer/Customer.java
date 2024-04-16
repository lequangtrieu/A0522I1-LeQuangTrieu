package com.example.furama_backend.model.customer;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer customerId;
    private String name;
    private Date birthday;
    private Boolean gender;
    private String idCard;
    private String phone;
    private String email;
    private String address;
//    @ManyToOne(cascade = CascadeType.REMOVE)
// không nên dùng cacade remove ở đây, thường thì dùng ở OneToMany, vì nếu xóa customerType thì nó sẽ xóa hết tất cả Customer có customerType đó, hoặc xóa customer thì sẽ xóa hết tất cả hợp đồng của KH đó
    @ManyToOne
    @JoinColumn(name = "customer_type_id", referencedColumnName = "customer_type_id")
    private CustomerType customerType;

    public Customer() {
    }

    public Customer(Integer customerId, String name, Date birthday, Boolean gender, String idCard, String phone, String email, String address, CustomerType customerType) {
        this.customerId = customerId;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", idCard='" + idCard + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", customerType=" + customerType +
                '}';
    }
}
