package com.codegym.a0223i1_pharmacy_professional_be.repository.informationmanagement;

import com.codegym.a0223i1_pharmacy_professional_be.entity.Medicine;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface MedicineInformationRepository extends JpaRepository<Medicine, String> {

    @Query(value = "SELECT * FROM medicine", nativeQuery = true)
    List<Medicine> getAllMedicine();

    @Query(value = "SELECT * FROM medicine WHERE medicine_id = :id", nativeQuery = true)
    Medicine getMedicineById(String id);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM medicine WHERE medicine_id = :medicineId", nativeQuery = true)
    void deleteMedicine(String medicineId);

    @Query(value = "select id, name from medicine where id= :id", nativeQuery = true)
    Optional<Medicine> findById(@Param("id") String id);

    @Query("SELECT m FROM Medicine m " +
            "WHERE (:medicineId IS NULL OR :selectedAttribute = 'medicineId' AND m.medicineId = :textField) " +
            "AND (:medicineGroup IS NULL OR :selectedAttribute = 'medicineGroup' AND m.medicineGroup = :textField) " +
            "AND (:medicineName IS NULL OR :selectedAttribute = 'medicineName' AND m.medicineName = :textField) " +
            "AND (:activeIngredient IS NULL OR :selectedAttribute = 'activeIngredient' AND m.activeIngredient = :textField) " +
            "AND (:importPrice IS NULL OR :selectedAttribute = 'importPrice' AND CAST(m.importPrice AS CHAR) = :textField) " +
            "AND (:retailPrice IS NULL OR :selectedAttribute = 'retailPrice' AND CAST(m.retailPrice AS CHAR) = :textField) " +
            "AND (:wholesalePrice IS NULL OR :selectedAttribute = 'wholesalePrice' AND CAST(m.wholesalePrice AS CHAR) = :textField)")
    List<Medicine> findMedicinesBySelectedAttributeAndTextField(@Param("medicineId") String medicineId,
                                                                @Param("medicineGroup") String medicineGroup,
                                                                @Param("medicineName") String medicineName,
                                                                @Param("activeIngredient") String activeIngredient,
                                                                @Param("importPrice") Float importPrice,
                                                                @Param("retailPrice") Float retailPrice,
                                                                @Param("wholesalePrice") Float wholesalePrice,
                                                                @Param("selectedAttribute") String selectedAttribute,
                                                                @Param("textField") String textField);

//    @Query(value = "SELECT * FROM medicine WHERE medicine_id LIKE %:medicineID% AND medicine_name LIKE %:medicineName%", nativeQuery = true)
//    List<Medicine> findMedicinesByCondition(@Param("medicineId") String medicineId,
//                                           @Param("medicineGroup") String medicineGroup,
//                                           @Param("medicineName") String medicineName,
//                                           @Param("activeIngredient") String activeIngredient,
//                                           @Param("importPrice") Float importPrice,
//                                           @Param("retailPrice") Float retailPrice,
//                                           @Param("wholesalePrice") Float wholesalePrice,
//                                           @Param("selectedAttribute") String selectedAttribute,
//                                           @Param("textField") String textField);

    @Query(value = "SELECT * FROM medicine WHERE medicine_id LIKE %:medicineID% AND medicine_name LIKE %:medicineName%", nativeQuery = true)
    List<Medicine> findByMedicineIdAndMedicineName(@Param("medicineID") String medicineID, @Param("medicineName") String medicineName);

}

