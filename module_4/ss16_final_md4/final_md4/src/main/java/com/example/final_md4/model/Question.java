package com.example.final_md4.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 5, max = 100, message = "title must from 5 to 100 characters")
    private String title;
    @NotBlank
    @Size(min = 10, max = 500, message = "question content must from 10 to 500 characters")
    private String questionContent;
    private String questionAnswer;

    private LocalDate dateCreate;
    private String status;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;

    public Question() {
    }

    public Question(Long id, String title, String questionContent, Category category) {
        this.id = id;
        this.title = title;
        this.questionContent = questionContent;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDate dateCreate) {
        this.dateCreate = dateCreate;
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
