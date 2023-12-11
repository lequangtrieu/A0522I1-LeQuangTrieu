package furama.com.vn.furama_resort.service.UserDTO;

import furama.com.vn.furama_resort.model.user.User;

import java.sql.SQLException;

public interface UserService {
    User findUserByUsernameAndPassword(String username, String password) throws SQLException;
}
