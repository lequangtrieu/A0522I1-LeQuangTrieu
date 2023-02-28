package repository;

import model.Motel;
import model.PaymentType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MotelRepository implements IMotelRepository {
    private static final String SELECT_ALL_MOTEL = "select * from motel;";

    private static final String SELECT_MOTEL_BY_ID = "select * from motel where id = ?;";

    private static final String DELETE_MOTEL = "delete from motel where id = ?;";

    private static final String SELECT_PAYMENT = "select * from payment_type;";

    private static final String INSERT_MOTEL = "INSERT INTO motel (`name`, `phone_number`, `date_begin`, `note`, `id_payment`) \n" + "VALUES \n" + "( ?,?,?,?,?);";

    private static final String UPDATE_MOTEL = "update  motel set  `name` = ?, `phone_number` = ?, `date_begin` = ?, \n" + "`note` = ?, `id_payment` =?\n" + "where id =?;";

    private static final String SEARCH_NAME_AND_PHONE_NUMBER = "select * from motel " + " where id like ? or name like ? or phone_number like ?;";

    @Override
    public List<Motel> selectAllMotel() {
        List<Motel> list = new ArrayList<>();
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_MOTEL);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String phoneNumber = resultSet.getString("phone_number");
                String dateBegin = resultSet.getString("date_begin");
                String note = resultSet.getString("note");
                int idPayment = resultSet.getInt("id_payment");

                Motel motel = new Motel(id, name, phoneNumber, dateBegin, note, idPayment);
                list.add(motel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Motel selectMotel(int idKey) {
        Motel motel = null;
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MOTEL_BY_ID);
            preparedStatement.setInt(1, idKey);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String phoneNumber = resultSet.getString("phone_number");
                String dateBegin = resultSet.getString("date_begin");
                String note = resultSet.getString("note");
                int idPayment = resultSet.getInt("id_payment");
                motel = new Motel(id, name, phoneNumber, dateBegin, note, idPayment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return motel;
    }

    @Override
    public boolean deleteMotel(int id) throws SQLException {
        boolean rowDeleted;
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(DELETE_MOTEL)
        ) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    @Override
    public List<PaymentType> selectAllPaymentType() {
        List<PaymentType> paymentList = new ArrayList<>();
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PAYMENT);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                PaymentType paymentType = new PaymentType(id, name);
                paymentList.add(paymentType);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return paymentList;
    }

    @Override
    public void insertMotel(Motel motel) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_MOTEL);
        preparedStatement.setString(1, motel.getName());
        preparedStatement.setString(2, motel.getPhoneNumber());
        preparedStatement.setString(3, motel.getDateBegin());
        preparedStatement.setString(4, motel.getNote());
        preparedStatement.setInt(5, motel.getIdPayment());
        preparedStatement.executeUpdate();
    }

    @Override
    public boolean update(Motel motel) throws SQLException {
        boolean rowUpdated = false;
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(UPDATE_MOTEL);
            preparedStatement.setString(1, motel.getName());
            preparedStatement.setString(2, motel.getPhoneNumber());
            preparedStatement.setString(3, motel.getDateBegin());
            preparedStatement.setString(4, motel.getNote());
            preparedStatement.setInt(5, motel.getIdPayment());
            preparedStatement.setInt(6, motel.getId());
            preparedStatement.executeUpdate();
            rowUpdated = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdated;
    }

    @Override
    public List<Motel> searchIdNamePhone(String id, String name, String phoneNumber) {
        return null;
    }

    @Override
    public List<Motel> search(String keySearch) {
        List<Motel> list = new ArrayList<>();
        keySearch = "%"+keySearch+"%";

        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_NAME_AND_PHONE_NUMBER)
        ) {
            preparedStatement.setString(1, keySearch);
            preparedStatement.setString(2, keySearch);
            preparedStatement.setString(3, keySearch);
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String phoneNumber = resultSet.getString("phone_number");
                String dateBegin = resultSet.getString("date_begin");
                String note = resultSet.getString("note");
                int idPayment = resultSet.getInt("id_payment");

                Motel motel = new Motel(id, name, phoneNumber, dateBegin, note, idPayment);
                list.add(motel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Motel> searchNameAndPhoneNumber(String searchName, String searchPhoneNumber) {
        return null;
    }
}
