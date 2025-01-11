package lab6;

public abstract class Human {
    private String first_name;
    private String last_name;

    public Human(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public abstract void printFromAbstract();
}
