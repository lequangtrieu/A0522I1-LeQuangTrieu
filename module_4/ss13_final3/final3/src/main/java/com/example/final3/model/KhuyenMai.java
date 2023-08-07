package com.example.final3.model;

import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class KhuyenMai {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

//    @NotBlank
    private String name;

//    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date beginDate;

//    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date endDate;

    @NotNull
    private int discount;

    @NotBlank
    private String note;

    public KhuyenMai() {
    }

    public KhuyenMai(int id, String name, Date beginDate, Date endDate, int discount, String note) {
        this.id = id;
        this.name = name;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.discount = discount;
        this.note = note;
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

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
