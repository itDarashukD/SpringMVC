package com.doroshuk.spring.mvc.validator;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Создаем свою аннотацию
@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
//Описание нашей А будет в классе DescriptionChekEmailAnnotation
@Constraint(validatedBy = DescriptionChekEmailAnnotation.class)
public @interface ChekEmailAnnotation {
    //Дефолтные значения параметров этой А

    public String value() default "xyx.com";
    public String message() default "Email must be ended by xyz.com";


    //необходимо прописать еще эти 2 строки,позволяет разделять А
    public Class<?>[]  groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
