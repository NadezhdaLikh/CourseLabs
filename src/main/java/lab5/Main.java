package lab5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task  1
        String text = sc.nextLine(); // Hello! My name is Nadezhda, I am from Russia.
        System.out.println(findLongestWord(text));

        // Task 2
        String word = sc.nextLine();
        System.out.println("Является ли данное слово палиндромом? " + checkIfPalindrome(word));

        // Task 3
        System.out.println("Введите строку:");
        String rawText = sc.nextLine(); // Фу, бяка, брось! Какой ужас! Бяка!

        System.out.println("Введите слово, которое нужно заменить в строке:");
        String wordToReplace = sc.nextLine(); // бяка

        System.out.println("Введите замену:");
        String replaceWith = sc.nextLine(); // [вырезано цензурой]

        System.out.println(censorText(rawText, wordToReplace, replaceWith));

        // Task 4
        String str = sc.nextLine(); // Java, do you know what OOP is? java, you must know this stuff!
        String substr = sc.nextLine(); // Java
        System.out.println("Количество вхождений данной подстроки в данную строку - " + countOccurrences(str, substr));

        // Task 5
        String originalStr = sc.nextLine(); // This is a test string
        System.out.println("The given String is: " + originalStr);
        reverseStr(originalStr);

        System.out.println("The string reversed word by word is:" + "\n" + reverseStr(originalStr));
    }

    // Task 1
    private static String findLongestWord(String text) {
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

            return editedText.substring(startPos, startPos + max);
        } else {
            return "Вы ввели пустую строку!";
        }
    }

    // Task 2
    private static boolean checkIfPalindrome(String word) {
        // String lower = word.toLowerCase();
        boolean isPalindrome = true;
        int length = word.length();

        for (int i = 0; i < length/2; i++) {
            if (isPalindrome) {
                isPalindrome = word.toLowerCase().charAt(i) == word.toLowerCase().charAt(length - i - 1);
            } else break;
        }

        return isPalindrome;
    }

    // Task 3
    private static String censorText(String text, String wordToReplace, String replacement) {
        String regex = "(?i)\\b" + wordToReplace + "\\b|(?i)" + wordToReplace + "(?=\\p{Punct})";
        // String regex = "(?i)\\b" + wordToReplace + "\\b|(?i)\\b" + wordToReplace + "(?=[\\p{Punct}\\s]*$)";
        return text.replaceAll(regex, replacement);
    }

    // Task 4
    private static int countOccurrences(String str, String substr) {
        String editedStr = str.toLowerCase().replaceAll("\\p{Punct}", "");
        String[] splitStr = editedStr.split(" ");

        int cnt = 0;
        for (String s : splitStr) {
            if (s.equals(substr.toLowerCase())) {
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
