package ss16.bai_tap.bai_tap1;

import java.io.*;
import java.util.LinkedList;
import java.util.Objects;

class CopyFileText {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fr = new FileReader("src/ss16/bai_tap/bai_tap1/sourceFile");
            br = new BufferedReader(fr);
            fw = new FileWriter("src/ss16/bai_tap/bai_tap1/targetFile");
            bw = new BufferedWriter(fw);
            String line = "";
            while (true){
                line=br.readLine();
                if(line==null){
                    break;
                }
                int count=0;
                for (int i = 0; i < line.length(); i++) {
                    count++;
                }
                System.out.println(line);
                bw.write(line);
                bw.write(""+count);
                bw.newLine();
            }bw.flush();
            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

