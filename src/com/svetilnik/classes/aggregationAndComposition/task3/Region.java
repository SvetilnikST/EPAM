package com.svetilnik.classes.aggregationAndComposition.task3;

import java.util.ArrayList;

//область
public class Region {
    private String nameRegion;
    private Town nameRegonTown;
    private double areaRegion;
    private ArrayList<District> districts = new ArrayList<>();

    public Region() {
    }

    public Region(String nameRegion, Town nameRegionTown, double areaRegion, ArrayList<District> towns) {
        this.nameRegion = nameRegion;
        this.nameRegonTown = nameRegionTown;
        this.areaRegion = areaRegion;
        this.districts = towns;
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

    public ArrayList<District> getTowns() {
        return districts;
    }

    public void setTowns(ArrayList<District> towns) {
        this.districts = towns;
    }

    public Town getNameRegonTown() {
        return nameRegonTown;
    }

    public void setNameRegonTown(Town nameRegonTown) {
        this.nameRegonTown = nameRegonTown;
    }
}
