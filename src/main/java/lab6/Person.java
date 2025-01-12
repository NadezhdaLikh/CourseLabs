package lab6;

public class Person {
    protected String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void printInfo(){
        System.out.println("Возраст - " + age);
    }
}
