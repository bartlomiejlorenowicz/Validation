package com.kodilla.tasklist;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class RangeValidator implements ConstraintValidator<Range, Integer> {

    private int min;
    private int max;

    @Override
    public void initialize(Range constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if (value == null) return false;
        return value >= min && value <= max;
    }
}
