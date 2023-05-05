package Casestady.service;

import Casestady.model.person.Employee;
import Casestady.repository.EmployeeRepository;
import Casestady.service.interfaceService.IEmployeeService;
import Casestady.util.regex.Validete;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Validete validete = new Validete();
    EmployeeRepository employeeRepository = new EmployeeRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void editEMployee() {

        String editCMND = "";
        this.showList();
        int check = 0;
        do {
            System.out.println("Nhập số CMND của nhân viên cần sửa");
            try {
                editCMND = scanner.nextLine();
                check = employeeRepository.checkCMND(editCMND);
            } catch (NumberFormatException e) {
                System.err.println("Bạn nhập sai vui lòng nhập lại");
            }
        } while (check == -1);
        int choice = 0;
        do {
            System.out.println("Bạn muốn sửa thông tin nào ?\n" +
                    "1. Mã\n" +
                    "2. Họ và Tên\n" +
                    "3. Ngày sinh\n" +
                    "4. Giới tính\n" +
                    "5. Số chứng minh nhân dân\n" +
                    "6. Số điện thoại\n" +
                    "7. Email\n" +
                    "8. Trình độ\n" +
                    "9. Vị trí\n" +
                    "10. lương\n" +
                    "11. Thoát sửa chữa. ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng lựa chọn trong khoảng từ 1 đến 11");
            }
            switch (choice) {
                case 1:
                    String editMa = "";
                    do {
                        System.out.println("Vui lòng nhập mã mới");
                        editMa = scanner.nextLine();
                        if (validete.employeeRegexMa(editMa)) {
                            System.out.println("Sửa mã thành công");
                            employeeRepository.showList().get(check).setMa(editMa);
                            employeeRepository.editEmployee();
                        } else {
                            System.err.println("Mã mới nhập sai định dạng vui lòng nhập lại");
                        }
                    } while (!validete.employeeRegexMa(editMa));
                    break;
                case 2:
                    String editTen = "";
                    do {
                        System.out.println("Vui lòng nhập tên mới");
                        editTen = scanner.nextLine();
                        if (validete.regexTen(editTen)) {
                            System.out.println("Sửa tên thành công.");
                        }
                        System.err.println("Tên vừa nhập sai định dạng vui lòng nhập lại");
                    } while (!validete.regexTen(editTen));
                    break;
                case 3:
                    String editNgaySinh = "";
                    do {
                        System.out.println("nhập ngày sinh mới.");
                        editNgaySinh = scanner.nextLine();
                        if (validete.regextuoi(editNgaySinh)) {
                            System.out.println("Sửa ngày sinh thành công");
                            employeeRepository.showList().get(check).setNgaySinh(editNgaySinh);
                            employeeRepository.editEmployee();
                        } else {
                            System.err.println("Ngày sinh vừa nhập sai định dạng vui lòng nhập lại");
                        }
                    } while (!validete.regextuoi(editNgaySinh));
                    break;
                case 4:
                    String editGioiTinh = "";
                    int choiceGioiTinh = 0;
                    do {
                        System.out.println("Vui lòng lựa chọn giới tính mới:\n" +
                                "1.Nam\n" +
                                "2.Nữ");
                        try {
                            choiceGioiTinh = Integer.parseInt(scanner.nextLine());
                            if (choiceGioiTinh == 1) {
                                editGioiTinh = "Nam";
                                break;
                            } else if (choiceGioiTinh == 2) {
                                editGioiTinh = "Nữ";
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.err.println("Vui lòng lựa chon 1 hoặc 2");
                        }
                        employeeRepository.showList().get(check).setGioiTinh(editGioiTinh);
                        employeeRepository.editEmployee();
                    } while (true);
                    break;
                case 5:
                    String editSoCMND = "";
                    do {
                        System.out.println("Vui lòng nhập số CMND mới");
                        editSoCMND = scanner.nextLine();
                        if (validete.regexCmnd(editSoCMND)) {
                            System.out.println("Đã sửa số CMND thành công");
                            employeeRepository.showList().get(check).setSoCMND(editSoCMND);
                            employeeRepository.editEmployee();
                        }
                        System.err.println("Số CMND vừa nhập không chính xác vui lòng nhập lại");

                    } while (!validete.regexCmnd(editSoCMND));
                    break;
                case 6:
                    String editSoDienThoai = "";
                    do {
                        System.out.println("Nhập số điên thoại mới");
                        editSoDienThoai = scanner.nextLine();
                        if (validete.regexSoDienThoai(editSoDienThoai)) {
                            System.out.println("Sửa số điên thoại thành công");
                            employeeRepository.showList().get(check).setSoDienThoai(editSoDienThoai);
                            employeeRepository.editEmployee();
                        }
                        System.err.println("Số điên thoại bạn nhập không đúng vui lòng nhập lại");
                    } while (!validete.regexSoDienThoai(editSoDienThoai));
                    break;
                case 7:
                    System.out.println("Vui lòng nhập email mới");
                    String editEmail = scanner.nextLine();
                    employeeRepository.showList().get(check).setEmail(editEmail);
                    employeeRepository.editEmployee();
                    break;
                case 8:
                    String editTrinhDo = "";
                    do {
                        System.out.println("Vui lòng lựa chọn trình độ của nhân viên\n" +
                                "1.Trung cấp\n" +
                                "2.Cao đẳng\n" +
                                "3.Đại học\n" +
                                "4.Sau đại học.");
                        int choiceTrinhDo = Integer.parseInt(scanner.nextLine());
                        switch (choiceTrinhDo) {
                            case 1:
                                editTrinhDo = "Trung cấp";
                                break;
                            case 2:
                                editTrinhDo = "Cao đẳng";
                                break;
                            case 3:
                                editTrinhDo = "Đại học";
                                break;
                            case 4:
                                editTrinhDo = "Sau đại học";
                                break;
                            default:
                                System.err.println("Vui òng lựa chọn trong khoảng từ 1 đến 4");
                        }
                        break;
                    } while (true);
                    employeeRepository.showList().get(check).setTrinhDo(editTrinhDo);
                    employeeRepository.editEmployee();
                    break;
                case 9:
                    String editViTri = "";
                    do {
                        System.out.println("Vui lòng lựa chọn trình độ mới của nhân viên\n" +
                                "1.Lễ tân\n" +
                                "2.Phục vụ\n" +
                                "3.Chuyên viên\n" +
                                "4.Giám sát\n" +
                                "5.Quản lý\n" +
                                "6.Giám đốc.\n" +
                                "Vui lòng lựa chọn trong khảng từ 1 đến 6");
                        int choiceViTri = Integer.parseInt(scanner.nextLine());
                        switch (choiceViTri) {
                            case 1:
                                editViTri = "Lễ tân";
                                break;
                            case 2:
                                editViTri = "Phục vụ";
                                break;
                            case 3:
                                editViTri = "Chuyên viên";
                                break;
                            case 4:
                                editViTri = "Giám sát";
                                break;
                            case 5:
                                editViTri = "Quản lý";
                                break;
                            case 6:
                                editViTri = "Giám đốc";
                                break;
                            default:
                                System.err.println("Vui lòng lựa chọn trong khoảng từ 1 đến 6");
                                break;
                        }
                        break;
                    } while (true);
                    employeeRepository.showList().get(check).setViTri(editViTri);
                    employeeRepository.editEmployee();
                    break;
                case 10:
                    long editLuong = 0;
                    do {
                        System.out.println("Vui lòng nhập mức lương mới");
                        editLuong = Long.parseLong(scanner.nextLine());
                        if (editLuong<=0){
                            System.err.println("Lương phải lớn hơn 0");
                        }else System.out.println("Đã sửa thành công");
                        employeeRepository.showList().get(check).setLuong(editLuong);
                        employeeRepository.editEmployee();
                    } while (editLuong <= 0);
                    break;
                case 11:
                    this.showList();
                    break;
                default:
                    System.err.println("Vui long nhập trong khoảng từ 1 đến 11");
                    break;
            }

        } while (choice != 11);
    }

    @Override
    public void showList() {
        List<Employee> employeeList = employeeRepository.showList();
        for (Employee e : employeeList) {
            System.out.println(e);
        }

    }

    @Override
    public void addNew() {
        String addma;
        do {
            System.out.println("vui lòng nhập mã nhân viên mới:");
            addma = scanner.nextLine();
            if (validete.employeeRegexMa(addma)) {
                System.out.println("Nhập mã thành công");
            } else {
                System.err.println("Bạn đã nhập sai");
            }
        } while (!validete.employeeRegexMa(addma));
        String addHoTen;
        do {
            System.out.println("Vui lòng nhập họ tên nhân viên:");
            addHoTen = scanner.nextLine();
            if (validete.regexTen(addHoTen)) {
                System.out.println(" Nhập tên thành công");
            } else {
                System.err.println("Bạn đã nhập sai");
            }
        } while (!validete.regexTen(addHoTen));
        String addNgaySinh;
        do {
            System.out.println("Vui lòng nhập ngày sinh nhân viên\n" +
                    "theo dạng xxxx-xx-xx");
            addNgaySinh = scanner.nextLine();
            if (validete.regextuoi(addNgaySinh)) {
                System.out.println("Nhập ngày sinh thành công");
            } else {
                System.err.println("Vui lòng nhập đúng ngày sing theo kiểu xxxx-xx-xx");
            }
        } while (!validete.regextuoi(addNgaySinh));


        System.out.println("Vui lòng nhập giới tính nhân viên\n" +
                "1.Nam\n" +
                "2.Nữ");
        String addGioiTinh = String.valueOf(false);
        do {
            int chon = Integer.parseInt(scanner.nextLine());
            if (chon == 1) {
                addGioiTinh = String.valueOf(true);
                break;
            } else if (chon == 2) {
                addGioiTinh = String.valueOf(false);
                break;
            } else {
                System.err.println("Vui lòng chọn 1 hoặc 2");
            }
        } while (true);
        String addSoCMND = "";
        int check = 0;
        do {
            System.out.println("vui lòng nhập số CMND nhân viên mới");
            addSoCMND = scanner.nextLine();
            check = employeeRepository.timKiem(addSoCMND);
            if (validete.regexCmnd(addSoCMND) && check == -1) {
                System.out.println("Thêm số CMND thành công");
            } else {
                System.err.println("Số chứng minh sai hoặc đã tồn vui lòng nhập lại");
            }
        } while (!validete.regexCmnd(addSoCMND) || check != -1);
        String addSoDienThoai;
        do {
            System.out.println("vui lòng nhập số điện thoại nhân viên mới");
            addSoDienThoai = scanner.nextLine();
            if (validete.regexSoDienThoai(addSoDienThoai)) {
                System.out.println("Nhập số điện thoại thành công");
            } else {
                System.err.println("Sai số điện thoại vui lòng hập lại");
            }
        } while (!validete.regexSoDienThoai(addSoDienThoai));


        System.out.println("vui lòng nhập email nhân viên mới");
        String addEmail = scanner.nextLine();
        System.out.println("vui lòng nhập trình độ nhân viên mới\n" +
                "1.Trung cấp\n" +
                "2.Cao đẳng\n" +
                "3.Đại học\n" +
                "4.Sau đại học.");
        String addTrinhDo;
        do {
            int trinhDo = Integer.parseInt(scanner.nextLine());

            if (trinhDo == 1) {
                addTrinhDo = "Trung cấp";
                break;
            } else if (trinhDo == 2) {
                addTrinhDo = "Cao Đẳng";
                break;
            } else if (trinhDo == 3) {
                addTrinhDo = "Đại học";
                break;
            } else if (trinhDo == 4) {
                addTrinhDo = "Sau đại học";
                break;
            } else {
                System.err.println("Vui lòng lựa chọn trong khoảng từ 1 đến 4");
            }
        }
        while (true);
        System.out.println("vui lòng nhập vị trí nhân viên mới\n" +
                "1.Lễ tân\n" +
                "2.Phục vụ\n" +
                "3.Chuyên viên\n" +
                "4.Giám sát\n" +
                "5.Quản lý\n" +
                "6.Giám đốc.\n" +
                "Vui lòng lựa chọn trong khảng từ 1 đến 6");
        String addViTri;
        do {

            int viTri = Integer.parseInt(scanner.nextLine());

            if (viTri == 1) {
                addViTri = "Lễ tân";
                break;
            } else if (viTri == 2) {
                addViTri = "Phục vụ";
                break;
            } else if (viTri == 3) {
                addViTri = "Chuyên viên";
                break;
            } else if (viTri == 4) {
                addViTri = "Giám sát";
                break;
            } else if (viTri == 5) {
                addViTri = "Quản lý";
                break;
            } else if (viTri == 6) {
                addViTri = "Giám đốc";
                break;
            } else {
                System.err.println("Vui lòng nhập từ 1 đến 6");
            }
        } while (true);
        long addmucLuong = 0;
        do {
            System.out.println("Vui lòng nhập mức lương");
            try {
                addmucLuong = (long) Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai vui lòng nhập");
                continue;
            }
            if (addmucLuong <= 0) {
                System.err.println("Lương phải lớn hơn 0");
            } else {
                break;
            }

        } while (true);

        Employee addemployee = new Employee(addma, addHoTen, addNgaySinh, addGioiTinh, addSoCMND, addSoDienThoai,
                addEmail, addTrinhDo, addViTri, addmucLuong);
        employeeRepository.addNew(addemployee);
        System.out.println("Đã thêm mới thành công");
        this.showList();
    }
}
