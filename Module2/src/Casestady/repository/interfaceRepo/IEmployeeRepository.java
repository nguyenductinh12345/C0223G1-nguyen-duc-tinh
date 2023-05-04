package Casestady.repository.interfaceRepo;

import Casestady.model.person.Employee;

public interface IEmployeeRepository extends IRepository<Employee>{
    void editEmployee();
}
