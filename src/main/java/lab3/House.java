package lab3;

import java.time.Year;

public class House {
    private String name;
    private int yearOfConstruction;
    private int numOfFloors;

    public void setAll(String name, int year, int num) {
        this.name = name;
        this.yearOfConstruction = year;
        this.numOfFloors = num;
    }

    public String toString() {
        return "Name: " + this.name + "\n" +
                "Year of construction: " + this.yearOfConstruction + "\n" +
                "Number of floors: " + this.numOfFloors + "\n";
    }

    public int yearsSinceConstruction() {
        int year = Year.now().getValue();
        return year - this.yearOfConstruction;
    }
}
