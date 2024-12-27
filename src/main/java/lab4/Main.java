package lab4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Part1 part1 = new Part1();
        Part2 part2 = new Part2();
        Scanner sc = new Scanner(System.in);

        // Part 1
        /// Task 1
        part1.printOddNum();

        /// Task 2
        part1.printDivisibleBy3And5();

        /// Task 3
        System.out.print("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = sc.nextInt();

        System.out.println("Результат: " + part1.isSumEqual(num1, num2, num3));

        /// Task 4
        System.out.print("Введите первое число: ");
        num1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        num2 = sc.nextInt();
        System.out.print("Введите третье число: ");
        num3 = sc.nextInt();

        System.out.println("Результат: " + part1.numberComparison(num1, num2, num3));

        /// Task 5
        System.out.print("Введите количество элементов в массиве (минимальный размер массива - 2 элемента): ");
        int arrLength = sc.nextInt();
        arrLength = part1.checkArrayLength(sc, arrLength);

        System.out.print("Через пробел введите элементы массива: ");
        int[] arr1 = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Array = " + Arrays.toString(arr1) + "\n" + part1.is3FirstOrLast(arr1));

        /// Task 6
        System.out.print("Введите количество элементов в массиве: ");
        arrLength = sc.nextInt();

        System.out.print("Через пробел введите элементы массива: ");
        int[] arr2 = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Array = " + Arrays.toString(arr2) + "\n" + part1.has1Or3(arr2));

        // Part 2
        /// Task 1
        System.out.print("Введите количество элементов в массиве: ");
        arrLength = sc.nextInt();

        System.out.print("Через пробел введите элементы массива: ");
        int[] arr3 = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr3[i] = sc.nextInt();
        }

        part2.checkSortAsc(arr3);

        /// Task 2
        System.out.print("Array length: ");
        arrLength = sc.nextInt();
        sc.skip("\\R?");

        System.out.println("Numbers of array:");
        String[] stringArr = new String[arrLength];
        for (int i = 0; i < arrLength; i++) {
            stringArr[i] = sc.nextLine();
        }

        System.out.println("Result: " + Arrays.toString(part2.stringArrToIntArr(stringArr)));

        /// Task 3
        System.out.print("Введите количество элементов в массиве: ");
        arrLength = sc.nextInt();

        System.out.print("Через пробел введите элементы массива: ");
        int[] arr5 = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr5[i] = sc.nextInt();
        }

        System.out.println("Array 1: " + Arrays.toString(arr5));
        System.out.println("Array 2: " + Arrays.toString(part2.swapFirstAndLast(arr5)));

        /// Task 4
        System.out.print("Введите количество элементов в массиве: ");
        arrLength = sc.nextInt();

        System.out.print("Через пробел введите элементы массива: ");
        int[] arr6 = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr6[i] = sc.nextInt();
        }

        part2.findFirstUnique(arr6);

        /// Task 5
        System.out.print("Чтобы заполнить массив случайными числами, через пробел введите его размер, а также нижнюю и верхнюю границу диапазона чисел: ");
        arrLength = sc.nextInt();
        int lowBound = sc.nextInt();
        int upBound = sc.nextInt();

        Random random = new Random();
        int[] arr7 = random.ints(arrLength, lowBound, upBound).toArray();
        System.out.println("Несортированный массив: " + Arrays.toString(arr7));
        System.out.println("Сортированный массив: " + Arrays.toString(part2.mergeSort(arr7)));
    }
}

