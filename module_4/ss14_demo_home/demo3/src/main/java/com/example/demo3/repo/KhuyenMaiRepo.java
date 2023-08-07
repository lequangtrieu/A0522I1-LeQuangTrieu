package com.example.demo3.repo;

import com.example.demo3.model.KhuyenMai;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KhuyenMaiRepo extends JpaRepository<KhuyenMai, Integer> {
    List<KhuyenMai> findAllByNameContaining(String name);
}
