package com.codegym.a0223i1_pharmacy_professional_be.controller.informationmanagement;

import com.codegym.a0223i1_pharmacy_professional_be.entity.Medicine;
import com.codegym.a0223i1_pharmacy_professional_be.service.interfaceservice.informationmanagement.MedicineInformationService;
import com.codegym.a0223i1_pharmacy_professional_be.dto.MedicineDto;
import com.codegym.a0223i1_pharmacy_professional_be.entity.Medicine;
import com.codegym.a0223i1_pharmacy_professional_be.service.interfaceservice.informationmanagement.IMedicineService;
import jakarta.xml.ws.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/medicine")
@CrossOrigin("*")
public class MedicineInformationManagementController {
    //
    @Autowired
    MedicineInformationService medicineService;
    @Autowired
    private IMedicineService medicineService2;


    @GetMapping("")
    public ResponseEntity<List<Medicine>> getAllMedicine() {
        return new ResponseEntity<>(medicineService.getAllMedicine(), HttpStatus.OK);
    }



    @GetMapping("/{id}")
    public ResponseEntity<MedicineDto> getMedicineById(@PathVariable String id) {
        return new ResponseEntity<>(medicineService2.findMedicineById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMedicineById(@PathVariable String id) {
        System.out.println(id);

        Medicine existingMedicine = medicineService.findMedicineById(id);

        if (existingMedicine == null) {
            return new ResponseEntity<>("Không tìm thấy Medicine có ID: " + id, HttpStatus.NOT_FOUND);
        }

        medicineService.deleteMedicine(existingMedicine);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

//    @GetMapping("/search")
//    public ResponseEntity<List<Medicine>> searchMedicines(
//            @RequestParam(value = "medicineId", required = false) String medicineId,
//            @RequestParam(value = "medicineGroup", required = false) String medicineGroup,
//            @RequestParam(value = "medicineName", required = false) String medicineName,
//            @RequestParam(value = "activeIngredient", required = false) String activeIngredient,
//            @RequestParam(value = "importPrice", required = false) Float importPrice,
//            @RequestParam(value = "retailPrice", required = false) Float retailPrice,
//            @RequestParam(value = "wholesalePrice", required = false) Float wholesalePrice,
//            @RequestParam(value = "selectedAttribute") String selectedAttribute,
//            @RequestParam(value = "textField", required = false) String textField)
//    {
//        List<Medicine> medicines = medicineService.findMedicinesBySelectedAttributeAndTextField(
//                medicineId, medicineGroup, medicineName, activeIngredient,
//                importPrice, retailPrice, wholesalePrice, selectedAttribute, textField);
//
//        if (medicines.isEmpty()) {
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.ok(medicines);
//        }
//    }
}
