package com.company.Array.service.impl;

import com.company.Array.entity.CustomArray;
import com.company.Array.service.Sorting;
import com.company.Array.exception.CustomArrayException;

public class SortingImpl implements Sorting {

    public int MinElement(CustomArray array) throws CustomArrayException {
        int x = array.getElementOfArray(0);
        for (int i = 0; i < array.getLengthArray(); i++){
            if (array.getElementOfArray(i) < x){
                x = array.getElementOfArray(i);
            }
        }
        return x;
    }

    public int MaxElement(CustomArray array) throws CustomArrayException {
        int x = array.getElementOfArray(0);
        for (int i = 0; i < array.getLengthArray(); i++){
            if (array.getElementOfArray(i) > x){
                x = array.getElementOfArray(i);
            }
        }
        return x;
    }

    public void replacementAllMinElementsOnMax(CustomArray array) throws CustomArrayException {
        int x [] = array.getArray();
        int min = MinElement(array);
        int max = MaxElement(array);
        for (int i = 0; i < x.length; i++){
            if (x[i] == min){
                x[i] = max;
            }
            array.setArray(x);
        }
    }

    public void bubbleSort(CustomArray array) throws CustomArrayException {
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

    public void snakerSort(CustomArray array) throws CustomArrayException {
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

    public void insertionSort(CustomArray array) throws CustomArrayException {
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

}
