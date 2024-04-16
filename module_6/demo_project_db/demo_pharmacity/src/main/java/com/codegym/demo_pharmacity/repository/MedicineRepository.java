package com.codegym.demo_pharmacity.repository;

import com.codegym.demo_pharmacity.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {

}
