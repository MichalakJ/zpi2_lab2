package callback;

import java.io.File;
import java.io.PrintWriter;

/**
 * Created by Jakub on 2016-10-18.
 */
public class Writer {


    public static void main(String[] args){

    }
    public static void writeToFile(String validString, String invalidString, String fileName, CallBack callBack){
        try {
            File file = new File(fileName);
            PrintWriter writer = new PrintWriter(file, "UTF-8");
            writer.println("Hello World");
            System.out.println("writing to file ..." +fileName);
            writer.close();
            callBack.methodToCall(true);

        } catch (Exception ex){
            System.out.println(ex.getMessage());
            callBack.methodToCall(false);
        }
    }
}