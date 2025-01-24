package lab10;

import java.io.*;

import java.nio.file.Files;
import java.nio.file.Path;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1
        // Написать метод, который читает текстовый файл и возвращает его в виде списка строк
        Path path1 = Path.of("files/task1.txt");
        System.out.println(readTextFile(path1));

        // Task 2
        // Написать метод, который записывает в файл строку, переданную параметром
        Path path2 = Path.of("files/task2.txt");

        Scanner sc = new Scanner(System.in);
        String strParam = sc.nextLine();

        writeLineToFile(path2, strParam);

        // Task 3
        // Используя решения 1 и 2, напишите метод, который склеивает два текстовых файла в один
        mergeTwoFiles(path1, path2);

        // Task 4
        // Написать метод, который заменяет в файле всё, кроме букв и цифр, на знак ‘$’
        char c = sc.nextLine().charAt(0);
        replaceCharacter(path1, c);
    }

    private static List<String> readTextFile(Path path) {
        List<String> strList = new ArrayList<>();

        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                strList.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return strList;
    }

    private static void writeLineToFile(Path path, String line) {
        File file = path.toFile();

        try (FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            if (file.length() != 0) {
                bufferedWriter.write(" "); // Добавляем пробел перед новым предложением
            }
            bufferedWriter.write(line);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void mergeTwoFiles(Path path1, Path path2) { // Содержимое второго файла копируется в первый файл
        for (String str : readTextFile(path2)) {
            writeLineToFile(path1, str);
        }
    }

    private static void replaceCharacter(Path path, char c) {
        String replacement = "\\" + c;
        List<String> result = new ArrayList<>();

        for (String str : readTextFile(path)) {
            result.add(str.replaceAll("[^a-zA-Z0-9]", replacement));
        }

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path)) {
            for (String str : result) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
