package by.svetilnik.epam.e_BasicsOfOOP.task4;

public class Dragon {
    private String nameDragon;

    //список на 100 сокровищ должен быть
    private Treasure[] treasures;

    public Dragon(String nameDragon, Treasure[] treasures) {
        this.nameDragon = nameDragon;
        this.treasures = new Treasure[100];
    }

    public String getNameDragon() {
        return nameDragon;
    }

    public void setNameDragon(String nameDragon) {
        this.nameDragon = nameDragon;
    }

    public Treasure[] getTreasures() {
        return treasures;
    }

    public void setTreasures(Treasure[] treasures) {
        this.treasures = treasures;
    }
}
