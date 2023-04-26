package Casestady.repository.interfaceRepo;

import Casestady.model.person.Employee;

public interface IEmployeeRepository extends IRepository<Employee>{
    void editEmployee(int idex,int ma,String hoten,String ngaySinh,boolean gioiTinh, int soCMND,
                      int soDienThoai, String email, String trinhDo, String viTri, double luong);
}
