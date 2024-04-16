package com.example.furama_backend.model.customer;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customer_type")
public class CustomerType {
    @Id
    @Column(name = "customer_type_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer customerTypeId;
    private String customerTypeName;

    @JsonBackReference
    @OneToMany(mappedBy = "customerType", fetch = FetchType.LAZY)
    private List<Customer> customerList;

    public CustomerType() {
    }

    public CustomerType(Integer customerTypeID, String customerTypeName) {
        this.customerTypeId = customerTypeID;
        this.customerTypeName = customerTypeName;
    }

    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Integer customerTypeID) {
        this.customerTypeId = customerTypeID;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
