package com.company.Array.validator;

import com.company.Array.entity.CustomArray;

public class CustomArrayValidator {
    private static final String PATTERN_FOR_CHECK_STRING = "(\\s*(\\d+\\s*(\\s*|,|-)+\\s*))+";

    public static boolean checkIndex(CustomArray array, int index){
        return index < array.getLengthArray() && index >= 0;
    }

    public static boolean checkCorrectString (String somethingString){
        return somethingString.matches(PATTERN_FOR_CHECK_STRING);
    }
}
