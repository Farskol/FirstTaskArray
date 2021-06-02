package com.arrays;

import com.arrays.entity.array;
import com.arrays.exception.arrayException;
import com.arrays.service.Calculation;
import com.arrays.service.Sorting;
import com.arrays.service.impl.CalculationImpl;
import com.arrays.service.impl.SortingImpl;
import com.arrays.reader.arrayReader;
import com.arrays.validator.arrayValidator;
import com.arrays.parser.arrayParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Main {
	private static final Logger logger = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args) throws arrayException {

    Calculation calculation = new CalculationImpl();
    Sorting sorting = new SortingImpl();
	array array = new array(1, 2, 5, 3, 1, 5, 1, 9, 23, 4, 1, 3, 3, 123, 89);
	System.out.println(Arrays.toString(array.getArray()));
	System.out.println(array.getElementOfArray(1));
	sorting.bubbleSort(array);
	System.out.println(Arrays.toString(array.getArray()));
	System.out.println(arrayReader.readFileWithArrays("D:\\треннин EPAM\\FirstTaskArray\\src\\com\\resources","textOfArrays.txt").get(0));
	System.out.println(arrayValidator.checkCorrectString(arrayReader.readFileWithArrays("D:\\треннин EPAM\\FirstTaskArray\\src\\com\\resources","textOfArrays.txt").get(2)));
	System.out.println(arrayParser.arrayParser(arrayReader.readFileWithArrays("D:\\треннин EPAM\\FirstTaskArray\\src\\com\\resources","textOfArrays.txt")).get(0).toString());
    }
}
