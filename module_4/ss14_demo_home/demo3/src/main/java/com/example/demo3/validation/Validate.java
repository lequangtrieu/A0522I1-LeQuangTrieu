package com.example.demo3.validation;

import com.example.demo3.model.KhuyenMai;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Date;
@Component
public class Validate implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (!(target instanceof KhuyenMai)){
            return;
        }
        KhuyenMai khuyenMai = (KhuyenMai) target;
        Date beginDate = khuyenMai.getBeginDate();

        String name = khuyenMai.getName();

        if (!khuyenMai.isEndDateAfterBeginDate()) {
            errors.rejectValue("endDate", "endDate.error", null, "endDate must > beginDate");
        }
    }


}
