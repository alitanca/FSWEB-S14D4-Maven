
package org.example.model;

public class Bread extends ProductForSale {
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Bread -> type=" + getType() + ", price=" + getPrice() + ", desc=" + getDescription());
    }
}
