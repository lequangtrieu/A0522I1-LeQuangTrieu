package com.example.blog.service;

import java.util.List;

public interface Service<T> {
    void create(T t);
    void update(T t);
    T findById(int id);
    List<T> findAll();
    void deleteById(int id);
}
