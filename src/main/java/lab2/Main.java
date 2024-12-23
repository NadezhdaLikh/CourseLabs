package lab2;

import java.util.Scanner;

public class Main {
    private static boolean isInteger(double x) {
        return x == (int) x;
    }

    private static boolean isLong(double x) {
        return x == (long) x & x <= Long.MAX_VALUE & x >= Long.MIN_VALUE;
    }

    private static int calculate(Calculator calculator, int x, int y, char op) {
        return switch (op) {
            case '+' -> calculator.add(x, y);
            case '-' -> calculator.sub(x, y);
            case '*' -> calculator.mul(x, y);
            case '/' -> calculator.div(x, y);
            default -> throw new IllegalArgumentException();
        };
    }

    private static long calculate(Calculator calculator, long x, long y, char op) {
        return switch (op) {
            case '+' -> calculator.add(x, y);
            case '-' -> calculator.sub(x, y);
            case '*' -> calculator.mul(x, y);
            case '/' -> calculator.div(x, y);
            default -> throw new IllegalArgumentException();
        };
    }

    private static double calculate(Calculator calculator, double x, double y, char op) {
        return switch (op) {
            case '+' -> calculator.add(x, y);
            case '-' -> calculator.sub(x, y);
            case '*' -> calculator.mul(x, y);
            case '/' -> calculator.div(x, y);
            default -> throw new IllegalArgumentException();
        };
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double input1 = sc.nextDouble();
        System.out.println("Введите второе число:");
        double input2 = sc.nextDouble();
        System.out.println("Выберите арифметическую операцию (+, -, * или /):");
        char operation = sc.next().charAt(0);

        double result;

        if (isInteger(input1) & isInteger(input2)) {
            result = calculate(calculator, (int) input1, (int) input2, operation);
        } else if (isLong(input1) & isLong(input2)) {
            result = calculate(calculator, (long) input1, (long) input2, operation);
        } else
            result = calculate(calculator, input1, input2, operation);

        System.out.println(result);

        sc.close();

        Human human1 = new Human();
        System.out.println(human1.getFirstName() + " "
                + human1.getLastName() + ", "
                + human1.getSex() + ", "
                + human1.getAge() + ", "
                + human1.marriageStatus(human1.getIsMarried()) + ", "
                + human1.parenthoodStatus(human1.getHasKids()));

        Human human2 = new Human("Jane", "Doe", 'f', 30, false, false);
        System.out.println(human2.getFirstName() + " "
                + human2.getLastName() + ", "
                + human2.getSex() + ", "
                + human2.getAge() + ", "
                + human2.marriageStatus(human1.getIsMarried()) + ", "
                + human2.parenthoodStatus(human1.getHasKids()));
    }
}
