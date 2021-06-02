package com.arrays.entity;

import com.arrays.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.arrays.validator.arrayValidator;
import com.arrays.exception.arrayException;

import java.util.Arrays;

public class array {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    private int array[];

    public array(int... array) {
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

    public int getElementOfArray(int index) throws arrayException{
        if (!arrayValidator.checkIndex(this, index)) {
            logger.error("index are not correct");
            throw new arrayException("index are not correct!");
        }
        return this.array[index];
    }

    public void setElementOfArray(int index, int newElement) throws arrayException {
        if (!arrayValidator.checkIndex(this, index)) {
            logger.error("index are not correct");
            throw new arrayException("index are not correct!");
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
        array newO = (array) o;
        return Arrays.equals(array, newO.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);

    }
}
