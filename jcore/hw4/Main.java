package ru.gb.jcore.hw4;

import java.util.Random;

public class Main {

    private static final Customer[] customers = {new Customer("Ivan Ivanich", 33, "100500"),
            new Customer("Petr Petrovich", 45, "100600")};

    private static final Product[] products = {new Product("shirt", 99.99f),new Product("dress", 59.99f),
            new Product("hat", 9.99f),new Product("jeans", 39.99f),
            new Product("sneakers", 29.99f)};

    private static final Order[] orders = new Order[5];
    
    public static void main(String[] args) {

        Random r = new Random();

        int count = 0;
        int index = 0;
        int customerIndex = 0;
        int prodIndex = 0;

        while (count != orders.length) {
            try {
                for (int i = 0; i < orders.length; i++) {
                    customerIndex = r.nextInt(2);
                    prodIndex = r.nextInt(5);
                    index = i;
                    orders[i] = makePurchase(customers[customerIndex], products[prodIndex],
                            r.nextInt(-5, 110));
                }
            } catch (ProductException e) {
                e.printStackTrace();
            } catch (AmountException e) {
                orders[index] = makePurchase(customers[customerIndex], products[prodIndex], 1);
            } catch (CustomerException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.printf("Совершено покупок: %d%n", count + 1);
            }
            count++;
        }
        printArr(orders);
    }

    private static boolean isProduct(Product[] products, Product product) {
        for (Product p : products) {
            if (p.equals(product)) return true;
        }
        return false;
    }

    private static boolean isCustomer(Customer[] customers, Customer customer) {
        for (Customer c : customers) {
            if (c.equals(customer)) return true;
        }
        return false;
    }

    public static Order makePurchase(Customer c, Product p, int amount) {
        Order order = new Order(c, p, amount);
        if (!isCustomer(customers, c)) {
            throw new CustomerException("Такого покупателя не бывает!");
        }
        if (!isProduct(products, p)) {
            throw new ProductException("Такого товара не существует!");
        }
        if (amount < 0 || amount > 99) {
            throw new AmountException("Неудачное количество)");
        }
        return order;
    }

    public static void printArr(Order[] orders) {
        for (Order o : orders) {
            if (o != null) System.out.println(o.toString());
        }
    }
}
