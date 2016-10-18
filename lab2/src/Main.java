import callback.CallBack;
import callback.CallBackImpl;
import callback.Writer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mawieczo on 10/18/16.
 */
public class Main {

    private static BufferedReader reader;
    private static String fileName, validString, invalidString;
    private static CallBack callBack;

    public static void main(String [ ] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        callBack = new CallBackImpl();
        readDataFromConsole();
        Writer.writeToFile(validString, invalidString, fileName, callBack);
        while(!callBack.getResult()){
            tryWriteToFile();
        }
        System.out.println("Poprawnie zapisano do pliku: " + fileName);
    }

    private static void tryWriteToFile() throws IOException {
        System.out.println("Niepoprawna ścieżka: " + invalidString);
        System.out.println("Wprowadź nową poprawną ścieżke");
        fileName = reader.readLine();
        Writer.writeToFile(validString, invalidString, fileName, callBack);
    }

    private static void readDataFromConsole() throws IOException {
        System.out.println("Wprowadz nazwe pliku");
        fileName = reader.readLine();
        System.out.println("Wprowadź poprawny string");
        validString = reader.readLine();
        System.out.println("Wprowadź niepoprawny string");
        invalidString = reader.readLine();
    }
}
