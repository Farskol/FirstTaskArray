package com.company.Array.service.impl;

import com.company.Array.entity.CustomArray;
import com.company.Array.service.Calculation;
import com.company.Array.exception.CustomArrayException;

public class CalculationImpl implements Calculation {

    public int sumOfElementsArray(CustomArray array) throws CustomArrayException {
        int sum = 0;
        for (int i = 0; i < array.getLengthArray(); i++){
            sum += array.getElementOfArray(i);
        }
        return sum;
    }

    public int meanOfArray(CustomArray array) throws CustomArrayException {
        return sumOfElementsArray(array)/array.getLengthArray();
    }

    public int numberOfPositiveElements(CustomArray array) throws CustomArrayException {
        int x = 0;
        for(int i = 0; i < array.getLengthArray(); i++){
            if(array.getElementOfArray(i) > 0){
                x++;
            }
        }
        return x;
    }

    public int numberOfNegativeElements(CustomArray array) throws CustomArrayException {
        int x = 0;
        for(int i = 0; i < array.getLengthArray(); i++){
            if(array.getElementOfArray(i) < 0){
                x++;
            }
        }
        return x;
    }
}
