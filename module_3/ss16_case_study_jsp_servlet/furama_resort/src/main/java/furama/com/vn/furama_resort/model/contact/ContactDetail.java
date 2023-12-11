package furama.com.vn.furama_resort.model.contact;

public class ContactDetail {
    private Integer contactDetailId;
    private Integer quantity;
    private Integer contactId;
    private Integer attachServiceId;

    public ContactDetail() {
    }

    public ContactDetail(Integer contactDetailId, Integer quantity, Integer contactId, Integer attachServiceId) {
        this.contactDetailId = contactDetailId;
        this.quantity = quantity;
        this.contactId = contactId;
        this.attachServiceId = attachServiceId;
    }

    public Integer getContactDetailId() {
        return contactDetailId;
    }

    public void setContactDetailId(Integer contactDetailId) {
        this.contactDetailId = contactDetailId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public Integer getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(Integer attachServiceId) {
        this.attachServiceId = attachServiceId;
    }
}
