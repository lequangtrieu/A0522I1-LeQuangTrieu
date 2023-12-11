package model;

public class GroupContact {
    private int id;
    private String groupName;
    private String description;

    public GroupContact() {
    }

    public GroupContact(int id, String groupName, String description) {
        this.id = id;
        this.groupName = groupName;
        this.description = description;
    }

    public GroupContact(String groupName, String description) {
        this.groupName = groupName;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
