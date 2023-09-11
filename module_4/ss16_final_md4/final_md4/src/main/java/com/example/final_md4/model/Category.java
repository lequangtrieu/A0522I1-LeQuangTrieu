package com.example.final_md4.model;

import javax.persistence.*;
import java.util.List;
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long categoryId;
    private String categoryName;
    @OneToMany(mappedBy = "category")
    private List<Question> questionList;

    public Category() {
    }

    public Category(Long categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}
