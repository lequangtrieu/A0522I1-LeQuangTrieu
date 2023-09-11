package com.example.final_md4.service;

import com.example.final_md4.model.Question;
import com.example.final_md4.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService{

    @Autowired
    QuestionRepository questionRepository;
    @Override
    public void create(Question question) {
        questionRepository.save(question);
    }

    @Override
    public void update(Question question) {
        if (questionRepository.existsById(question.getId())) {
            questionRepository.save(question);
        }
    }

    @Override
    public Page<Question> findAll(Pageable pageable) {
        return questionRepository.findAll(pageable);
    }

    @Override
    public void deleteById(Long id) {
        questionRepository.deleteById(id);
    }

    @Override
    public Question findById(Long id) {
        return questionRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Question> searchAll(String title, String categoryName, Pageable pageable) {
        return questionRepository.findAllByTitleContainingAndCategory_CategoryName(title, categoryName, pageable);
    }

    @Override
    public Page<Question> searchByTitle(String title, Pageable pageable) {
        return questionRepository.findAllByTitleContaining(title, pageable);
    }

    @Override
    public Page<Question> searchByCateName(String name, Pageable pageable) {
        return questionRepository.findByCategory_CategoryName(name, pageable);
    }
}
