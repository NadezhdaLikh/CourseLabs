package lab9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 2
        List<Integer> intList1 = new ArrayList<>();
        intList1.add(1);
        intList1.add(2);
        intList1.add(2);
        intList1.add(0);

        System.out.println("Коллекция до удаления дубликатов: " + intList1);
        System.out.println("Коллекция после удаления дубликатов: " + removeDuplicates(intList1));

        // Task 3
        // LinkedList and ArrayList are two different implementations of the List interface.
        // LinkedList implements it with a doubly-linked list. ArrayList implements it with a dynamically re-sizing array.

        ArrayList<Integer> intArrayList = new ArrayList<>();
        // ArrayList has direct references to every element in the list, so it can get the n-th element in constant time.
        // Доступ к элементам по индексу осуществляется за константное время O(1), доступ к элементам по значению - за линейное время O(n)

        LinkedList<Integer> intLinkedList = new LinkedList<>();
        // LinkedList has to traverse the list from the beginning to get to the n-th element.
        // За линейное время O(n) выполняются операции поиска элемента по индексу и по значению

        for (int i = 0; i < 1000000; i++) {
            intArrayList.add(i);
        }

        for (int i = 0; i < 1000000; i++) {
            intLinkedList.add(i);
        }

        long startTime = System.nanoTime();
        getRandomElement(intArrayList);
        long durArrayList = System.nanoTime() - startTime;  // divide by 1000000 to get milliseconds
        System.out.println("Время (в наносекундах), затраченное на ArrayList: " + durArrayList);

        startTime = System.nanoTime();
        getRandomElement(intLinkedList);
        long durLinkedList = System.nanoTime() - startTime;
        System.out.println("Время (в наносекундах), затраченное на LinkedList: " + durLinkedList);
        System.out.println("Разница в затраченном времени:  " + (durLinkedList - durArrayList));

        // Task 4
        Map<User, Integer> playerPoints = new HashMap<>();
        playerPoints.put(new User("Виктория"), 16);
        playerPoints.put(new User("София"), 11);
        playerPoints.put(new User("Кристина"), 15);
        playerPoints.put(new User("Иван"), 9);
        System.out.println(playerPoints);

        User wantedPlayer = new User(sc.next());

        if (playerPoints.containsKey(wantedPlayer)) {
            System.out.println("У игрока с именем " + wantedPlayer.getName() + " " + getPlayerPoints(playerPoints, wantedPlayer) + " очков");
        } else System.out.println("Информация об игроке с именем " + wantedPlayer.getName() + " не найдена:(");
    }

    private static List<Integer> removeDuplicates(List<Integer> intList) {
        // Порядок элементов не сохраняется
        Set<Integer> intSet = new HashSet<>(intList);
        intList.clear();
        intList.addAll(intSet);

        return intList; // [0, 1, 2]

        // Порядок элементов сохраняется
        /*LinkedHashSet<Integer> intLinkedHashSet = new LinkedHashSet<>(intList);
        intList.clear();
        intList.addAll(intLinkedHashSet);

        return intList; // [1, 2, 0]*/
    }

    private static void getRandomElement(List<Integer> list) {
        Random r = new Random();
        for (int i = 0; i < 100000; i++) {
            int e = list.get(r.nextInt(list.size()));
        }
    }

    private static Integer getPlayerPoints(Map<User, Integer> map, User user) {
        return map.get(user);
    }
}
