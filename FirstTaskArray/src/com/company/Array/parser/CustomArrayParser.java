package com.company.Array.parser;

import com.company.Array.entity.CustomArray;
import com.company.Array.validator.CustomArrayValidator;

import java.util.ArrayList;

public class CustomArrayParser {
    private static final String PATTERN_FOR_STRING = "\\s*(\\s|,|-)+\\s*";

    public static ArrayList<CustomArray> arrayParser(ArrayList<String> stringsAfterReading){
        ArrayList<CustomArray> arraysOfArrays = new ArrayList<>();
        for (int i = 0; i < stringsAfterReading.size(); i++){
            if (CustomArrayValidator.checkCorrectString(stringsAfterReading.get(i))){
               String splitOfString [] = stringsAfterReading.get(i).split(PATTERN_FOR_STRING);
               int integerOfString [] = new int [splitOfString.length];
               for (int j = 0; j < splitOfString.length; j++){
                   integerOfString [j] = Integer.parseInt(splitOfString[j]);
               }
               arraysOfArrays.add(new CustomArray(integerOfString));
            }
        }
        return arraysOfArrays;
    }
}
