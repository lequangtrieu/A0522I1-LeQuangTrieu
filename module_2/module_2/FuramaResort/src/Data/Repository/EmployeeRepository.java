package Data.Repository;

import Models.Person.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> displayAll();
    void addEmployee(Employee employee);
    void editEmployee(Employee employee);

}
