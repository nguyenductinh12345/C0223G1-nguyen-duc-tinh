package ss17.bai_tap.bai_tap1.common;

import ss17.bai_tap.bai_tap1.model.SanPham;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ReadsSanPham {
    public List<SanPham> readSanPham(String PATH) {
        FileInputStream fis;
        try {
            fis = new FileInputStream(PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<SanPham> list = (List<SanPham>) ois.readObject();
            return list;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
