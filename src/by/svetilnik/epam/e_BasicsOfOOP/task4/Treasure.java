package by.svetilnik.epam.e_BasicsOfOOP.task4;

public class Treasure {
    private TreasureView treasureView;
    private int cost;

    public Treasure(TreasureView treasureView, int cost) {
        this.treasureView = treasureView;
        this.cost = cost;
    }

    public TreasureView getTreasureView() {
        return treasureView;
    }

    public void setTreasureView(TreasureView treasureView) {
        this.treasureView = treasureView;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
