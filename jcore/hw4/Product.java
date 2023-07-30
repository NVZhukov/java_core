package ru.gb.jcore.hw4;

public class Product {
    private String title;
    private float price;

    public Product(String title, float price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "" + title +
                ", " + price +
                '}';
    }
}
