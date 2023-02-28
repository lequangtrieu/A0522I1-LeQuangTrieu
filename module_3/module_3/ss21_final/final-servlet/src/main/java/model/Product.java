package model;

public class Product {
    private String id;
    private String area;
    private String status;
    private String floor;
    private String roomType;
    private String detail;
    private String priceRent;
    private String dateBegin;
    private String dateEnd;

    public Product() {
    }

    public Product(String id, String area, String status, String floor, String roomType, String detail, String priceRent, String dateBegin, String dateEnd) {
        this.id = id;
        this.area = area;
        this.status = status;
        this.floor = floor;
        this.roomType = roomType;
        this.detail = detail;
        this.priceRent = priceRent;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPriceRent() {
        return priceRent;
    }

    public void setPriceRent(String priceRent) {
        this.priceRent = priceRent;
    }

    public String getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(String dateBegin) {
        this.dateBegin = dateBegin;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }
}
