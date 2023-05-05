package Casestady.repository;

import Casestady.model.person.Customer;
import Casestady.repository.interfaceRepo.ICustomerRepository;
import Casestady.util.FuramaReaderAndWrite.ReaderAndWriteCustomer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    List<Customer> customerList = new ArrayList<>();
    ReaderAndWriteCustomer readerAndWriteCustomer = new ReaderAndWriteCustomer();

    @Override
    public List<Customer> showList() {
        customerList = readerAndWriteCustomer.readCustomer
                ("/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/Casestady/data/Customer.csv");
        return customerList;
    }

    @Override
    public void addNew(Customer customer) {
        customerList = readerAndWriteCustomer.readCustomer
                ("/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/Casestady/data/Customer.csv");
        customerList.add(customer);
        readerAndWriteCustomer.writeCustomer
                ("/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/Casestady/data/Customer.csv",customerList);
    }

    @Override
    public void editCustomer() {
        readerAndWriteCustomer.writeCustomer
                ("/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/Casestady/data/Customer.csv",customerList);
    }
    public Customer checkMa(String editMa){
        customerList = readerAndWriteCustomer.readCustomer
                ("/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/Casestady/data/Customer.csv");
        for (int i = 0; i < customerList.size(); i++) {
            if (editMa.equals(customerList.get(i).getMa())){
                System.out.println("Đã tìm thấy khách hàng muốn sửa");
                System.out.println(customerList.get(i));
                return customerList.get(i);
            }
            System.out.println("Không tìm thấy khách hàng có id vừa nhập");
        }
        return null;
    }
}
