package ss12.bai_tap.bai_tap1.Service;

import ss12.bai_tap.bai_tap1.Repository.ProductRepository;
import ss12.bai_tap.bai_tap1.model.Product;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{
    Scanner scanner=new Scanner(System.in);
    private ProductRepository productRepository = new ProductRepository();
    @Override
    public void hienThiSanPham() {
        List<Product>productList=productRepository.getProductList();
        productList.sort(Comparator.comparing(Product::getGia));
        for (Product p: productList) {
            System.out.println(p);
        }

    }

    @Override
    public void themSanPham() {
        System.out.println("Nhập id sản phẩm cần thêm");
        int idSanPham = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sảm phẩm: ");
        String tenSanPham= scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double giaSanPham=Double.parseDouble(scanner.nextLine());
        Product productMoi = new Product(idSanPham,tenSanPham,giaSanPham);
        productRepository.themSanPham(productMoi);
        System.out.println("Thêm mới sản phẩm thành công");
    }

    @Override
    public void xoaSanPham() {
        System.out.println("Nhập id sản phẩm cần xoá");
        int idXoa=Integer.parseInt(scanner.nextLine());
        boolean xacNhan= productRepository.xoaSanPham(idXoa);
        if (xacNhan){
            System.out.println("Xoa thanh cong");
        }else {
            System.out.println("khong tim thay san pham");
        }

    }

    @Override
    public void suaSanPham() {
        this.hienThiSanPham();
        System.out.println("Nhập id sản phẩm muốn sửa: ");
        int idSua = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập id mới:");
        int idMoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên mới:");
        String tenMoi =scanner.nextLine();
        System.out.println("Nhập giá mới:");
        double giaMoi = Double.parseDouble(scanner.nextLine());
        Product productSua = new Product(idMoi,tenMoi,giaMoi);
        productRepository.suaThongTin(idSua,productSua);
    }

    @Override
    public void timSanPham() {
        System.out.println("Nhập tên sản phẩm muốn tìm:");
        String timTen=scanner.nextLine();
        boolean timThay=productRepository.timKiem(timTen);
        if (timThay){
            System.out.println("Đã tìm thấy sản phẩm ");
        }else {
            System.out.println("Không tìm thấy sản phẩm cần tìm:");
        }
    }
}
