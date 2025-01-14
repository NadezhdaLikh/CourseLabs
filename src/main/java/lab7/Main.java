package lab7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Airplane airplane1 = new Airplane("Boeing", "737-800");
        Airplane.Wing wing1 = airplane1.new Wing(sc.nextInt()); // 7
        wing1.printWingWeight();

        Airplane airplane2 = new Airplane("Airbus", "A320");
        Airplane airplane3 = new Airplane("Boeing", "747-400");

        Airplane.Wing wing2 = airplane2.new Wing(sc.nextInt()); // 9
        wing2.printWingWeight();
        Airplane.Wing wing3 = airplane3.new Wing(sc.nextInt()); // 45
        wing3.printWingWeight();
    }
}
