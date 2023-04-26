package Casestady.until;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FuramaWriter {
    public void write() {
        String csvName;
        FileWriter fileWriter;

        {
            try {
                fileWriter = new FileWriter("csvName");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    }

}
