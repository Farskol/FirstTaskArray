package com.company.Array.service;

import com.company.Array.entity.CustomArray;
import com.company.Array.exception.CustomArrayException;

public interface Calculation {

    int sumOfElementsArray(CustomArray array) throws CustomArrayException;

    int meanOfArray(CustomArray array) throws CustomArrayException;

    int numberOfPositiveElements(CustomArray array) throws CustomArrayException;

    int numberOfNegativeElements(CustomArray array) throws CustomArrayException;

}
