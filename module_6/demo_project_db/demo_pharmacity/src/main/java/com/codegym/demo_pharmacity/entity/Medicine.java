package com.codegym.demo_pharmacity.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "medicine")
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "medicine_name")
    private String medicineName;

    @ManyToOne
    @JoinColumn(name = "medicine_group_id", referencedColumnName = "medicine_group_id")
    private MedicineGroup medicineGroup;

    public Medicine() {
    }

    public Medicine(Long id, String medicineName, MedicineGroup medicineGroup) {
        this.id = id;
        this.medicineName = medicineName;
        this.medicineGroup = medicineGroup;
    }

    public Medicine(String medicineName, MedicineGroup medicineGroup) {
        this.medicineName = medicineName;
        this.medicineGroup = medicineGroup;
    }

    public MedicineGroup getMedicineGroup() {
        return medicineGroup;
    }

    public void setMedicineGroup(MedicineGroup medicineGroup) {
        this.medicineGroup = medicineGroup;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}