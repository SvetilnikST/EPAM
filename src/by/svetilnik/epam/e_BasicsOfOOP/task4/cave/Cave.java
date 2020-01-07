package by.svetilnik.epam.e_BasicsOfOOP.task4.cave;

import by.svetilnik.epam.e_BasicsOfOOP.task4.Dragon;
import by.svetilnik.epam.e_BasicsOfOOP.task4.Treasure;

public class Cave {

    public static final int max = 100;

    private String name;
    private Dragon dragon;
    private Treasure[] treasures;

    public Cave(String name, Dragon dragon) {
        this.name = name;
        this.dragon = dragon;
        this.treasures = new Treasure[max];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dragon getDragon() {
        return dragon;
    }

    public void setDragon(Dragon dragon) {
        this.dragon = dragon;
    }

    public Treasure[] getTreasures() {
        return treasures;
    }

    public void setTreasures(Treasure[] treasures) {
        this.treasures = treasures;
    }
}
