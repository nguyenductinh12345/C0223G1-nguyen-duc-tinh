package ss10.bai_tap.bai_tap2.controller;

import ss10.bai_tap.bai_tap2.service.HocSinhService;

import java.util.Scanner;

public class HocSinhController {
    private HocSinhService hocSinhService = new HocSinhService();
    public void hienThiHocSinhMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("------Quản lý học viên-------\n"+
                    "1. Thêm mới học sinh \n"+
                    "2. Xoá học sinh\n"+
                    "3. Xem danh sách học sinh\n"+
                    "0. Thoát\n"+
                    "Vui lòng chọn chức năng:");
            String chon=scanner.nextLine();
            switch (chon){
                case "1":
                    hocSinhService.themHocSinh();
                    break;
                case "2":
                    hocSinhService.xoaHocSinh();
                    break;
                case "3":
                    hocSinhService.hienThiHocSinhList();
                    break;
                case "0":
                    flag=false;
                    System.out.println("thoát quản lý học sinh.");
                default:
                    System.out.println("Chức năng đã chọn chưa đúng.");
            }
        }while (flag);
    }
}
