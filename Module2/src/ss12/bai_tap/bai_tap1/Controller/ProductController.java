package ss12.bai_tap.bai_tap1.Controller;

import ss12.bai_tap.bai_tap1.Service.ProductService;
import java.util.Scanner;

public class ProductController {
    Scanner scanner = new Scanner(System.in);
   private ProductService productService=new ProductService();
   public void hienThiProductMenu(){
       boolean flag = true;
       do {
           System.out.print("-----Quản lý sản phẩm----------\n" +
                   "1.Thêm sản phẩm\n" +
                   "2.Sửa thông tin sản phẩm\n" +
                   "3.Xoá sản phẩm \n" +
                   "4.Hiểm thị danh sách sản phẩm\n" +
                   "5.Tìm kiếm sản phẩm\n" +
                   "0.Thoát\n" +
                   "Nhấn lựa chọn của bạn");
           String xacNhan = scanner.nextLine();
           switch (xacNhan){
               case "1":
                   productService.themSanPham();
                   break;
               case "2":
                   productService.suaSanPham();
                   break;
               case "3":
                   productService.xoaSanPham();
                   break;
               case "4":
                   productService.hienThiSanPham();
                   break;
               case "5":
                   productService.timSanPham();
                   break;
               case "0":
                   flag = false;
                   break;
               default:
                   System.out.println("Bạn nhâp chưa đúng yêu cầu");
                   break;
           }


       }while (flag);
   }

}
