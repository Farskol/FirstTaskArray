package com.arrays.service.impl;

import com.arrays.entity.array;
import com.arrays.service.Calculation;
import com.arrays.exception.arrayException;

public class CalculationImpl implements Calculation {

    public int sumOfElementsArray(array array) throws arrayException{
        int sum = 0;
        for (int i = 0; i < array.getLengthArray(); i++){
            sum += array.getElementOfArray(i);
        }
        return sum;
    }

    public int meanOfArray(array array) throws arrayException{
        return sumOfElementsArray(array)/array.getLengthArray();
    }

    public int numberOfPositiveElements(array array) throws arrayException{
        int x = 0;
        for(int i = 0; i < array.getLengthArray(); i++){
            if(array.getElementOfArray(i) > 0){
                x++;
            }
        }
        return x;
    }

    public int numberOfNegativeElements(array array) throws arrayException{
        int x = 0;
        for(int i = 0; i < array.getLengthArray(); i++){
            if(array.getElementOfArray(i) < 0){
                x++;
            }
        }
        return x;
    }
}
