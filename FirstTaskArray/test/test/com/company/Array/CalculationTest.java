package test.com.company.Array;

import com.company.Array.exception.CustomArrayException;
import com.company.Array.service.impl.CalculationImpl;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.company.Array.entity.CustomArray;
import com.company.Array.service.Calculation;

import static org.testng.Assert.*;

public class CalculationTest {

    CustomArray arrayForTest;
    Calculation calculationForArrayTest;

    @BeforeClass
    public void serUp(){
        arrayForTest = new CustomArray(-1, 2, 5, 8, 9, 12, 23, 31, 33, 77, 123, 766);
        calculationForArrayTest = new CalculationImpl();
    }
    @Test
    public void testSumOfElementsArray() throws CustomArrayException {
        int actualSumOfElements = calculationForArrayTest.sumOfElementsArray(arrayForTest);
        assertEquals(actualSumOfElements,1088, "Test is failed because sum of elements don't true");
    }

    @Test
    public void testMeanOfArray() throws CustomArrayException {
        int actualMeanOfArray = calculationForArrayTest.meanOfArray(arrayForTest);
        assertEquals(actualMeanOfArray,90, "Test is failed because mean of array don't true");
    }

    @Test
    public void testNumberOfPositiveElements() throws CustomArrayException {
        int actualNumberOfPositiveElements = calculationForArrayTest.numberOfPositiveElements(arrayForTest);
        assertEquals(actualNumberOfPositiveElements,11,"Test is failed because number of positive elements don't true");
    }

    @Test
    public void testNumberOfNegativeElements() throws CustomArrayException {
        int actualNumberOfNegativeElements = calculationForArrayTest.numberOfNegativeElements(arrayForTest);
        assertEquals(actualNumberOfNegativeElements, 1, "Test is failed because number of negative elements don't true");
    }

    @AfterClass
    public void tierDown(){
        arrayForTest = null;
        calculationForArrayTest = null;
    }
}