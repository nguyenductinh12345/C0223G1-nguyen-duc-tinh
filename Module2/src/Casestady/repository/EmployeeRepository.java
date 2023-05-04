package Casestady.repository;

import Casestady.model.person.Employee;
import Casestady.repository.interfaceRepo.IEmployeeRepository;
import Casestady.util.FuramaReaderAndWrite.ReaderAndWriteEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    public ReaderAndWriteEmployee readerAndWrite = new ReaderAndWriteEmployee();
    List<Employee> employeeList = new ArrayList<>();

    @Override
    public void editEmployee() {
        readerAndWrite.writeFile("/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/Casestady/data/Employee.csv", employeeList);
    }

    public int checkCMND(String cmnd) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (cmnd.equals(employeeList.get(i).getSoCMND())) {
                System.out.println("Đã tìm thấy nhân viên muốn sửa");
                System.out.println(employeeList.get(i));
                return i;
            }
        }
        System.out.println("Số CMND không tồn tại");
        return -1;
    }

    @Override
    public List<Employee> showList() {
        employeeList = readerAndWrite.readFile("/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/Casestady/data/Employee.csv");
        return employeeList;
    }

    @Override
    public void addNew(Employee employee) {
        employeeList=readerAndWrite.readFile("/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/Casestady/data/Employee.csv");
        employeeList.add(employee);
        readerAndWrite.writeFile("/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/Casestady/data/" +
                "Employee.csv", employeeList);
    }
}
