package com.pplove.hzwebapi.annotation;

import com.fasterxml.jackson.databind.deser.DataFormatReaders;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Pattern;
import java.lang.annotation.Documented;
import java.util.regex.Matcher;


public class PhoneValidator implements ConstraintValidator<Phone,String> {

//    private static final Pattern PHONE_PATTEN = Pattern.compile("");

    @Override
    public void initialize(Phone constraintAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s == null || s.length() == 0)
        {
            return true;
        }
//        Matcher m = PHONE_PATTEN.matcher(s);
        if(s.length() > 3)
        return true;
        else return false;
    }
}
