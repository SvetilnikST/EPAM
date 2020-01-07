package by.svetilnik.epam.e_BasicsOfOOP.task5.flowerComposition;

import by.svetilnik.epam.e_BasicsOfOOP.task5.flowerComposition.flowers.Flowers;
import by.svetilnik.epam.e_BasicsOfOOP.task5.flowerComposition.packaging.Packaging;

public class FlowerComposition {
    private Packaging packaging;
    private Flowers[] flowers;

    public FlowerComposition(Packaging packaging, Flowers[] flowers) {
        this.packaging = packaging;
        this.flowers = flowers;
    }

    public Packaging getPackaging() {
        return packaging;
    }

    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }

    public Flowers[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flowers[] flowers) {
        this.flowers = flowers;
    }
}
