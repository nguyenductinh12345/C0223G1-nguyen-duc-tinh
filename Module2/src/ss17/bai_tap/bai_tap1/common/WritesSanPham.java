package ss17.bai_tap.bai_tap1.common;

import ss17.bai_tap.bai_tap1.model.SanPham;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WritesSanPham {
    public void write(List<SanPham> sanPhams) {
        FileOutputStream fos;
        {
            try {
                fos = new FileOutputStream("src/ss17/bai_tap/bai_tap1/sanPham.data");
                ObjectOutputStream ous = new ObjectOutputStream(fos);
                ous.writeObject(sanPhams);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
