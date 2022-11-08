package com.tekparams.selenium.utils;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToAFile {
    public void WriteFile(String strFileName, String content){
        try {
            FileWriter myWriter = new FileWriter(strFileName);
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
