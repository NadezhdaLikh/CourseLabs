package lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class Part1 {
    public int checkArrayLength(Scanner sc, int length) {
        while (length < 2) {
            System.out.print("Недопустимый размер массива! Повторите ввод: "); // Дополнительно проверить тип входных данных
            length = sc.nextInt();
        }
        return length;
    }

    // Task 1
    public void printOddNum() {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    // Task 2
    public void printDivisibleBy3And5() {
        ArrayList<Integer> divisibleBy3 = new ArrayList<>();
        ArrayList<Integer> divisibleBy5 = new ArrayList<>();
        ArrayList<Integer> divisibleBy3And5 = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 & i % 5 != 0) {
                divisibleBy3.add(i);
            } else if (i % 3 != 0 & i % 5 == 0) {
                divisibleBy5.add(i);
            } else if (i % 3 == 0 & i % 5 == 0) {
                divisibleBy3And5.add(i);
            }
        }

        System.out.println("Делится на 3: " + divisibleBy3);
        System.out.println("Делится на 5: " + divisibleBy5);
        System.out.println("Делится на 3 и на 5: " + divisibleBy3And5);
    }

    // Task 3
    public boolean isSumEqual(int x, int y, int z) {
        return x + y == z;
    }

    // Task 4
    public boolean numberComparison(int x, int y, int z) {
        return y > x & z > y;
    }

    // Task 5
    public boolean is3FirstOrLast(int[] array) {
        return array[0] == 3 | array[array.length - 1] == 3;
    }

    // Task 6
    public boolean has1Or3 (int[] array) {
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 | array[i] == 3) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
