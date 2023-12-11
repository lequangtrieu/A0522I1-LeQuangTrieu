package furama.com.vn.furama_resort.model.customer;

public class CustomerType {
    private Integer customerTypeID;
    private String customerTypeName;

    public CustomerType() {
    }

    public CustomerType(Integer customerTypeID, String customerTypeName) {
        this.customerTypeID = customerTypeID;
        this.customerTypeName = customerTypeName;
    }

    public Integer getCustomerTypeID() {
        return customerTypeID;
    }

    public void setCustomerTypeID(Integer customerTypeID) {
        this.customerTypeID = customerTypeID;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }
}
