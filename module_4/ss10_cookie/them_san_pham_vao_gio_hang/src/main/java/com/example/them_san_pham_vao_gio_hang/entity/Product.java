package com.example.them_san_pham_vao_gio_hang.entity;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;
    private String nameProduct;
    private Long oldPrice;
    private Long newPrice;
    @Column(columnDefinition = "varchar(5000)")
    private String description;

    @Column(columnDefinition = "varchar(5000)")
    private String urlImage;

    public Product() {
    }

    public Product(Integer idProduct, String nameProduct, Long oldPrice, Long newPrice, String description, String urlImage) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
        this.description = description;
        this.urlImage = urlImage;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Long getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Long oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Long getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(Long newPrice) {
        this.newPrice = newPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
