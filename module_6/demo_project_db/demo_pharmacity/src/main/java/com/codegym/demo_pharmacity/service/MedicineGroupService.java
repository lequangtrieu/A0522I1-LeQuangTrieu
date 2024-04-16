package com.codegym.demo_pharmacity.service;

import com.codegym.demo_pharmacity.entity.MedicineGroup;

import java.util.List;

public interface MedicineGroupService {
    List<MedicineGroup> getAllMedicineGroup();
    void create(MedicineGroup medicineGroup);
    void update(MedicineGroup medicineGroup);
    void delete(MedicineGroup medicineGroup);
    MedicineGroup getMedicineGroupById(Long id);
}
