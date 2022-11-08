package com.tekparams.selenium.utils;

import java.io.File;
import java.io.IOException;

public class CreateATextFile {

    public void createFile(String strFileName){
        try {
            File myObj = new File(strFileName);
            if (myObj.createNewFile()){
                System.out.println("File Created..."+myObj.getName());
            }
            else{
                System.out.println("File already exists...");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
