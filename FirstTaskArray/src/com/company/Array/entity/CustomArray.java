package com.company.Array.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.company.Array.validator.CustomArrayValidator;
import com.company.Array.exception.CustomArrayException;

import java.util.Arrays;

public class CustomArray {

    private static final Logger logger = LogManager.getLogger();

    private int array[];

    public CustomArray(int... array) {
        this.array = array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return this.array;
    }

    public int getLengthArray() {
        return this.array.length;
    }

    public int getElementOfArray(int index) throws CustomArrayException {
        if (!CustomArrayValidator.checkIndex(this, index)) {
            logger.error("index are not correct");
            throw new CustomArrayException("index are not correct!");
        }
        return this.array[index];
    }

    public void setElementOfArray(int index, int newElement) throws CustomArrayException {
        if (!CustomArrayValidator.checkIndex(this, index)) {
            logger.error("index are not correct");
            throw new CustomArrayException("index are not correct!");
        }
        this.array[index] = newElement;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.array);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomArray newO = (CustomArray) o;
        return Arrays.equals(array, newO.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);

    }
}
