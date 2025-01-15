package lab7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Airplane airplane1 = new Airplane("Boeing", "737-800");
        Airplane.Wing wing1 = new Airplane.Wing(airplane1, sc.nextInt()); // 7
        wing1.printWingWeight();

        Airplane airplane2 = new Airplane("Airbus", "A320");
        Airplane airplane3 = new Airplane("Boeing", "747-400");

        Airplane.Wing wing2 = new Airplane.Wing(airplane2, sc.nextInt()); // 9
        wing2.printWingWeight();

        Airplane.Wing wing3 = new Airplane.Wing(airplane3, sc.nextInt()); // 45
        wing3.printWingWeight();
    }
}
