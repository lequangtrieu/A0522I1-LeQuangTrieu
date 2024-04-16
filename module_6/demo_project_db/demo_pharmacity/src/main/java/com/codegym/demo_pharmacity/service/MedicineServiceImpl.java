package com.codegym.demo_pharmacity.service;

import com.codegym.demo_pharmacity.entity.Medicine;
import com.codegym.demo_pharmacity.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService{
    @Autowired
    MedicineRepository medicineRepository;
    @Override
    public List<Medicine> getAllMedicine() {
        return medicineRepository.findAll();
    }

    @Override
    public Medicine findMedicineById(Long id) {
        return medicineRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteMedicine(Medicine medicine) {
        medicineRepository.delete(medicine);
    }
}
