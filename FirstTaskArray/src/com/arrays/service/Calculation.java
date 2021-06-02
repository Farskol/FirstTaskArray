package com.arrays.service;

import com.arrays.entity.array;
import com.arrays.exception.arrayException;

public interface Calculation {

    public int sumOfElementsArray(array array) throws arrayException;

    public int meanOfArray(array array) throws arrayException;

    public int numberOfPositiveElements(array array) throws arrayException;

    public int numberOfNegativeElements(array array) throws arrayException;

}
