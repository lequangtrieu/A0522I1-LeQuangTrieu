package furama.com.vn.furama_resort.service.ServiceDTO;

import furama.com.vn.furama_resort.JDBC.DBConnection;
import furama.com.vn.furama_resort.model.service.RentType;
import furama.com.vn.furama_resort.model.service.Service;
import furama.com.vn.furama_resort.model.service.ServiceType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceDTOServiceImpl implements ServiceDTOService{
    @Override
    public List<Service> getAllService(int page) throws SQLException {
        List<Service> serviceList = new ArrayList<>();

        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from service");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            serviceList.add(this.getInfoServiceToSelectAll(resultSet));
        }

        return serviceList;
    }

    @Override
    public void createService(Service service) throws SQLException {
        Connection connection = DBConnection.getConnection();
        String insertQuery = "INSERT INTO service " +
                "(service_name, service_area, service_cost, service_max_people, " +
                "standard_room, description_other_convenience, pool_area, " +
                "number_of_floors, service_type_id, rent_type_id) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        infoServiceToPrepareStatement(service, preparedStatement);
        preparedStatement.executeUpdate();
    }

    @Override
    public List<ServiceType> getAllServiceType() throws SQLException {
        List<ServiceType> serviceTypeList = new ArrayList<>();

        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from service_type");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            ServiceType serviceType = new ServiceType();
            serviceType.setServiceTypeId(resultSet.getInt("service_type_id"));
            serviceType.setServiceTypeName(resultSet.getString("service_type_name"));

            serviceTypeList.add(serviceType);
        }
        return serviceTypeList;
    }

    @Override
    public List<RentType> getAllRentType() throws SQLException {
        List<RentType> rentTypeList = new ArrayList<>();

        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from rent_type");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            RentType rentType = new RentType();
            rentType.setRentTypeId(resultSet.getInt("rent_type_id"));
            rentType.setRentTypeName(resultSet.getString("rent_type_name"));
            rentType.setRentTypeCost(resultSet.getDouble("rent_type_cost"));

            rentTypeList.add(rentType);
        }
        return rentTypeList;
    }

    @Override
    public void updateService(Service service) throws SQLException {
        Connection connection = DBConnection.getConnection();
        String updateQuery = "UPDATE service SET service_name = ?, service_area = ?, service_cost = ?, " +
                "service_max_people = ?, standard_room = ?, description_other_convenience = ?, " +
                "pool_area = ?, number_of_floors = ?, service_type_id = ?, rent_type_id = ? " +
                "WHERE service_id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
        infoServiceToPrepareStatement(service, preparedStatement);
        preparedStatement.setInt(11, service.getServiceId());
        preparedStatement.executeUpdate();
    }

    @Override
    public Service getServiceById(int serviceId) throws SQLException {
        Service service = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from service where service_id = ?;");
        preparedStatement.setInt(1, serviceId);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            service = this.getInfoServiceToSelectAll(resultSet);
        }
        return service;
    }

    private void infoServiceToPrepareStatement(Service service, PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.setString(1, service.getServiceName());
        preparedStatement.setInt(2, service.getServiceArea());
        preparedStatement.setDouble(3, service.getServiceCost());
        preparedStatement.setInt(4, service.getServiceMaxPeople());
        preparedStatement.setString(5, service.getStandardRoom());
        preparedStatement.setString(6, service.getDescriptionOtherConvenience());
        preparedStatement.setDouble(7, service.getPoolArea());
        preparedStatement.setInt(8, service.getNumberOfFloors());
        preparedStatement.setInt(9, service.getServiceTypeId());
        preparedStatement.setInt(10, service.getRentTypeId());
    }

    private Service getInfoServiceToSelectAll(ResultSet resultSet) throws SQLException {
        Service service = new Service();
        service.setServiceId(resultSet.getInt("service_id"));
        service.setServiceName(resultSet.getString("service_name"));
        service.setServiceArea(resultSet.getInt("service_area"));
        service.setServiceCost(resultSet.getDouble("service_cost"));
        service.setServiceMaxPeople(resultSet.getInt("service_max_people"));
        service.setStandardRoom(resultSet.getString("standard_room"));
        service.setDescriptionOtherConvenience(resultSet.getString("description_other_convenience"));
        service.setPoolArea(resultSet.getDouble("pool_area"));
        service.setNumberOfFloors(resultSet.getInt("number_of_floors"));
        service.setServiceTypeId(resultSet.getInt("service_type_id"));
        service.setRentTypeId(resultSet.getInt("rent_type_id"));
        return service;
    }

}
