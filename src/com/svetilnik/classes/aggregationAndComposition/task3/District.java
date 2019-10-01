package com.svetilnik.classes.aggregationAndComposition.task3;

import java.util.ArrayList;

//район для города
public class District {
    private String nameDistrict;
    private ArrayList <Town> towns;

    public District(String nameDistrict, ArrayList<Town> towns) {
        this.nameDistrict = nameDistrict;
        this.towns = towns;
    }

    public District(String nameDistrict) {

    }

    public String getNameDistrict() {
        return nameDistrict;
    }

    public void setNameDistrict(String nameDistrict) {
        this.nameDistrict = nameDistrict;
    }

    public ArrayList<Town> getTowns() {
        return towns;
    }

    public void setTowns(ArrayList<Town> towns) {
        this.towns = towns;
    }
}
