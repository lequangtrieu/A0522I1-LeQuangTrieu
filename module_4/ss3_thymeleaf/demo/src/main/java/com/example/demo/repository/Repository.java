package com.example.demo.repository;

import java.util.List;

public interface Repository<T> {
    void create(T t);
    void update(T t);
    T findById(int id);
    List<T> findAll();
    void deleteById(int id);
}
