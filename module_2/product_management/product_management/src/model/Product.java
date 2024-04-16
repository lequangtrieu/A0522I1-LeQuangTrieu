package model;

import java.util.Date;

public class Product {
    private int id;
    private String name;
    private float price;
    private Date dateRelease;
    private String status;
    private int categoryId;

    public Product() {
    }

    public Product(int id, String name, float price, Date dateRelease, String status, int categoryId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.dateRelease = dateRelease;
        this.status = status;
        this.categoryId = categoryId;
    }

    public Product(String name, float price, Date dateRelease, String status, int categoryId) {
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(Date dateRelease) {
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", dateRelease=" + dateRelease +
                ", status='" + status + '\'' +
                ", categoryId=" + categoryId +
                '}';
    }
}
