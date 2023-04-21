package ss16.bai_tap.bai_tap2;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        QuocGia qg1 = new QuocGia(1, "AU", "Australia");
        QuocGia qg2 = new QuocGia(2, "CN", "China");
        QuocGia qg3 = new QuocGia(3, "JP", "JaPan");
        QuocGia qg4 = new QuocGia(4, "AU", "Australia");
        QuocGia qg5 = new QuocGia(5, "AU", "Australia");
        QuocGia qg6 = new QuocGia(6, "AU", "Australia");
        QuocGia qg7 = new QuocGia(7, "AU", "Australia");
        QuocGia qg8 = new QuocGia(8, "VN", "VietNam");
        List<QuocGia> quocGias = new LinkedList<>();
        quocGias.add(qg1);
        quocGias.add(qg2);
        quocGias.add(qg3);
        quocGias.add(qg4);
        quocGias.add(qg5);
        quocGias.add(qg6);
        quocGias.add(qg7);
        quocGias.add(qg8);
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("src/ss16/bai_tap/bai_tap2/QuocGia.CSV");
            bw = new BufferedWriter(fw);
            for (QuocGia o : quocGias) {
                bw.write(o.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("src/ss16/bai_tap/bai_tap2/QuocGia.CSV");
            br = new BufferedReader(fr);
            String list = "";
            while (true){
                list=br.readLine();
                if(list==null){
                    break;
                }
                System.out.println(list);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
