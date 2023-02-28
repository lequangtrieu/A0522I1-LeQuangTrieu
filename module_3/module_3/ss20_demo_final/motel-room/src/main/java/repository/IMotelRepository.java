package repository;

import model.Motel;
import model.PaymentType;

import java.sql.SQLException;
import java.util.List;

public interface IMotelRepository {
    List<Motel> selectAllMotel();

    Motel selectMotel(int idKey);

    boolean deleteMotel(int id) throws SQLException;

    List<PaymentType> selectAllPaymentType();

    void insertMotel(Motel motel) throws SQLException;

    boolean update(Motel motel) throws SQLException;

    List<Motel> searchIdNamePhone(String id, String name, String phoneNumber);

    List<Motel> search(String keySearch);

    List<Motel> searchNameAndPhoneNumber(String searchName, String searchPhoneNumber);
}

