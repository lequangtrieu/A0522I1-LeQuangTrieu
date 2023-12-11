package furama.com.vn.furama_resort.service.ContactDTO;

import furama.com.vn.furama_resort.model.contact.Contact;

import java.sql.SQLException;
import java.util.List;

public interface ContactService {
    List<Contact> getAllContact(int page) throws SQLException;
    void createContact(Contact contact);
}
