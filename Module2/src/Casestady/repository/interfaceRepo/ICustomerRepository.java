package Casestady.repository.interfaceRepo;

import Casestady.model.person.Customer;

public interface ICustomerRepository extends IRepository<Customer>{
    void editCustomer(int idex,int ma,String hoten,String ngaySinh,boolean gioiTinh, int soCMND,
                      int soDienThoai, String email, String loaiKhach, String diaChi);
}
