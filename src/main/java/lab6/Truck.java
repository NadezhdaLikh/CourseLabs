package lab6;

public class Truck extends Car{
    private int numOfWheels;
    private int maxWeight;

    public Truck(int weight, String model, char color, float speed, int numOfWheels, int maxWeight) {
        super(weight, model, color, speed);
        this.numOfWheels = numOfWheels;
        this.maxWeight = maxWeight;
    }

    public Truck(int weight, String model, char color, float speed, int maxWeight) {
        super(weight, model, color, speed);
        this.maxWeight = maxWeight;
    }

    public void newWheels(int x) {
        numOfWheels = x;
        System.out.println("Количество колес у автомобиля марки " + model + " - " + numOfWheels + ".");
    }
}
