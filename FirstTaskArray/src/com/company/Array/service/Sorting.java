package com.company.Array.service;

import com.company.Array.entity.CustomArray;
import com.company.Array.exception.CustomArrayException;

public interface Sorting {

    int MinElement(CustomArray array) throws CustomArrayException;

    int MaxElement(CustomArray array) throws CustomArrayException;

    void replacementAllMinElementsOnMax(CustomArray array) throws CustomArrayException;

    void bubbleSort(CustomArray array) throws CustomArrayException;

    void snakerSort(CustomArray array) throws CustomArrayException;

    void insertionSort(CustomArray array) throws CustomArrayException;

}
