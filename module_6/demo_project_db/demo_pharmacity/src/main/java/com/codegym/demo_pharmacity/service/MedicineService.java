package com.codegym.demo_pharmacity.service;

import com.codegym.demo_pharmacity.entity.Medicine;

import java.util.List;

public interface MedicineService {
    List<Medicine> getAllMedicine();
    Medicine findMedicineById(Long id);
    void deleteMedicine(Medicine medicine);
}
