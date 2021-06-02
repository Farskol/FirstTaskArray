package com.arrays.parser;

import com.arrays.entity.array;
import com.arrays.validator.arrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class arrayParser {
    private static final String PATTERN_FOR_STRING = "\\s*(\\s|,|-)+\\s*";
    private static final Logger logger = LogManager.getLogger();

    public static ArrayList<array> arrayParser(ArrayList<String> stringsAfterReading){
        ArrayList<array> arraysOfArrays = new ArrayList<>();
        for (int i = 0; i < stringsAfterReading.size(); i++){
            if (arrayValidator.checkCorrectString(stringsAfterReading.get(i))){
               String splitOfString [] = stringsAfterReading.get(i).split(PATTERN_FOR_STRING);
               int integerOfString [] = new int [splitOfString.length];
               for (int j = 0; j < splitOfString.length; j++){
                   integerOfString [j] = Integer.parseInt(splitOfString[j]);
               }
               arraysOfArrays.add(new array(integerOfString));
            }
        }
        return arraysOfArrays;
    }
}
