package model;

import java.util.Date;

public class Product {
    private int id;
    private String name;
    private String price;
    private String dateRelease;
    private String status;
    private int categoryId;

    public Product() {
    }

    public Product(int id, String name, String price, String dateRelease, String status, int categoryId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.dateRelease = dateRelease;
        this.status = status;
        this.categoryId = categoryId;
    }

    public Product(String name, String price, String dateRelease, String status, int categoryId) {
        this.name = name;
        this.price = price;
        this.dateRelease = dateRelease;
        this.status = status;
        this.categoryId = categoryId;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(String dateRelease) {
        this.dateRelease = dateRelease;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
