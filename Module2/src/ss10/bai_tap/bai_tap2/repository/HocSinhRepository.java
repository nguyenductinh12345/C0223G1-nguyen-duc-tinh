package ss10.bai_tap.bai_tap2.repository;

import ss10.bai_tap.bai_tap2.model.HocSinh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HocSinhRepository implements IHocSinhRepository {
    private static ArrayList<HocSinh> hocSinhList = new ArrayList<>();

    static {
        hocSinhList.add(new HocSinh(1, "Tinh", "1997", true, "C0223G1", 8));
        hocSinhList.add(new HocSinh(2, "Tai", "1998", true, "C0223G1", 9));
        hocSinhList.add(new HocSinh(3, "Sang", "1999", true, "C0223G1", 9.5));
        hocSinhList.add(new HocSinh(4, "Vu", "2000", true, "C0223G1", 8));
        hocSinhList.add(new HocSinh(5, "khue", "2001", false, "C0223G1", 10));
    }

    Scanner scanner = new Scanner(System.in);


    @Override
    public List<HocSinh> getHocSinhList() {
        return hocSinhList;
    }

    @Override
    public void themHocSinh(HocSinh hocSinh) {
        hocSinhList.add(hocSinh);

    }

    @Override
    public boolean xoaHocSinhTheoMa(int ma) {
        for (int i = 0; i < hocSinhList.size(); i++) {
            if (hocSinhList.get(i).getMa() == ma) {
                System.out.println("Bạn có chắc chắn muốn xoá học sinh có mã là: " + ma + "không\n 1. có\n 2. không");
                int xacNhan = Integer.parseInt(scanner.nextLine());
                if (xacNhan == 1) {
                    hocSinhList.remove(i);
                    return true;
                } else if (xacNhan == 2) {
                    return false;
                }

            }

        }return false;

    }
}