package lab3;

public class JavaProgram {
    public static void main(String[] args) {
        // Task 1
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());

        // Task 2
        Cars car1 = new Cars("black");
        car1.setName("Toyota");
        car1.setWeight(1300);
        System.out.println(car1);

        Cars car2 = new Cars(1500, "red");
        car2.setName("BMW");
        System.out.println(car2);

        // Task 3
        House house1 = new House();
        House house2 = new House();

        house1.setAll("Residential building A", 2003, 4);
        house2.setAll("Residential building B", 2011, 5);

        System.out.print(house1);
        System.out.println("How many years have passed since construction: " + house1.yearsSinceConstruction() + "\n");

        System.out.print(house2);
        System.out.println("How many years have passed since construction: " + house2.yearsSinceConstruction() + "\n");

        // Task 4
        Tree tree1 = new Tree();
        Tree tree2 = new Tree("Pine", 160);
        Tree tree3 = new Tree("Maple", true, 27);
    }
}
