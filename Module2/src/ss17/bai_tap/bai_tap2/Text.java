package ss17.bai_tap.bai_tap2;

import java.io.*;

public class Text {
    private static void copyFileUsingStream() {
        try {
            InputStream is = null;
            OutputStream os = null;
            try {
                is = new FileInputStream("src/ss17/bai_tap/bai_tap2/source_file.txt");
                os = new FileOutputStream("src/ss17/bai_tap/bai_tap2/target_file.txt");

                byte[] buffer = new byte[1024];
                int length;
                while ((length = is.read(buffer)) > 0) {
                    os.write(buffer, 0, length);
                    System.out.println("Tổng số byte là: "+length);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                is.close();
                os.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write() {
        try {
            FileOutputStream fos = new FileOutputStream("src/ss17/bai_tap/bai_tap2/source_file.txt");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            String s = "nguyen duc tinh";
            ous.writeUTF(s);
            ous.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        write();
        copyFileUsingStream();
    }

}