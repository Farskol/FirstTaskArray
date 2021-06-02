package com.arrays.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.arrays.exception.arrayException;
import com.arrays.validator.arrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class arrayReader {

    private static final Logger logger = LogManager.getLogger();

    public static ArrayList<String> readFileWithArrays (String link, String fileName) throws arrayException{

        File fileWithArrays  = new File(link,fileName);

        if (!arrayValidator.checkFile(fileWithArrays)){
            logger.error("file is not existing.");
            throw new arrayException("file is not existing.");
        }
        ArrayList<String> arraysList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(fileWithArrays)))
        {
            String s;
            while((s=br.readLine())!=null){
                arraysList.add(s);
            }
        }
        catch(IOException ex){

            ex.getMessage();
        }
        logger.info("file have been read");
        return arraysList;
    }
}
