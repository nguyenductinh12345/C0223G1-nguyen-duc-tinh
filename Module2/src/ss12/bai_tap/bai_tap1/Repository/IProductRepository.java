package ss12.bai_tap.bai_tap1.Repository;

import ss12.bai_tap.bai_tap1.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductRepository {
    List<Product>getProductList();
    void themSanPham(Product product);
   boolean suaThongTin(int id, Product product);
   boolean xoaSanPham(int id);
   boolean timKiem(String ten);
}
