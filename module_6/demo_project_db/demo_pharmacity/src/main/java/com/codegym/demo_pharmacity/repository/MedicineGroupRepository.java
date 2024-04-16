package com.codegym.demo_pharmacity.repository;

import com.codegym.demo_pharmacity.entity.MedicineGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineGroupRepository extends JpaRepository<MedicineGroup, Long> {

}
