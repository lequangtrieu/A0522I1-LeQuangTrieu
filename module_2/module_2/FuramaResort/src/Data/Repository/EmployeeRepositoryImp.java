package Data.Repository;

import Models.Person.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImp implements EmployeeRepository{
    private static List<Employee> employeeList = new ArrayList<>();


    @Override
    public List<Employee> displayAll() {
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void editEmployee(Employee employee) {
        //edit;
    }
}
