package ss22_case_study.Models.Facility;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceName, int usingArea, int price, int amountPeople, String rentType, String freeService) {
        super(serviceName, usingArea, price, amountPeople, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return getServiceName()
                + "," + getUsingArea()
                + "," + getPrice()
                + "," + getAmountPeople()
                + "," + getRentType()
                + "," + freeService;
    }


    public String displayRoom() {
        return "Room{" +
                "serviceName='" + getServiceName() + '\'' +
                ", usingArea=" + getUsingArea() +
                ", price=" + getPrice() +
                ", amountPeople=" + getAmountPeople() +
                ", rentType='" + getRentType() + '\'' +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
