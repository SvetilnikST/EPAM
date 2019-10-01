package com.svetilnik.classes.aggregationAndComposition.task3;

import java.util.ArrayList;

//область
public class Region {
    private String nameRegion;
    private Town nameRegonTown;
    private double areaRegion;
    private ArrayList<Town> towns = new ArrayList<>();

    public Region() {
    }

    public Region(String nameRegion,Town nameRegionTown, double areaRegion, ArrayList<Town> towns) {
        this.nameRegion = nameRegion;
        this.nameRegonTown = nameRegionTown;
        this.areaRegion = areaRegion;
        this.towns = towns;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
    }

    public double getAreaRegion() {
        return areaRegion;
    }

    public void setAreaRegion(double areaRegion) {
        this.areaRegion = areaRegion;
    }

    public ArrayList<Town> getTowns() {
        return towns;
    }

    public void setTowns(ArrayList<Town> towns) {
        this.towns = towns;
    }

    public Town getNameRegonTown() {
        return nameRegonTown;
    }

    public void setNameRegonTown(Town nameRegonTown) {
        this.nameRegonTown = nameRegonTown;
    }
}
