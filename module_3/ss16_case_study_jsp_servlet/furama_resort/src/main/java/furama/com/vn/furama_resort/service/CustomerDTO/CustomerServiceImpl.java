package furama.com.vn.furama_resort.service.CustomerDTO;

import furama.com.vn.furama_resort.model.customer.Customer;
import furama.com.vn.furama_resort.JDBC.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    @Override
    public List<Customer> listAllCustomer(int page) throws SQLException {
        List<Customer> customerList = new ArrayList<>();

        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from customer");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            Customer customer = new Customer();
            customer.setCustomerId(resultSet.getInt("customer_id"));
            customer.setName(resultSet.getString("customer_name"));
            customer.setBirthday(resultSet.getDate("customer_birthday"));
            customer.setGender(resultSet.getBoolean("customer_gender"));
            customer.setIdCard(resultSet.getString("customer_id_card"));
            customer.setPhone(resultSet.getString("customer_phone"));
            customer.setEmail(resultSet.getString("customer_email"));
            customer.setAddress(resultSet.getString("customer_address"));
            customer.setCustomerTypeId(resultSet.getInt("customer_type_id"));

            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public void createCustomer(Customer customer) {

    }
}
