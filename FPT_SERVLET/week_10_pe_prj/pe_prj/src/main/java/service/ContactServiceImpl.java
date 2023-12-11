package service;

import model.Contact;
import model.GroupContact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContactServiceImpl implements ContactService{
    @Override
    public List<Contact> selectAllContact() throws SQLException {
        List<Contact> list = new ArrayList<>();

        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from contacts");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String phoneNumber = resultSet.getString("phone_number");
            int groupId = resultSet.getInt("group_id");

            Contact contact = new Contact(id, firstName, lastName, phoneNumber, groupId);
            list.add(contact);
        }
        return list;
    }

    @Override
    public Contact findContactById(int id) throws SQLException {
        Contact contact = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from contacts where id = ?;");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String phoneNumber = resultSet.getString("phone_number");
            int groupId = resultSet.getInt("group_id");

            contact = new Contact(id, firstName, lastName, phoneNumber, groupId);
        }
        return contact;
    }

    @Override
    public List<GroupContact> selectAllGroupContact() {
        List<GroupContact> groupContactList = new ArrayList<>();

        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from GroupList");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("group_name");
                String description = resultSet.getString("description");

                GroupContact groupContact = new GroupContact(id, name, description);
                groupContactList.add(groupContact);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return groupContactList;
    }

    @Override
    public void addContact(Contact contact) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into Contacts(first_name, last_name, Group_Id, Phone_Number) values (?,?,?,?);");

        preparedStatement.setString(1, contact.getFirstName());
        preparedStatement.setString(2, contact.getLastName());
        preparedStatement.setInt(3, contact.getGroupId());
        preparedStatement.setString(4, contact.getPhoneNumber());
        preparedStatement.executeUpdate();
    }

    @Override
    public void updateContact(Contact contact) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("update contacts set first_name = ?, last_name = ?, phone_number = ?, group_id = ? where id = ?;");

        preparedStatement.setString(1, contact.getFirstName());
        preparedStatement.setString(2, contact.getLastName());
        preparedStatement.setInt(4, contact.getGroupId());
        preparedStatement.setString(3, contact.getPhoneNumber());
        preparedStatement.setInt(5, contact.getId());
        preparedStatement.executeUpdate();
    }

    @Override

    public Integer countSizeContact() throws SQLException {
        return selectAllContact().size();
    }

    @Override
    public void addGroupList(GroupContact groupContact) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into GroupList(group_name, description) values (?,?);");

        preparedStatement.setString(1, groupContact.getGroupName());
        preparedStatement.setString(2, groupContact.getDescription());
        preparedStatement.executeUpdate();
    }

    @Override
    public void deleteContactById(int id) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("delete from contacts where id = ?;");

        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    @Override
    public String getGroupNameById(int id) {
        List<GroupContact> list = this.selectAllGroupContact();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return list.get(i).getGroupName();
            }
        }
        return null;
    }
}
