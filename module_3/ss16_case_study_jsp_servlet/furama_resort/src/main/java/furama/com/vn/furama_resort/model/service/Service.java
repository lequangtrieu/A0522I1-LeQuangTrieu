package furama.com.vn.furama_resort.model.service;

public class Service {
    private Integer serviceId;
    private String serviceName;
    private Integer serviceArea;
    private Double serviceCost;
    private Integer serviceMaxPeople;
    private String standardRoom;
    private String  descriptionOtherConvenience;
    private Double poolArea;
    private Integer numberOfFloors;
    private Integer serviceTypeId;;
    private Integer rentTypeId;

    public Service() {
    }

    public Service(Integer serviceId, String name, Integer area, Double cost, Integer maxPeople, String standardRoom, String descriptionOtherConvenience, Double poolArea, Integer numberOfFloors, Integer serviceTypeId, Integer rentTypeId) {
        this.serviceId = serviceId;
        this.serviceName = name;
        this.serviceArea = area;
        this.serviceCost = cost;
        this.serviceMaxPeople = maxPeople;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.serviceTypeId = serviceTypeId;
        this.rentTypeId = rentTypeId;
    }

    public Service(String serviceName, Integer serviceArea, Double serviceCost, Integer serviceMaxPeople, String standardRoom, String descriptionOtherConvenience, Double poolArea, Integer numberOfFloors, Integer serviceTypeId, Integer rentTypeId) {
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.serviceTypeId = serviceTypeId;
        this.rentTypeId = rentTypeId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(Integer serviceArea) {
        this.serviceArea = serviceArea;
    }

    public Double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(Double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public Integer getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(Integer serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public Integer getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(Integer serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public Integer getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(Integer rentTypeId) {
        this.rentTypeId = rentTypeId;
    }
}
