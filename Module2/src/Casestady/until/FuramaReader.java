package Casestady.until;

import java.io.*;

public class FuramaReader {
    String csvName;
    public void reader(){
        try {
            FileReader fileReader = new FileReader("csvName");
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
