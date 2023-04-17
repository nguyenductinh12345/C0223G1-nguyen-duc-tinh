package ss12.bai_tap.bai_tap1.Repository;

import ss12.bai_tap.bai_tap1.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    Scanner scanner = new Scanner(System.in);
    private static ArrayList<Product> productArrayList = new ArrayList<>();

    static {
        productArrayList.add(new Product(1, "ca kho", 53000));
        productArrayList.add(new Product(2, "pho bo", 60000));
        productArrayList.add(new Product(3, "bun rieu cua", 45000));
        productArrayList.add(new Product(4, "bun bo hue", 50000));
    }

    @Override
    public List<Product> getProductList() {
        return productArrayList;
    }

    @Override
    public void themSanPham(Product product) {
        productArrayList.add(product);
    }

    @Override
    public boolean suaThongTin(int id,Product product) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == id) {
                System.out.println("Bạn có chắc chắn muốn sửa thông tin của sản phẩm có id là: " + id + "không? \n" +
                        "1.Có\n" +
                        "2.Không.");
                int xacNhanSua = Integer.parseInt(scanner.nextLine());
                if (xacNhanSua == 1) {
                    productArrayList.set(i,product);
                    return true;
                }else if (xacNhanSua==2){
                    return false;
                }
            }

        }
        return false;
    }

    @Override
    public boolean xoaSanPham(int id) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == id) {
                System.out.println("Bạn có chắc chắn muốn xoá sản phẩm có id là: " + id + "không? \n" +
                        "1.xoá\n" +
                        "2.không.");
                int xacNhan = Integer.parseInt(scanner.nextLine());
                if (xacNhan == 1) {
                    productArrayList.remove(i);
                    return true;
                } else if (xacNhan == 2) {
                    return false;
                }
            }

        }
        return false;
    }

    @Override
    public boolean timKiem(String ten) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getTen().equals(ten)){
                System.out.println(productArrayList.get(i));
                return true;
            }

        }
        return false;
    }
}