package repository;

import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    private static final String SELECT_ALL_PRODUCT = "select * from product";

    private static final String DELETE_PRODUCT = "delete from product where id = ?;";

    private static final String INSERT_PRODUCT = "INSERT INTO product " + "VALUES " + "(?,?,?,?,?,?,?,?,?);";

    private static final String SEARCH = "select * from product " + "where room_type like ? or floor like ? or price_rent like ?;";

    private static final String SEARCH_FLOOR = "select * from product " + "where floor like ?;";

    @Override
    public List<Product> selectAllProduct() {
        List<Product> list = new ArrayList<>();
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String area = resultSet.getString("area");
                String status = resultSet.getString("status");
                String floor = resultSet.getString("floor");
                String roomType = resultSet.getString("room_type");
                String detail = resultSet.getString("detail");
                String priceRent = resultSet.getString("price_rent");
                String dateBegin = resultSet.getString("date_begin");
                String dateEnd = resultSet.getString("date_end");

                Product product = new Product(id, area, status, floor, roomType, detail, priceRent, dateBegin, dateEnd);
                list.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Product selectProduct(String key) {
        return null;
    }

    @Override
    public boolean deleteProduct(String id) throws SQLException {
        boolean rowDelete;
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(DELETE_PRODUCT)
        ) {
            statement.setString(1, id);
            rowDelete = statement.executeUpdate() > 0;
        }
        return rowDelete;
    }

    @Override
    public void insertProduct(Product product) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT);
        preparedStatement.setString(1, product.getId());
        preparedStatement.setString(2, product.getArea());
        preparedStatement.setString(3, product.getStatus());
        preparedStatement.setString(4, product.getFloor());
        preparedStatement.setString(5, product.getRoomType());
        preparedStatement.setString(6, product.getDetail());
        preparedStatement.setString(7, product.getPriceRent());
        preparedStatement.setString(8, product.getDateBegin());
        preparedStatement.setString(9, product.getDateEnd());
        preparedStatement.executeUpdate();
    }

    @Override
    public List<Product> search(String keySearch) {
        List<Product> list = new ArrayList<>();
        keySearch = "%"+keySearch+"%";

        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SEARCH)
        ) {
            preparedStatement.setString(1, keySearch);
            preparedStatement.setString(2, keySearch);
            preparedStatement.setString(3, keySearch);
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String area = resultSet.getString("area");
                String status = resultSet.getString("status");
                String floor = resultSet.getString("floor");
                String roomType = resultSet.getString("room_type");
                String detail = resultSet.getString("detail");
                String priceRent = resultSet.getString("price_rent");
                String dateBegin = resultSet.getString("date_begin");
                String dateEnd = resultSet.getString("date_end");

                Product product = new Product(id, area, status, floor, roomType, detail, priceRent, dateBegin, dateEnd);
                list.add(product);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Product> searchFloor(String keySearch) {
        List<Product> list = new ArrayList<>();
        keySearch = "%"+keySearch+"%";

        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_FLOOR)
        ) {
            preparedStatement.setString(1, keySearch);
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String area = resultSet.getString("area");
                String status = resultSet.getString("status");
                String floor = resultSet.getString("floor");
                String roomType = resultSet.getString("room_type");
                String detail = resultSet.getString("detail");
                String priceRent = resultSet.getString("price_rent");
                String dateBegin = resultSet.getString("date_begin");
                String dateEnd = resultSet.getString("date_end");

                Product product = new Product(id, area, status, floor, roomType, detail, priceRent, dateBegin, dateEnd);
                list.add(product);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
