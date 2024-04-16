package com.codegym.demo_pharmacity.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "medicine_group")
public class MedicineGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medicine_group_id", nullable = false)
    private Long id;

    @Column(name = "medicine_group_name")
    private String medicineGroupName;

    @JsonBackReference
    @OneToMany(mappedBy = "medicineGroup", fetch = FetchType.LAZY)
    private List<Medicine> medicines = new ArrayList<>();

    public MedicineGroup() {
    }

    public MedicineGroup(Long id, String medicineGroupName, List<Medicine> medicines) {
        this.id = id;
        this.medicineGroupName = medicineGroupName;
        this.medicines = medicines;
    }

    public MedicineGroup(Long id, String medicineGroupName) {
        this.id = id;
        this.medicineGroupName = medicineGroupName;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<Medicine> medicines) {
        this.medicines = medicines;
    }

    public String getMedicineGroupName() {
        return medicineGroupName;
    }

    public void setMedicineGroupName(String medicineGroupName) {
        this.medicineGroupName = medicineGroupName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}