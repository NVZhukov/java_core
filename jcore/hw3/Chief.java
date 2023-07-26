package ru.gb.jcore.hw3;

/*
Опишите класс руководителя, наследник от сотрудника.
Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом,
чтобы он мог поднять заработную плату всем, кроме руководителей.
 */

public class Chief extends Employee{

    public Chief(String fullName, String position, int phoneNumber, int salary, int age) {
        super(fullName, position, phoneNumber, salary, age);
    }

    public static void raiseSalary(Employee[] arr) {
        for (Employee e: arr) {
            if(!e.getClass().getSimpleName().equals("Chief")) {
                e.raise(5000);
            }
        }
    }

    public static void raiseSalary(Employee[] arr, int age, int sum) {
        for (Employee e:arr) {
            if(e.getAge() > age) {
                if (!(e instanceof Chief)) {
                    e.setSalary(e.getSalary() + sum);
                }
            }
        }
    }
}
