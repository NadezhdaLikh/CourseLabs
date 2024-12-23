package lab2;

public class Human {
    private String firstName;
    private String lastName;
    private char sex; // m (aka male) or f (aka female)
    private int age;
    private boolean isMarried;
    private boolean hasKids;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsMarried(boolean married) {
        isMarried = married;
    }

    public void setHasKids(boolean hasKids) {
        this.hasKids = hasKids;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsMarried() {
        return isMarried;
    }

    public boolean getHasKids() {
        return hasKids;
    }

    public String toString() {
        return "First name: " + this.firstName + ",\n" +
                "Last name: " + this.lastName + ",\n" +
                "Sex: " + this.sex + ",\n" +
                "Age: " + this.age + ",\n" +
                "Marriage status: " + this.marriageStatus(this.isMarried) + ",\n" +
                "Parenthood status: " + this.parenthoodStatus(this.hasKids) + "\n";
    }

    public Human() {
        this.firstName = "Joe";
        this.lastName = "Doe";
        this.sex = 'm';
        this.age = 30;
        this.isMarried = false;
        this.hasKids = false;

        System.out.println("Вызываю конструктор без параметров класса Human");
    }

    public Human(String firstName,
                 String lastName,
                 char sex,
                 int age,
                 boolean isMarried,
                 boolean hasKids) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.isMarried = isMarried;
        this.hasKids = hasKids;

        System.out.println("Вызываю конструктор c параметрами класса Human");
    }

    public String marriageStatus(boolean isMarried) {
        if (isMarried) {
            return "married";
        } else return "single";
    }

    public String parenthoodStatus(boolean hasKids) {
        if (hasKids) {
            return "has kids";
        } else return "doesn't have kids";
    }
}
