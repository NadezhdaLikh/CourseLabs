package lab6;

public class Singer extends Person{
    private String stageNickname;
    private String genre;
    private String countryOfOrigin;

    public Singer(String name, int age, char gender, String stageNickname, String genre, String countryOfOrigin) {
        super(name, age, gender);
        this.stageNickname = stageNickname;
        this.genre = genre;
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public void printInfo() {
        System.out.println("Имя музыкального исполнителя - " + name);
    }
}
