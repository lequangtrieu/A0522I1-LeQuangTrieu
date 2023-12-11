package furama.com.vn.furama_resort.service.EmployeeDTO;

import furama.com.vn.furama_resort.model.employee.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee(int page) throws SQLException;
    void createEmployee(Employee employee);
}
