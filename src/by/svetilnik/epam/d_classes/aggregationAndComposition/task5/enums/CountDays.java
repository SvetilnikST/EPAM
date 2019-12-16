package by.svetilnik.epam.d_classes.aggregationAndComposition.task5.enums;

public enum CountDays {
    One(1),
    Two(2),
    Three(3),
    Five(5),
    Ten(10),
    Fifteen(15);

    private int count;

    CountDays(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "DaysCount{" +
                "count='" + count + '\'' +
                '}';
    }
}
