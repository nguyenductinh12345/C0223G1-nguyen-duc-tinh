package DemoTraiCay.service;

import DemoTraiCay.model.Product;
import DemoTraiCay.repository.ProductRepository;
import DemoTraiCay.util.ReadAndWriteProduct;
import DemoTraiCay.util.Validete;

import java.util.Scanner;

public class ProductService implements IProductService {
    ProductRepository productRepository = new ProductRepository();
    ReadAndWriteProduct readAndWriteProduct = new ReadAndWriteProduct();
    Validete validete = new Validete();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayProduct() {
        for (Product p : productRepository.showList()) {
            System.out.println(p);
        }
    }

    @Override
    public void addProduct() {
        String addId = "";
        System.out.println(" Vui lòng nhập id sản phẩm theo định dạng TC-xxxx");
        do {
            addId = scanner.nextLine();
            if (validete.regexId(addId)) {
                System.out.println("Thêm id thành công");
            } else {
                System.err.println("VUi lòng nhập id đúng định dang");
            }
        } while (!validete.regexId(addId));
        String addTen = "";
        System.out.println("Vui lòng nhập tên sản phẩm ");
        do {
            addTen = scanner.nextLine();
            if (validete.regexTen(addTen)) {
                System.out.println("Thêm tên thành công");
            } else {
                System.err.println("Vui lòng nhập tên theo đúng định dạng");
            }
        } while (!validete.regexTen(addTen));
        System.out.println("Nhập giá thánh sản phẩm");
        int addGia = 0;
        do {
            try {
                addGia = Integer.parseInt(scanner.nextLine());
                System.out.println("thêm giá thành công");
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng không nhập chữ cái và giá phải lớn hơn không");
            }
        } while (addGia <= 0);

        String addNgayNhapKho = "";
        System.out.println("Vui lòng nhập ngày nhập kho theo định dạng xx-xx-xxxx");
        do {
            addNgayNhapKho = scanner.nextLine();
            if (validete.regexNgay(addNgayNhapKho)) {
                System.out.println("Thêm ngày nhập kho thành công");
            } else {
                System.err.println("Vui lòng nhập ngày đúng định dạng");
            }
        } while (!validete.regexNgay(addNgayNhapKho));
        String addChatLuong = "";
        int choiceChatLuong = 0;
        System.out.println("Vui lòng nhập chất lượng của sản phẩm\n" +
                "1. thượng hạng\n" +
                "2.tốt\n" +
                "3.thường");
        boolean flag;
        do {
            flag = false;
            try {
                choiceChatLuong = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng không nhập chữ cái");
            }
            switch (choiceChatLuong) {
                case 1:
                    addChatLuong = "Thượng hạng";
                    break;
                case 2:
                    addChatLuong = "Tốt";
                    break;
                case 3:
                    addChatLuong = "Thường";
                default:
                    System.err.println("Vui lòng nhập trong khoảng từ 1 đến 3");
                    flag = true;
                    break;
            }
        } while (flag);
        Product product = new Product(addId, addTen, addGia, addNgayNhapKho, addChatLuong);
        productRepository.addProduct(product);
        System.out.println("Thêm sản phẩm mới thành công");
        this.displayProduct();
    }

    @Override
    public void timKiemProduct() {

    }

    @Override
    public void editProduct() {
        System.out.println("Vui lòng nhập id sản phẩm muốn sửa");
        this.displayProduct();
        String checkId = "";
        Product product = null;
        do {
            checkId = scanner.nextLine();
            product = productRepository.checkId(checkId);
            if (product == null) {
                System.err.println("không tìm thấy sản phẩm cần có id vừa nhập");
            }
        } while (product == null);
        int choiceEdit = 0;
        do {
            System.out.println("Vui lòng nhập thuộc tính bạn muốn sửa\n" +
                    "1.tên\n" +
                    "2.giá\n" +
                    "3.ngày nhập kho\n" +
                    "4.chất lượng\n" +
                    "5.Thoát sửa chữa\n" +
                    "Vui lòng lựa chọn từ 1 đến 5");

            try {
                choiceEdit = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng không nhập chữ cái");
            }
            switch (choiceEdit) {
                case 1:
                    System.out.println("Vui lòng nhập tên mới cho sản phẩm");
                    String editTen = "";
                    do {
                        editTen = scanner.nextLine();
                        if (validete.regexTen(editTen)) {
                            System.out.println("Sửa tên sản phẩm thành công");
                        } else {
                            System.err.println("Vui lòng nhập tên theo đúng định dạng");
                        }
                    } while (!validete.regexTen(editTen));
                    product.setTen(editTen);
                    break;
                case 2:
                    System.out.println("Vui lòng nhập giá mới cho sản phẩm");
                    int eitGia = 0;

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.err.println("Vui lòng lựa chọn trong khoảng từ 1 đến 6");
                    break;
            }
        } while (choiceEdit != 5);
        productRepository.editProduct();
//        (String id, String ten, int gia, String ngayNhapKho, String chatLuong
    }

    @Override
    public void deletProduct() {

    }
}
