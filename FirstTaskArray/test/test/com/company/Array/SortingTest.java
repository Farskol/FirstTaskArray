package test.com.company.Array;

import com.company.Array.entity.CustomArray;
import com.company.Array.exception.CustomArrayException;
import com.company.Array.service.Sorting;
import com.company.Array.service.impl.SortingImpl;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class SortingTest {

    CustomArray arrayForTest;
    Sorting sortingForArrayTest;
    int [] expectedArray = {-1, 2, 5, 8, 9, 12, 23, 31, 33, 77, 123, 766};

    @BeforeMethod
    public void setUp() {
        arrayForTest = new CustomArray(-1, 23, 31, 33, 9, 8, 2, 123, 5, 766, 77, 12);
        sortingForArrayTest = new SortingImpl();
    }

    @Test
    public void testMinElement() throws CustomArrayException {
        int actualMinElement = sortingForArrayTest.MinElement(arrayForTest);
        assertEquals(actualMinElement, -1, "Test is failed because min element don't true");
    }

    @Test
    public void testMaxElement() throws CustomArrayException {
        int actualMaxElement = sortingForArrayTest.MaxElement((arrayForTest));
        assertEquals(actualMaxElement, 766,"Test is failed because max element don't true");
    }

    @Test
    public void testReplacementAllMinElementsOnMax() throws CustomArrayException {
        sortingForArrayTest.replacementAllMinElementsOnMax(arrayForTest);
        int [] expected = {766, 23, 31, 33, 9, 8, 2, 123, 5, 766, 77, 12};
        assertEquals(arrayForTest.getArray(), expected ,"Test is failed because sorting method work don't right");
    }

    @Test
    public void testBubbleSort() throws CustomArrayException {
        sortingForArrayTest.bubbleSort(arrayForTest);
        assertEquals(arrayForTest.getArray(), expectedArray, "Test is failed because sorting method don't work right");
    }

    @Test
    public void testSnakerSort() throws CustomArrayException {
        sortingForArrayTest.snakerSort(arrayForTest);
        assertEquals(arrayForTest.getArray(), expectedArray, "Test is failed because sorting method don't work right");
    }

    @Test
    public void testInsertionSort() throws CustomArrayException {
        sortingForArrayTest.insertionSort(arrayForTest);
        assertEquals(arrayForTest.getArray(),expectedArray,"Test is failed because sorting method don't work right");
    }

    @AfterMethod
    public void tearDown() {
        arrayForTest = null;
        sortingForArrayTest = null;
    }
}