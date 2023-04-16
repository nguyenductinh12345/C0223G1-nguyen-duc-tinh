package ss10.bai_tap.bai_tap2.repository;

import ss10.bai_tap.bai_tap2.model.HocSinh;

import java.util.ArrayList;
import java.util.List;

public interface IHocSinhRepository {
   List<HocSinh>getHocSinhList();
   void themHocSinh(HocSinh hocSinh);
   boolean xoaHocSinhTheoMa(int ma);
}
