package lab6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1
        Human clientA = new Client("Иван", "Иванов", "Сбербанк");
        Client clientB = new Client("Петр", "Петров", "ВТБ");
        // Human clientC = new Human("Александр", "Александров"); // 'Human' is abstract; cannot be instantiated
        Human clientC = new BankEmployee("Василий", "Васильев", "Альфа-Банк");
        // BankEmployee clientD = new Human("Александр", "Александров"); // 'Human' is abstract; cannot be instantiated
        BankEmployee clientD = new BankEmployee("Сергей", "Сергеев", "Тинькофф Банк");

        clientA.printFromAbstract();
        clientB.printFromAbstract();
        clientC.printFromAbstract();
        clientD.printFromAbstract();

        // Task 2
        clientB.printFromInterface();
        clientD.printFromInterface();

        // Task 3
        Truck truck1 = new Truck(2200, "Scania", 'w', 87, 910);
        Truck truck2 = new Truck(2600, "Volvo", 'r', 80, 4, 900);
        // Car truck3 = new Truck(2400, "Renault", 'g', 84, 4, 840);

        System.out.print("Введите количество колес у автомобиля марки " + truck1.model + ": ");
        truck1.newWheels(sc.nextInt());
        truck1.output();

        truck2.output();

        // Task 4
        Animal animal = new Dog("Золотистый ретривер", "Семейная порода");
        // Dog dog = new Animal(); // Required type: Dog, Provided: Animal
        Dog dog = new Dog("Пудель", "Рабочая порода");

        System.out.print("Введите продолжительность жизни у породы  " + dog.getBreed() + ": ");
        dog.setLifespan(sc.nextInt());
        dog.printLifespan();

        // Task 5
        // В пятой задаче вам нужно переопределить метод, который в родителе выводит возраст
        Singer singer1 = new Singer("Алиша Бет Мур", 45, 'f', "Pink", "Поп", "US");
        singer1.printInfo();
    }
}
