package lab3;

public class Cars {
    private String name;
    private int weight; // В килограммах
    private String colour;

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getColour() {
        return this.colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Cars() {}

    public Cars(String colour) {
        this.colour = colour;
    }

    public Cars (int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public String toString() {
        return "Name: " + this.name + "\n" +
                "Weight: " + this.weight + " kg\n" +
                "Colour: " + this.colour + "\n";
    }
}
