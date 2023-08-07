package com.example.final3.service;

import com.example.final3.model.KhuyenMai;

import java.util.List;

public interface KhuyenMaiService {
    List<KhuyenMai> findAll();

    void create(KhuyenMai khuyenMai);

    void delete(int id);

    KhuyenMai findById(int id);
}
