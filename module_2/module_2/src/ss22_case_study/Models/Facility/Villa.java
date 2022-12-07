package ss22_case_study.Models.Facility;

public class Villa extends Facility{
    private int levelRoom;
    private int areaPool;
    private int floors;

    public Villa() {
    }

    public Villa(int levelRoom, int areaPool, int floors) {
        this.levelRoom = levelRoom;
        this.areaPool = areaPool;
        this.floors = floors;
    }

    public Villa(String serviceName, int usingArea, int price, int amountPeople, String rentType, int levelRoom, int areaPool, int floors) {
        super(serviceName, usingArea, price, amountPeople, rentType);
        this.levelRoom = levelRoom;
        this.areaPool = areaPool;
        this.floors = floors;
    }

    public int getLevelRoom() {
        return levelRoom;
    }

    public void setLevelRoom(int levelRoom) {
        this.levelRoom = levelRoom;
    }

    public int getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
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
                + "," + areaPool
                + "," + floors;
    }

    public String displayVilla() {
        return "Villa{" +
                "serviceName='" + getServiceName() + '\'' +
                ", usingArea=" + getUsingArea() +
                ", price=" + getPrice() +
                ", amountPeople=" + getAmountPeople() +
                ", rentType='" + getRentType() + '\'' +
                "levelRoom=" + levelRoom +
                ", areaPool=" + areaPool +
                ", floors=" + floors +
                '}';
    }
}
