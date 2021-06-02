package com.arrays.service;

import com.arrays.entity.array;
import com.arrays.exception.arrayException;

public interface Sorting {

    public int getMinElement(array array) throws arrayException;

    public int getMaxElement(array array) throws arrayException;

    public void replacementAllMinElementsOnMax(array array) throws arrayException;

    public  void  snakerSort(array array) throws arrayException;

    public void InsertionSort(array array) throws arrayException;

    public void bubbleSort(array array) throws arrayException;
}
