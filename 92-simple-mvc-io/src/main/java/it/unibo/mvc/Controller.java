package it.unibo.mvc;

import java.io.File;

/**
 * Application controller. Performs the I/O.
 */
public class Controller implements java.io.Serializable {
    String PATH = new File(System.getProperty("user.home"))
        + File.separator
        + (".txt");
    
    File file = new File(PATH);

    //method for setting a File as current file
    public void setCurrentFile(){
       
    }

    //method for getting the current File
    public void getCurrentFile(){
        
    }

    //method for getting the path (in form of String) of the current `File`
    public String getPath(){
        return "";
    }

    //method that gets a `String` as input and saves its content on the current file.
    //This method may throw an `IOException`.
    public void saveString(String s){
    
    }


}
