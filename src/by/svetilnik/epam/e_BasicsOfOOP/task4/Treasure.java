package by.svetilnik.epam.e_BasicsOfOOP.task4;

public class Treasure {
    private int number;
    private String name;
    private int cost;

    public Treasure(int number, String name, int cost) {
        this.number = number;
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
