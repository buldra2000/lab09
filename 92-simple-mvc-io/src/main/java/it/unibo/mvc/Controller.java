package it.unibo.mvc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Application controller. Performs the I/O.
 */
public class Controller implements java.io.Serializable {
    String PATH = new File(System.getProperty("user.home"))
        + File.separator
        + (".txt");
    
    File file = new File(PATH);

    //method for setting a File as current file
    public void setCurrentFile(final File file){
       this.file = file;
    }

    //method for getting the current File
    public File getCurrentFile(){
        return this.file;
    }

    //method for getting the path (in form of String) of the current `File`
    public String getPath(){
        return this.file.getAbsolutePath();
    }

    //method that gets a `String` as input and saves its content on the current file.
    //This method may throw an `IOException`.
    public void saveString(String s) throws IOException{
        try(
            final FileWriter fw = new FileWriter(file)
        ){
            fw.write(s);
        }
    }


}
