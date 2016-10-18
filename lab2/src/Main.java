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

    public static void main(String [ ] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wprowadz nazwe pliku");
        String fileName = reader.readLine();
        System.out.println("Wprowadź poprawny string");
        String validString = reader.readLine();
        System.out.println("Wprowadź niepoprawny string");
        String invalidString = reader.readLine();

        CallBack callBack = new CallBackImpl();

        Writer.writeToFile(validString, invalidString, fileName, callBack);
        }
    }
}
