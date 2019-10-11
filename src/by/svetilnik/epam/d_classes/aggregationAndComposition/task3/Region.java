package by.svetilnik.epam.d_classes.aggregationAndComposition.task3;

import java.util.ArrayList;

public class Region {
    private String nameRegion;
    private Town nameRegonTown;
    private double areaRegion;
    private ArrayList<District> districts;

    public Region(String nameRegion, Town nameRegionTown, double areaRegion, ArrayList<District> towns) {
        this.nameRegion = nameRegion;
        this.nameRegonTown = nameRegionTown;
        this.areaRegion = areaRegion;
        this.districts = towns;
    }

    public double getAreaRegion() {
        return areaRegion;
    }

    public Town getNameRegonTown() {
        return nameRegonTown;
    }
}
