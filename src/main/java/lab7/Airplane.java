package lab7;

public class Airplane {
    private String manufacturer;
    private String model;

    public Airplane(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public class Wing {
        private int wingWeight; // в тоннах

        public Wing(int weight) {
            this.wingWeight = weight;
        }

        /*public void getWingWeight() {
            System.out.println("Вес крыла самолета (в тоннах) - " + wingWeight);
        }*/

        public void printWingWeight() {
            System.out.println("Вес крыла самолета " + manufacturer + " " + model + " составляет примерно " + wingWeight + " т.");
        }

    }
}
