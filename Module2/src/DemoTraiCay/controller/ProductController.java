package DemoTraiCay.controller;

import DemoTraiCay.service.ProductService;

import java.util.Scanner;

public class ProductController {
    Scanner scanner = new Scanner(System.in);
    ProductService productService = new ProductService();
    public void showmenu(){
        int choice = 0;
        do {
        System.out.println("--------------Quản lý trái cây--------------\n" +
                "1.Hiển thị danh sách \n" +
                "2.Thêm sản phẩm\n" +
                "3.Tìm kiếm sản phẩm theo tên\n" +
                "4.Sửa sản phẩm theo id\n" +
                "5. Xoá sản phẩm theo id\n" +
                "6. Thoát.\n"+
                "Vui lòng lựa chọn thao tác bằng cách lựa chọn từ 1 đến 6");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng không chọn chữ cái");
            }
            switch (choice){
                case 1:
                    productService.displayProduct();
                    break;
                case 2:
                    productService.addProduct();
                    break;
                case 3:
                    productService.timKiemProduct();
                    break;
                case 4:
                    productService.editProduct();
                    break;
                case 5:
                    productService.deletProduct();
                    break;
                case 6:
                    break;
                default:
                    System.err.println("Vui lòng lựa chọn trong  khoảng từ 1 đén 6");
                    break;
            }
        }while (choice!=6);

    }
}
