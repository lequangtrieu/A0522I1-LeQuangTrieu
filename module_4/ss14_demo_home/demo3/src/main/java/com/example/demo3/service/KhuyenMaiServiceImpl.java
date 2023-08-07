package com.example.demo3.service;

import com.example.demo3.model.KhuyenMai;
import com.example.demo3.repo.KhuyenMaiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KhuyenMaiServiceImpl implements KhuyenMaiService{
    @Autowired
    KhuyenMaiRepo khuyenMaiRepo;
    @Override
    public List<KhuyenMai> findAll() {
        return khuyenMaiRepo.findAll();
    }

    @Override
    public void create(KhuyenMai khuyenMai) {
        khuyenMaiRepo.save(khuyenMai);
    }

    @Override
    public void delete(int id) {
        khuyenMaiRepo.deleteById(id);
    }

    @Override
    public KhuyenMai findById(int id) {
        return khuyenMaiRepo.findById(id).orElse(null);
    }

    @Override
    public List<KhuyenMai> searchByName(String name) {
        return khuyenMaiRepo.findAllByNameContaining(name);
    }
}
