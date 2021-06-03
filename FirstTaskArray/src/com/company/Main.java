package com.company;

import com.company.Array.entity.CustomArray;
import com.company.Array.exception.CustomArrayException;
import com.company.Array.service.Calculation;
import com.company.Array.service.Sorting;
import com.company.Array.service.impl.CalculationImpl;
import com.company.Array.service.impl.SortingImpl;
import com.company.Array.reader.CustomArrayReader;
import com.company.Array.validator.CustomArrayValidator;
import com.company.Array.parser.CustomArrayParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Main {
	private static final Logger logger = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args) throws CustomArrayException {

    Calculation calculation = new CalculationImpl();
    Sorting sorting = new SortingImpl();
	CustomArray array = new CustomArray(1, 2, 5, 3, 1, 5, 1, 9, 23, 4, 1, 3, 3, 123, 89);
	System.out.println(Arrays.toString(array.getArray()));
	System.out.println(calculation.sumOfElementsArray(array));
	System.out.println(array.getLengthArray());
	System.out.println(calculation.meanOfArray(array));
	sorting.bubbleSort(array);
	System.out.println(Arrays.toString(array.getArray()));
	System.out.println(CustomArrayReader.readFileWithArrays("D:\\треннин EPAM\\FirstTaskArray\\resources","textOfArrays.txt").get(0));
	System.out.println(CustomArrayValidator.checkCorrectString(CustomArrayReader.readFileWithArrays("D:\\треннин EPAM\\FirstTaskArray\\resources","textOfArrays.txt").get(2)));
	System.out.println(CustomArrayParser.arrayParser(CustomArrayReader.readFileWithArrays("D:\\треннин EPAM\\FirstTaskArray\\resources","textOfArrays.txt")).get(0).toString());
    }
}
