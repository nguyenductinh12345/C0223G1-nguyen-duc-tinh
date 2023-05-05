package Casestady.repository.interfaceRepo;

import Casestady.model.person.Customer;

import java.util.List;

public interface ICustomerRepository extends IRepository<Customer>{
    @Override
    List<Customer> showList();

    @Override
    void addNew(Customer customer);
    void editCustomer();
}
