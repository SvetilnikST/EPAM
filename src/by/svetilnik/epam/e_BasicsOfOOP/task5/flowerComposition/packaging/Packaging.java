package by.svetilnik.epam.e_BasicsOfOOP.task5.flowerComposition.packaging;

import by.svetilnik.epam.e_BasicsOfOOP.task5.flowerComposition.packaging.Colors;

public class Packaging {
    private String name;
    private Colors color;
    private double count;

    public Packaging(String name, Colors color, double count) {
        this.name = name;
        this.color = color;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }
}
