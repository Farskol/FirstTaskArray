package com.company.Array.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import com.company.Array.exception.CustomArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayReader {

    private static final Logger logger = LogManager.getLogger();

    public static ArrayList<String> readFileWithArrays (String path, String fileName) throws CustomArrayException {

        File fileWithArrays  = new File(path,fileName);

        if (!fileWithArrays.exists()){
            logger.error("file is not existing.");
            throw new CustomArrayException("file is not existing.");
        }
        ArrayList<String> arraysList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(fileWithArrays))){
            String s;
            while((s=br.readLine())!=null){
                arraysList.add(s);
            }
        }
        catch(IOException ex){
            logger.error(ex.getMessage());
        }
        logger.info("file have been read");
        return arraysList;
    }
}
