package Casestady.service;

import Casestady.model.Facility.Villa;
import Casestady.util.regex.Validete;

import java.util.Scanner;

public class VillaService {
    Scanner scanner = new Scanner(System.in);
    Validete validete = new Validete();

    public void addNewVilla() {
        String addMaDichVu = "";
        do {
            System.out.println("Vui lòng nhập mã dịch vụ theo định dạng SVVL-xxxx");
            addMaDichVu = scanner.nextLine();
            if (validete.regexVilaMa(addMaDichVu)) {
                System.out.println("Thêm mã dịch vụ cho villa thành công");
            } else {
                System.err.println("Vui lòng nhập mã dịch vụ đúng định dạng SVVL-xxxx");
            }
        } while (!validete.regexVilaMa(addMaDichVu));
        String addTenDichVu = "";
        do {
            System.out.println("Vui lòng nhập tên dịch vụ");
            addTenDichVu = scanner.nextLine();
            if (validete.regexTenDichVuFacility(addTenDichVu)) {
                System.out.println("Thêm tên dịch vụ thành công");
            } else {
                System.err.println("Vui lòng ghi hoa chữ cái đầu tiên theo sau là các chữ cái thường");
            }
        } while (!validete.regexTenDichVuFacility(addTenDichVu));
        double addDienTichSuDung = 0;
        System.out.println("Vui lòng nhập diện tích sử dụng đơn vị mặc định là m2");
        do {
            try {
                addDienTichSuDung = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng không nhập chữ cái");
            }
            if (addDienTichSuDung <= 30) {
                System.err.println("Diện tích sử dụng phải lớn hơn 30m2");
            }
        } while (addDienTichSuDung < 30);
        double addchiPhiThue = 0;
        System.out.println("Vui lòng nhập chi phí thuê đơn vị là triệu");
        do {
            try {
                addchiPhiThue = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("vui lòng không nhập chữ cái");
            }

        } while (addchiPhiThue <= 0);
        int addSoNguoiToiDa = 0;
        System.out.println("Vui lòng nhập số người tối đa đơn vị mặc định là người");
        do {
            try {
                addSoNguoiToiDa = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng không nhập chữ cái");
            }

        } while (addSoNguoiToiDa < 0 || addSoNguoiToiDa > 20);
        String addKieuThue = "";
        System.out.println("Vui lòng nhập kiểu thuê của villa");
        addKieuThue = scanner.nextLine();
        String addTieuChuanPhong = "";
        System.out.println("Vui lòng nhập tiêu chuẩn phòng");
        addTieuChuanPhong = scanner.nextLine();
        double addDienTichHoBoi = 0;
        System.out.println("Vui lòng nhập diên tích hồ bơi đơn vị được mắc định là m2");
        do {
            try {
                addDienTichHoBoi = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng không nhập chữ cái");
            }
            if (addDienTichHoBoi < 30) {
                System.err.println("Diện tích hồ bới phải lớn hơn 30m2");
            }

        } while (addDienTichHoBoi <= 30);
        int addSoTang = 0;
        System.out.println("Vui lòng nhập số tầng của villa");
        do {
            try {
                addSoTang=Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng không nhập chữ cái và số tầng phải là số nguyên ");
            }

        } while (addSoTang <= 0);

        Villa villa = new Villa(addMaDichVu,addTenDichVu,addDienTichSuDung,addchiPhiThue,addSoNguoiToiDa,addKieuThue,
                addTieuChuanPhong,addDienTichHoBoi,addSoTang);
    }
}
