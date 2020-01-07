package by.svetilnik.epam.e_BasicsOfOOP.task4.cave;

public class CaveView {

    public static void printCave(Cave cave) {
        System.out.println("Name cave: " + cave.getName());
        System.out.println("Name Dragon: " + cave.getDragon().getNameDragon());
        for (int i = 0; i < cave.getTreasures().length - 1; i++) {
            System.out.print(cave.getTreasures()[i].getNumber() + " ");
            System.out.print(cave.getTreasures()[i].getName() + " ");
            System.out.print(cave.getTreasures()[i].getCost() + " ");
            System.out.println();
        }
    }

    public static void printTreasure(Cave cave, int ind) {
        System.out.println("Name cave: " + cave.getName());
        System.out.println("Name Dragon: " + cave.getDragon().getNameDragon());
        System.out.print(cave.getTreasures()[ind].getNumber() + " ");
        System.out.print(cave.getTreasures()[ind].getName() + " ");
        System.out.print(cave.getTreasures()[ind].getCost() + " ");
    }
}
