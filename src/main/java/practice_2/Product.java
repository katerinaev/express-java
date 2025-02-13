package practice_2;

public class Product {
    String name;
    double price;

    Product(String someName, double somePrice) {
        this.name = someName;
        this.price = somePrice;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    double applyDiscount(double discount) {
        return price -= price * discount / 100;
    }

    void printInfo() {
        System.out.println("Product: " + name + ", Price: " + price + " euro");
    }
}
