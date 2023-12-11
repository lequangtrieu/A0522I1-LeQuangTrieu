package furama.com.vn.furama_resort.service.UserDTO;

import furama.com.vn.furama_resort.JDBC.DBConnection;
import furama.com.vn.furama_resort.model.user.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserServiceImpl implements UserService{
    @Override
    public User findUserByUsernameAndPassword(String username, String password) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from user where username = ? and password = ?;");
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();
        User user = null;

        while (resultSet.next()) {
            user = new User();
            user.setUserName(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
            user.setRole(resultSet.getString("role"));
        }
        return user;
    }
}
