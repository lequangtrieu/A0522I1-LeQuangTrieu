package com.example.final3.validation;


import com.example.final3.model.KhuyenMai;
import com.example.final3.service.KhuyenMaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class KhuyenMaiValidate implements Validator {
    @Autowired
    KhuyenMaiService khuyenMaiService;
    @Override
    public boolean supports(Class<?> clazz) {
        return KhuyenMai.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (!(target instanceof KhuyenMai)) {
            return;
        }
        KhuyenMai khuyenMai = (KhuyenMai) target;
    }



}
