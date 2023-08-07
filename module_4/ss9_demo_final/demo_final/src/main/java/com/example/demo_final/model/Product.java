package com.example.demo_final.model;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "nvarchar(100)")
    @NotBlank(message = "Name không được để trống")
    private String name;
//    @Min(value = 1, message = "Giá bắt đầu phải là số và khng được < 100000vnd")
    @NotBlank(message = "Giá không được để trống")
    private double beginPrice;
    @Column(columnDefinition = "nvarchar(100)")
    @NotBlank(message = "Status không được để trống")
    private String status;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;

    public Product() {
    }

    public Product(int id, String name, double beginPrice, String status, Category category) {
        this.id = id;
        this.name = name;
        this.beginPrice = beginPrice;
        this.status = status;
        this.category = category;
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

    public double getBeginPrice() {
        return beginPrice;
    }

    public void setBeginPrice(double beginPrice) {
        this.beginPrice = beginPrice;
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
