package Model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String infoProduct;
    private String manufacturer;

    public Product() {
    }

    public Product(int id, String name, double price, String infoProduct, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.infoProduct = infoProduct;
        this.manufacturer = manufacturer;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInfoProduct() {
        return infoProduct;
    }

    public void setInfoProduct(String infoProduct) {
        this.infoProduct = infoProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", infoProduct='" + infoProduct + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
