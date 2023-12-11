package furama.com.vn.furama_resort.service.ContactDTO;

import furama.com.vn.furama_resort.JDBC.DBConnection;
import furama.com.vn.furama_resort.model.contact.Contact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContactServiceImpl implements ContactService{
    @Override
    public List<Contact> getAllContact(int page) throws SQLException {
        List<Contact> contactList = new ArrayList<>();

        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from contact");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            Contact contact = new Contact();
            contact.setContactId(resultSet.getInt("contact_id"));
            contact.setStartDate(resultSet.getTimestamp("contact_start_date"));
            contact.setEndDate(resultSet.getTimestamp("contact_end_date"));
            contact.setDeposit(resultSet.getDouble("contact_deposit"));
            contact.setTotalMoney(resultSet.getDouble("contact_total_money"));
            contact.setEmployeeId(resultSet.getInt("employee_id"));
            contact.setCustomerId(resultSet.getInt("customer_id"));
            contact.setServiceId(resultSet.getInt("service_id"));

            contactList.add(contact);
        }

        return contactList;
    }

    @Override
    public void createContact(Contact contact) {

    }
}
