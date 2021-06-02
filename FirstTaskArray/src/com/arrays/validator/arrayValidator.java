package com.arrays.validator;

import com.arrays.entity.array;

import java.io.File;

public class arrayValidator {
    private static final String PATTERN_FOR_CHECK_STRING = "(\\s*(\\d+\\s*(\\s*|,|-)+\\s*))+";

    public static boolean checkIndex(array array, int index){
        return index < array.getLengthArray() && index >= 0;
    }

    public static boolean checkFile (File file){
        return file.exists();
    }

    public static boolean checkCorrectString (String somethingString){
        return somethingString.matches(PATTERN_FOR_CHECK_STRING);
    }
}
