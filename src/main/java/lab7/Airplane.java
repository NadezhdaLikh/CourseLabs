package lab7;

public class Airplane {
    private String manufacturer;
    private String model;

    public Airplane(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public static class Wing {
        private Airplane airplane;
        private int wingWeight; // в тоннах

        public Wing(Airplane airplane, int weight) {
            this.airplane = airplane;
            this.wingWeight = weight;
        }

        public void printWingWeight() {
            System.out.println("Вес крыла самолета " + airplane.manufacturer + " " + airplane.model + " составляет примерно " + wingWeight + " т.");
        }

    }
}
