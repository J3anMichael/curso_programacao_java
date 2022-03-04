package entities;

public class Product {

    // Variaveis
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity = quantity + quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity = quantity - quantity;
    }
}