package com.arrays.service.impl;

import com.arrays.entity.array;
import com.arrays.service.Sorting;
import com.arrays.exception.arrayException;

public class SortingImpl implements Sorting {

    public int getMinElement(array array) throws arrayException{
        int x = array.getElementOfArray(0);
        for (int i = 0; i < array.getLengthArray(); i++){
            if (array.getElementOfArray(i) < x){
                x = array.getElementOfArray(i);
            }
        }
        return x;
    }

    public int getMaxElement(array array) throws arrayException{
        int x = array.getElementOfArray(0);
        for (int i = 0; i < array.getLengthArray(); i++){
            if (array.getElementOfArray(i) > x){
                x = array.getElementOfArray(i);
            }
        }
        return x;
    }

    public void replacementAllMinElementsOnMax(array array) throws arrayException{
        int x [] = array.getArray();
        int min = getMinElement(array);
        int max = getMaxElement(array);
        for (int i = 0; i < x.length; i++){
            if (x[i] == min){
                x[i] = max;
            }
            array.setArray(x);
        }
    }

    public void snakerSort(array array) throws arrayException{
        for(int i = 0; i < array.getLengthArray()/2; i++){
            for (int j = i; j < array.getLengthArray()-1-i;j++){
                if (array.getElementOfArray(j) > array.getElementOfArray(j+1)){
                    int flag = array.getElementOfArray(j);
                    array.setElementOfArray(j,array.getElementOfArray(j+1));
                    array.setElementOfArray(j+1,flag);
                }
            }
            for (int k = array.getLengthArray()-1-i; k > 0+i; k--){
                if (array.getElementOfArray(k) < array.getElementOfArray(k-1)){
                    int flag = array.getElementOfArray(k);
                    array.setElementOfArray(k,array.getElementOfArray(k-1));
                    array.setElementOfArray(k-1,flag);
                }
            }
        }
    }

    public void InsertionSort(array array) throws arrayException{
        for(int i=1; i < array.getLengthArray(); i++){
            boolean flag = true;
            int k = i-1;
            while (flag){
                if (array.getElementOfArray(i) < array.getElementOfArray(k)){
                    for (int j = i; i > k; i--){
                        int x = array.getElementOfArray(i);
                        array.setElementOfArray(i, array.getElementOfArray(i-1));
                        array.setElementOfArray(i-1,x);
                    }
                }
                if (k == 0){
                    flag = false;
                }
                k--;
            }
        }
    }

    public void bubbleSort(array array) throws arrayException{
        for (int i = 0; i < array.getLengthArray(); i++){
            for (int j = 0; j < array.getLengthArray()-1-i; j++){
                if (array.getElementOfArray(j) > array.getElementOfArray(j+1)){
                    int x = array.getElementOfArray(j);
                    array.setElementOfArray(j,array.getElementOfArray(j+1));
                    array.setElementOfArray(j+1,x);
                }
            }
        }
    }
}
