package furama.com.vn.furama_resort.service.ServiceDTO;

import furama.com.vn.furama_resort.model.service.RentType;
import furama.com.vn.furama_resort.model.service.Service;
import furama.com.vn.furama_resort.model.service.ServiceType;

import java.sql.SQLException;
import java.util.List;

public interface ServiceDTOService {
    List<Service> getAllService(int page) throws SQLException;
    void createService(Service service) throws SQLException;

    List<ServiceType> getAllServiceType() throws SQLException;

    List<RentType> getAllRentType() throws SQLException;

    void updateService(Service service) throws SQLException;

    Service getServiceById(int serviceId) throws SQLException;
}
