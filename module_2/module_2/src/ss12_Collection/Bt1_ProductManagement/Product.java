package ss12_Collection.Bt1_ProductManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Product {
    private Scanner input = new Scanner(System.in);
    private ArrayList<Product> arrayList = new ArrayList<Product>();
    private String id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void addProduct(Product product) {
        this.arrayList.add(product);
    }

    public void editId() {
        System.out.println("enter the id you wanna edit the info: ");
        String id = input.nextLine();
        for (int i = 0; i < arrayList.size(); i++) {
            if (Integer.parseInt(id) == Integer.parseInt(arrayList.get(i).getId())) {
                System.out.println("enter the new name: ");
                String newName = input.nextLine();
                arrayList.get(i).setName(newName);
                System.out.println("enter the new price: ");
                double newPrice = Double.parseDouble(input.nextLine());
                arrayList.get(i).setPrice(newPrice);
            }
        }
    }

    public void removeId() {
        System.out.println("enter the id you wanna remove product: ");
        String id = input.nextLine();
        for (int i = 0; i < arrayList.size(); i++) {
            if (Integer.parseInt(id) == Integer.parseInt(arrayList.get(i).getId())) {
                arrayList.remove(id);
            }
        }
    }

    public void printList() {
        for (Product product :
                arrayList) {
            System.out.println(product);
        }
    }

    public void searchName() {
        System.out.println("enter the name of product you wanna find: ");
        String name = input.nextLine();
        for (int i = 0; i < arrayList.size(); i++) {
            if (name == arrayList.get(i).getName()) {
                System.out.println(arrayList.get(i));
            }
        }
    }

    public void sortDescending() {
        Object temp;
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(i).getPrice() > arrayList.get(j).getPrice()) {
                    temp = arrayList.get(i);
                    arrayList.set(arrayList.indexOf(arrayList.get(i)), arrayList.get(j));
                    arrayList.set(arrayList.indexOf(arrayList.get(j)), (Product) temp);
                }
            }
        }
        for (Product product :
                arrayList) {
            System.out.println(product);
        }
    }

    public void sortAscending() {
//        Object temp;
//        for (int i = 0; i < arrayList.size() - 1; i++) {
//            for (int j = 0; j < arrayList.size(); j++) {
//                if (arrayList.get(i).getPrice() < arrayList.get(j).getPrice()) {
//                    temp = arrayList.get(i);
//                    arrayList.set(arrayList.indexOf(arrayList.get(i)), arrayList.get(j));
//                    arrayList.set(arrayList.indexOf(arrayList.get(j)), (Product) temp);
//                }
//            }
//        }
//        for (Product product :
//                arrayList) {
//            System.out.println(product);
//        }
        sortDescending();
        Collections.reverse(arrayList);
    }


}
