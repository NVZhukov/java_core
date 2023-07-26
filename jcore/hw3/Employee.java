package ru.gb.jcore.hw3;

public class Employee {
    private String fullName;
    private String position;
    private int phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, int phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String infoPrint() {
        return String.format("Сотрудник: %s,должность: %s,номер телефона: %d,зарплата %d,возраст %d", fullName, position, phoneNumber, salary, age);
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee: ");
        sb.append("fullName='").append(fullName).append('\'');
        sb.append(", position='").append(position).append('\'');
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", salary=").append(salary);
        sb.append(", age=").append(age);
        sb.append('.');
        return sb.toString();
    }

    /*
    Создать метод повышения в качестве статического в классе сотрудника.
    Метод должен принимать в качестве параметра массив сотрудников.
     */
    public static void raiseSalary(Employee[] arr) {
        for (Employee e: arr) {
            if(e.getAge() > 45) {
                e.raise(5000);
            }
        }
    }

    public void raise(int sum) {
        this.salary += sum;
    }

    /*
    Написать методы (принимающие на вход массив сотрудников), вычисляющие средний возраст и
    среднюю зарплату сотрудников, вывести результаты работы в консоль.
     */

    public static float averageAge(Employee[] arr) {
        float average = 0;
        for (Employee e: arr) {
            average += e.getAge();
        }
        return average / arr.length;
    }

    public static float averageSalary(Employee[] arr) {
        float average = 0;
        for (Employee e: arr) {
            average += e.getSalary();
        }
        return average / arr.length;
    }
}
