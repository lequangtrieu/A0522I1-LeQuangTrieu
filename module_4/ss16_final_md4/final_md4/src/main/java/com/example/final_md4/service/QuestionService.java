package com.example.final_md4.service;

import com.example.final_md4.model.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface QuestionService {
    void create(Question question);
    Page<Question> findAll(Pageable pageable);
    void deleteById(Long id);

    void update(Question question);

    Question findById(Long id);

    Page<Question> searchAll(String title, String categoryName, Pageable pageable);

    Page<Question> searchByTitle(String title, Pageable pageable);

    Page<Question> searchByCateName(String name, Pageable pageable);
}
