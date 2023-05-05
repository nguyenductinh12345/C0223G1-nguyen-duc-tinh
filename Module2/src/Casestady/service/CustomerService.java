package Casestady.service;

import Casestady.model.person.Customer;
import Casestady.repository.CustomerRepository;
import Casestady.service.interfaceService.ICustomerService;
import Casestady.util.regex.Validete;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    CustomerRepository customerRepository = new CustomerRepository();
    Scanner scanner = new Scanner(System.in);
    Validete validete = new Validete();

    @Override
    public void showCustomer() {
        List<Customer> customerList = customerRepository.showList();
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void addCustomer() {
        String addMa = "";
        do {
            System.out.println("Vui lòng nhập mã khách hàng:");
            addMa = scanner.nextLine();
            if (validete.customerMa(addMa)) {
                System.out.println("Nhập mã khách hàng thành công");
            } else {
                System.err.println("Mã khách hàng sai định dạng vui lòng nhập lại");
            }

        } while (!validete.customerMa(addMa));
        String addHoTen = "";
        do {
            System.out.println("Vui lòng nhập họ tên khách hàng với mỗi chữ cái đầu của tên sẽ viết hoa");
            addHoTen = scanner.nextLine();
            if (validete.regexTen(addHoTen)) {
                System.out.println("Thêm họ tên thành công");
            } else {
                System.err.println("họ và tên sai định dạng vui lòng nhập lại");
            }
        } while (!validete.regexTen(addHoTen));
        String addTuoi = "";
        do {
            System.out.println("Nhập ngày tháng năm sinh của khách hàng theo định dạng xxxx-xx-xx");
            addTuoi = scanner.nextLine();
            if (validete.regextuoi(addTuoi)) {
                System.out.println("Thêm ngày tháng năm sinh thành công");
            } else {
                System.err.println("Nhập sai định dạng hoặc chưa đủ 18 tuổi");
            }
        } while (!validete.regextuoi(addTuoi));
        String addGioiTinh = "";
        int choiceTuoi = 0;
        System.out.println("Nhập giới tính khách hàng:\n" +
                "1.Nam\n" +
                "2.Nữ");
        do {
            try {
                choiceTuoi = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("chọn 1 hoặc 2 không chonnj ký tự");
            }

            if (choiceTuoi == 1) {
                addGioiTinh = "Nam";
                break;
            } else if (choiceTuoi == 2) {
                addGioiTinh = "Nữ";
            } else {
                System.err.println("Vui lòng chọn 1 hoặc 2");
            }
        } while (true);
        String addCMND = "";
        do {
            System.out.println("Nhập số chứng minh nhân dân của khách hàng gồm 9 hoặc 12 số");
            addCMND = scanner.nextLine();
            if (validete.regexCmnd(addCMND)) {
                System.out.println(" thêm số chứng minh nhân dân thành công");
            } else {
                System.err.println("Số CMND sai định dạng vui lòng nhập lại");
            }
        } while (!validete.regexCmnd(addCMND));
        String addSoDienThoai = "";
        do {
            System.out.println("Nhập số điện thoại của khách hàng bắt đầu bằng số 0 gồm 10 số");
            addSoDienThoai = scanner.nextLine();
            if (validete.regexSoDienThoai(addSoDienThoai)) {
                System.out.println("Thêm số điện thoại thành công");
            } else {
                System.err.println("Số điên thoại sai định dạng vui lòng nhập lại");
            }

        } while (!validete.regexSoDienThoai(addSoDienThoai));
        String addEmail = "";
        System.out.println("Vui lòng nhập email của khách hàng");
        addEmail = scanner.nextLine();
        String addLoaiKhach = "";
        int choiceLoaiKhach = 0;
        boolean flag;
        System.out.println("Vui lòng lựa chọn loại khách hàng:\n" +
                "1.Diamond\n" +
                "2.Platinum\n" +
                "3.Gold\n" +
                "4.Silver\n" +
                "5.Member");
        do {
            flag = false;
            try {
                choiceLoaiKhach = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng không chọn kí tự chữ cái");
            }
            switch (choiceLoaiKhach) {
                case 1:
                    addLoaiKhach = "Diamond";
                    break;
                case 2:
                    addLoaiKhach = "Platinum";
                    break;
                case 3:
                    addLoaiKhach = "Gold";
                    break;
                case 4:
                    addLoaiKhach = "Silver";
                    break;
                case 5:
                    addLoaiKhach = "Member";
                    break;
                default:
                    System.err.println("Vui lòng lựa chọn trong khoảng từ 1 đến 5");
                    flag = true;
                    break;
            }
        } while (flag);
        System.out.println("Vui lòng nhập địa chỉ khách hàng");
        String addDiaChi = scanner.nextLine();
        Customer customer = new Customer(addMa, addHoTen, addTuoi, addGioiTinh, addCMND, addSoDienThoai, addEmail, addLoaiKhach, addDiaChi);
        customerRepository.addNew(customer);
        System.out.println("Thêm mới thành công");
        this.showCustomer();
    }

    @Override
    public void editCustomer() {
        String xacNhanMa = "";
        Customer customer = null;
        do {
            System.out.println("Vui lòng nhập mã khách hàng muốn sửa");
            try {
                xacNhanMa = scanner.nextLine();
                customer = customerRepository.checkMa(xacNhanMa);
            } catch (Exception e) {
                System.err.println("Bạn nhập sai vui lòng nhập lại");
            }
        } while (customer == null);
        int choice = 0;
        do {
            System.out.println("Vui lòng lựa chọn thuộc tính muốn sửa\n" +
                    "1.Họ và tên\n" +
                    "2.Ngày sinh\n" +
                    "3.Giới tính\n" +
                    "4.Số CMND\n" +
                    "5.Số điện thoại\n" +
                    "6.Email\n" +
                    "7.Loại khách\n" +
                    "8.Địa chỉ\n" +
                    "9.Thoát sửa chữa");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng không nhập chữ");
            }
            switch (choice) {
                case 1:
                    String editTen = "";
                    do {
                        System.out.println("Vui lòng nhập tên mới ");
                        editTen = scanner.nextLine();
                        if (validete.regexTen(editTen)) {
                            System.out.println("Sửa tên thành công");
                        } else {
                            System.err.println("Vui lòng nhập đúng định dạng tên");
                        }
                    } while (!validete.regexTen(editTen));
                    customer.setHoTen(editTen);
                    break;
                case 2:
                    String editNgaySinh = "";
                    do {
                        System.out.println("Nhập ngày sinh mới của khách hàng");
                        editNgaySinh = scanner.nextLine();
                        if (validete.regextuoi(editNgaySinh)) {
                            System.out.println("Sửa ngày sinh thành công");
                        } else {
                            System.err.println("Ngày sinh nhập sai định dạng hoặc chưa đủ 18 tuổi");
                        }
                    } while (!validete.regextuoi(editNgaySinh));
                    customer.setNgaySinh(editNgaySinh);
                    break;
                case 3:
                    String editGioiTinh = "";
                    int choiceGioiTinh = 0;
                    do {
                        System.out.println("Vui lòng lựa chọn giới tính\n" +
                                "1.Nam\n" +
                                "2.Nữ");
                        try {
                            choiceGioiTinh=Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.err.println("Vui lòng không nhập chữ cái hãy chọn 1 hoặc 2");
                        }
                        if (choiceGioiTinh==1){
                            editGioiTinh="Nam";
                        }else if (choiceGioiTinh==2){
                            editGioiTinh="Nữ";
                        }else {
                            System.err.println("Vui lòng lựa chọn 1 hoặc 2");
                        }
                    } while (choiceGioiTinh != 1 && choiceGioiTinh != 2);
                    customer.setGioiTinh(editGioiTinh);
                    break;
                case 4:
                    String editCMND = "";
                    do {
                        System.out.println("Nhập số CMND mới");
                        editCMND = scanner.nextLine();
                        if (validete.regexCmnd(editCMND)){
                            System.out.println("Sửa số CMND thành công");
                        }else {
                            System.err.println("Số CMND sai định dạng vui lòng nhập lại");
                        }
                    }while (!validete.regexCmnd(editCMND));
                    customer.setSoCMND(editCMND);
                    break;
                case 5:
                    String editSoDienThoai = "";
                    do {
                        System.out.println("Vui lòng nhập số điên thoại mới");
                        editSoDienThoai = scanner.nextLine();
                        if (validete.regexSoDienThoai(editSoDienThoai)){
                            System.out.println("Sửa số điện thoại thành công");
                        }else {
                            System.err.println("Số điên thoại sai định dạng vui lòng nhập lại");
                        }
                    }while (!validete.regexSoDienThoai(editSoDienThoai));
                    customer.setSoDienThoai(editSoDienThoai);
                    break;
                case 6:
                    String editEmail = "";
                    System.out.println("Vui lòng nhập email mới");
                    editEmail = scanner.nextLine();
                    System.out.println("Sửa email thành công");
                    customer.setEmail(editEmail);
                    break;
                case 7:
                    String editLoaiKhach = "";
                    int choiceEditLoaiKhach = 0;
                    boolean check;
                    System.out.println("Vui lòng lựa chọn loại khách hàng:\n" +
                            "1.Diamond\n" +
                            "2.Platinum\n" +
                            "3.Gold\n" +
                            "4.Silver\n" +
                            "5.Member");
                    do {
                        check = false;
                    try {
                        choiceEditLoaiKhach = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.err.println("Vui lòng không nhập chữ cái");
                    }
                        switch (choiceEditLoaiKhach){
                            case 1:
                                editLoaiKhach = "Diamond";
                                break;
                            case 2:
                                editLoaiKhach = "Platinum";
                                break;
                            case 3:
                                editLoaiKhach = "Gold";
                                break;
                            case 4:
                                editLoaiKhach = "Silver";
                                break;
                            case 5:
                                editLoaiKhach = "Member";
                                break;
                            default:
                                System.err.println("Vui lòng nhập trong khoảng từ 1 đến 5");
                                check = true;
                                break;
                        }
                    }while (check);
                    System.out.println("Sửa thành công");
                    customer.setLoaiKhach(editLoaiKhach);
                    break;
                case 8:
                    String editDiaChi = "";
                    System.out.println("Vui lòng nhập địa chỉ mới");
                    editDiaChi = scanner.nextLine();
                    customer.setDiaChi(editDiaChi);
                    break;
                case 9:
                    break;
                default:
                    System.err.println("Vui lòng nhập trong khoảng từ 1 đến 10");
                    break;
            }

        } while (choice != 9);
        customerRepository.editCustomer();
    }
}
