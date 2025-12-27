package com.codingshuttle.learningMVC.springbootwebtutorial.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PrimeValidator implements ConstraintValidator<PrimeValidation,Integer> {
    @Override
    public boolean isValid(Integer n, ConstraintValidatorContext constraintValidatorContext) {
        if (n <= 1)
            return false;
        // Check divisibility from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
