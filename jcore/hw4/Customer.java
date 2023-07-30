package ru.gb.jcore.hw4;

public class Customer {
    private String fullName;
    private int age;
    private String phoneNum;

    public Customer(String fullName, int age, String phoneNum) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                 fullName +
                ", " + age +
                ", " + phoneNum +
                '}';
    }
}
