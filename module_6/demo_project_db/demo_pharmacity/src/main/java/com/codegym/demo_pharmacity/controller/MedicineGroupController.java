package com.codegym.demo_pharmacity.controller;

import com.codegym.demo_pharmacity.entity.MedicineGroup;
import com.codegym.demo_pharmacity.service.MedicineGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/medicineGroup")
@CrossOrigin("*")
public class MedicineGroupController {

    @Autowired
    MedicineGroupService medicineGroupService;

    @GetMapping()
    public ResponseEntity<List<MedicineGroup>> getAllMedicineGroup() {
        List<MedicineGroup> list = medicineGroupService.getAllMedicineGroup();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<String> createMedicineGroup(@RequestBody MedicineGroup medicineGroup) {
        medicineGroupService.create(medicineGroup);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MedicineGroup> getMGById(@PathVariable Long id) {
        MedicineGroup medicineGroup = medicineGroupService.getMedicineGroupById(id);
        return new ResponseEntity<>(medicineGroup, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateMG(@PathVariable Long id, @RequestBody MedicineGroup medicineGroup) {
        System.out.println(id);
        MedicineGroup existingMG = medicineGroupService.getMedicineGroupById(id);

        if (existingMG == null) {
            return new ResponseEntity<>("Không tìm thấy Medicine Group có ID: " + id, HttpStatus.NOT_FOUND);
        }

        //update
        existingMG.setMedicineGroupName(medicineGroup.getMedicineGroupName());

        medicineGroupService.update(existingMG);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMGById(@PathVariable Long id) {
        System.out.println(id);
        MedicineGroup existingMG = medicineGroupService.getMedicineGroupById(id);

        if (existingMG == null) {
            return new ResponseEntity<>("Không tìm thấy Medicine Group có ID: " + id, HttpStatus.NOT_FOUND);
        }

        //delete
        medicineGroupService.delete(existingMG);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }
}
