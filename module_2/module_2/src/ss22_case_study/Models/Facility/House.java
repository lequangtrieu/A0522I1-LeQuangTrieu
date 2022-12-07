package ss22_case_study.Models.Facility;

public class House extends Facility{
    private int levelRoom;
    private int floors;

    public House() {
    }

    public House(int levelRoom, int floors) {
        this.levelRoom = levelRoom;
        this.floors = floors;
    }

    public House(String serviceName, int usingArea, int price, int amountPeople, String rentType, int levelRoom, int floors) {
        super(serviceName, usingArea, price, amountPeople, rentType);
        this.levelRoom = levelRoom;
        this.floors = floors;
    }

    public int getLevelRoom() {
        return levelRoom;
    }

    public void setLevelRoom(int levelRoom) {
        this.levelRoom = levelRoom;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return getServiceName()
                + "," + getUsingArea()
                + "," + getPrice()
                + "," + getAmountPeople()
                + "," + getRentType()
                + "," + levelRoom
                + "," + floors;
    }

    public String displayHouse() {
        return "House{" +
                "serviceName='" + getServiceName() + '\'' +
                ", usingArea=" + getUsingArea() +
                ", price=" + getPrice() +
                ", amountPeople=" + getAmountPeople() +
                ", rentType='" + getRentType() + '\'' +
                "levelRoom=" + levelRoom +
                ", floors=" + floors +
                '}';
    }
}
