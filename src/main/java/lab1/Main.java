package lab1;

import java.util.Scanner;

public class Main {
    static void task1() {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
    }

    static void task2() {
        /*В Java при делении целого числа на целое число всегда получается целое число.
        Остаток от деления при этом отбрасывается. Или же можно сказать, что отбрасывается дробная часть.*/
        int res1 = (46 + 10) * (10 / 3);
        System.out.println(res1);

        int res2 = (29) * (4) * (-15);
        System.out.println(res2);
    }

    static void task3() {
        int number = 10500;
        int result = (number/10)/10;
        System.out.println(result);
    }

    static void task4() {
        double result = 3.6 * 4.1 * 5.9;
        System.out.println(result);
    }

    static void task5(Scanner scanner) {
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

    static void task6(Scanner scanner) {
        int b = scanner.nextInt();
        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else System.out.println("Четное");
        scanner.close();
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        Scanner sc = new Scanner(System.in);
        task5(sc);
        task6(sc);
    }
}