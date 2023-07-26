package ru.gb.jcore.hw3;

public class Main {
    public static void main(String[] args) {
        Employee[] persArr = new Employee[6];

        persArr[0] = new Employee("Ivan Ivanovich", "cleaner",880020010, 1500, 56);
        persArr[1] = new Employee("Sergey Sergeevich", "manager",880015555, 4500, 38);
        persArr[2] = new Employee("Nikolay Nikolaevich", "seller",880022245, 5000, 47);
        persArr[3] = new Employee("San Sanych", "designer",880049985, 5500, 29);
        persArr[4] = new Employee("Dmitriy Dmitrievich", "director",880080080, 9000, 44);
        persArr[5] = new Chief("Victor Sergeevich", "chief", 100100,10000,50);

        //Employee.raiseSalary(persArr);
        Chief.raiseSalary(persArr,45,3000);

        for (int i = 0; i < persArr.length; i++) {
            System.out.println(persArr[i].infoPrint());
        }

        System.out.println("Средний возраст сотрудников: " + Employee.averageAge(persArr));
        System.out.println("Средняя зарплата сотрудников: " + Employee.averageSalary(persArr));
    }

    /*
    Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
    Возраст и размер повышения должны быть параметрами метода.
    */
    public static void raiseSalary(Employee[] arr, int age, int sum) {
        for (Employee e:arr) {
            if(e.getAge() > age) {
                e.setSalary(e.getSalary() + sum);
            }
        }
    }
}
