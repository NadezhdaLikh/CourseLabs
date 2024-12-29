package lab5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task  1
        String text = sc.nextLine();
        findLongestWord(text);

        // Task 2
        String word = sc.nextLine();
        System.out.println("Является ли данное слово палиндромом? " + checkIfPalindrome(word));

        // Task 3
        String rawText = sc.nextLine();
        censorText(rawText);

        // Task 4
        String str = sc.nextLine(); // "Java, do you know what OOP is? Java, you must know this stuff!"
        String substr = sc.nextLine(); // Java
        System.out.println("Количество вхождений подстроки " + substr + " в данную строку - " + countOccurrences(str, substr));

        // Task 5
        String originalStr = sc.nextLine(); // This is a test string
        System.out.println("The given String is: " + originalStr);
        reverseStr(originalStr);

        System.out.println("The string reversed word by word is:" + "\n" + reverseStr(originalStr));
    }

    // Task 1
    private static void findLongestWord(String text) {
        if (text != null && !text.isEmpty()) {
            String editedText = text.replaceAll("\\p{Punct}", "");
            char[] charArray = editedText.toCharArray();

            int cnt = 0; // Счетчик количества символов в слове
            int max = 1; // Слово максимальной длины
            int startPos = 0; // Индекс первого символа самого длинного слова в тексте

            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] != ' ') {
                    cnt++; // Считаем количество символов в слове
                    if (cnt > max) {
                        startPos = i - cnt + 1;
                        max = cnt;
                    }
                } else {
                    cnt = 0;
                }
            }

            System.out.println("Самое длинное слово в тексте - " + editedText.substring(startPos, startPos + max));
        } else {
            System.out.println("Пустая строка");
        }
    }

    // Task 2
    private static boolean checkIfPalindrome(String word) {
        boolean isPalindrome = false;
        int length = word.length();

        for (int i = 0; i < length/2; i++) {
            isPalindrome = word.charAt(i) == word.charAt(length - i - 1);
        }

        return isPalindrome;
    }

    // Task 3
    private static void censorText(String text) {
        System.out.println(text.replaceAll("бяка", "[вырезано цензурой]"));
    }

    // Task 4
    private static int countOccurrences(String str, String substr) {
        String editedStr = str.replaceAll("\\p{Punct}", "");
        String[] splitStr = editedStr.split(" ");

        int cnt = 0;
        for (String s : splitStr) {
            if (s.equals(substr)) {
                cnt++;
            }
        }

        return cnt;
    }

    // Task 5
    private static StringBuilder reverseStr(String str) {
        String[] splitStr = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < splitStr.length; i++) {
            StringBuilder builder = new StringBuilder(splitStr[i]);
            builder.reverse();
            result.append(builder);
            if (i < splitStr.length - 1) {
                result.append(" ");
            }
        }

        return result;

        // System.out.println(result);

        /*for (int i = 0; i < splitStr.length; i++) {
            char[] charArray = splitStr[i].toCharArray();
            System.out.println(Arrays.toString(charArray));

            for (int j = 0; j < charArray.length / 2; j++) {
                char temp = charArray[j];
                charArray[j] = charArray[charArray.length - j - 1];
                charArray[charArray.length - j - 1] = temp;
            }
        }*/
    }
}
