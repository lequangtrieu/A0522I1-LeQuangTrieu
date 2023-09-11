package com.example.final_md4.repository;

import com.example.final_md4.model.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    Page<Question> findAllByTitleContainingAndCategory_CategoryName(String title, String categoryName, Pageable pageable);

    Page<Question> findAllByTitleContaining(String title, Pageable pageable);

    Page<Question> findByCategory_CategoryName(String name, Pageable pageable);
}
