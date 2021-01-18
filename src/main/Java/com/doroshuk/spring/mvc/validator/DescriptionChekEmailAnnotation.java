package com.doroshuk.spring.mvc.validator;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DescriptionChekEmailAnnotation implements ConstraintValidator<ChekEmailAnnotation,String > {

    private String endOfEmail;
    @Override
    public void initialize(ChekEmailAnnotation ChekEmailAnnotation) {

        endOfEmail=ChekEmailAnnotation.value();
    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {


        return enteredValue.endsWith(endOfEmail);
    }
}
