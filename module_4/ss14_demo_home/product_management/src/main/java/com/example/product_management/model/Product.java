package com.example.product_management.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "name must be formatted")
    private String name;
    @NotBlank
    private String price;
    @NotBlank
    private String beginDate;

    @NotBlank
    private String endDate;
    @NotBlank
    private String status;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;

    public Product() {
    }

    public Product(Long id, String name, String price, String beginDate, String endDate, String status, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.status = status;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
