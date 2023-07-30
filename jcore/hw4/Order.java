package ru.gb.jcore.hw4;

public class Order {
    Customer customer;
    Product product;
    private int amount;

    public Order(Customer customer, Product product, int amount) {
        this.customer = customer;
        this.product = product;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "" + customer +
                ", " + product +
                ", amount=" + amount +
                '}';
    }
}
