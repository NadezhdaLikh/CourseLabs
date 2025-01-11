package lab6;

public class Dog extends Animal {
    private String breed;
    private String funcPurpose; // рабочие, домашние (семейные), пастушьи, сторожевые, охотничьи, ездовые

    public Dog(String breed, String funcPurpose) {
        this.breed = breed;
        this.funcPurpose = funcPurpose;
    }

    public String getBreed() {
        return breed;
    }

    public void printLifespan() {
        System.out.println("Продолжительность жизни у породы " + breed + " - " + lifespan + " лет.");
    }

    /*public int printLifespan() {
        return getLifespan();
    }*/
}
