package com.example.product2.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 5, max = 50, message = "name phai tu 5 den 50 ky tu")
    private String name;
    @Min(100000)
    private double price;
    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date beginDate;
    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date endDate;
    @NotBlank
    private String status;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;

    public Product() {
    }

    public Product(Long id, String name, double price, Date beginDate, Date endDate, String status, Category category) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
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

    public boolean isEndDateAfterBeginDate() {
        return endDate.after(beginDate);
    }
}
