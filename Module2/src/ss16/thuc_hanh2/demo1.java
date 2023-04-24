package ss16.thuc_hanh2;

import java.io.*;

public class demo1 {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fr = new FileReader("src/ss16/thuc_hanh2/HocSinh");
            br = new BufferedReader(fr);
            fw = new FileWriter("data.txt");
            bw = new BufferedWriter(fw);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                int count =0;
                for (int i = 0; i < line.length(); i++) {
                    count++;
                }
                System.out.println(line);
                bw.write(line);
                bw.write(""+count);
                bw.newLine();

            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
