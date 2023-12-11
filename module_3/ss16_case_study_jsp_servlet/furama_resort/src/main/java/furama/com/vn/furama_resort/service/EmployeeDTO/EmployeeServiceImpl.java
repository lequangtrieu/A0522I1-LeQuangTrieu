package furama.com.vn.furama_resort.service.EmployeeDTO;

import furama.com.vn.furama_resort.JDBC.DBConnection;
import furama.com.vn.furama_resort.model.employee.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public List<Employee> getAllEmployee(int page) throws SQLException {
        List<Employee> employeeList = new ArrayList<>();

        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from employee");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            Employee employee = new Employee();
            employee.setEmployeeId(resultSet.getInt("employee_id"));
            employee.setEmployeeName(resultSet.getString("employee_name"));
            employee.setEmployeeBirthday(resultSet.getDate("employee_birthday"));
            employee.setEmployeeIdCard(resultSet.getString("employee_id_card"));
            employee.setEmployeeSalary(resultSet.getDouble("employee_salary"));
            employee.setEmployeePhone(resultSet.getString("employee_phone"));
            employee.setEmployeeEmail(resultSet.getString("employee_email"));
            employee.setEmployeeAddress(resultSet.getString("employee_address"));
            employee.setPositionId(resultSet.getInt("position_id"));
            employee.setEducationDegreeId(resultSet.getInt("education_degree_id"));
            employee.setDivisionId(resultSet.getInt("division_id"));
            employee.setUsername(resultSet.getString("username"));

            employeeList.add(employee);
        }

        return employeeList;
    }

    @Override
    public void createEmployee(Employee employee) {

    }
}
