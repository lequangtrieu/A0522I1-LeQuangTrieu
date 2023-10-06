package entity;
public class MenuAndPrice {
    private int id;
    private String name;
    private String content;
    private float price;

    public MenuAndPrice() {
    }

    public MenuAndPrice(int id, String name, String content, float price) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
