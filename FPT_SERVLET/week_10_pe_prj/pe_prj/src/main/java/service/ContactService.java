package service;

import model.Contact;
import model.GroupContact;

import java.sql.SQLException;
import java.util.List;

public interface ContactService {
    List<Contact> selectAllContact() throws SQLException;

    Contact findContactById(int id) throws SQLException;

    List<GroupContact> selectAllGroupContact();

    void addContact(Contact contact) throws SQLException;

    void updateContact(Contact contact) throws SQLException;

    Integer countSizeContact() throws SQLException;

    void addGroupList(GroupContact groupContact) throws SQLException;

    void deleteContactById(int id) throws SQLException;

    String getGroupNameById(int id);
}
