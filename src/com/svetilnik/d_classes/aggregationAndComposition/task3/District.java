package com.svetilnik.d_classes.aggregationAndComposition.task3;

import java.util.ArrayList;

public class District {
    private String nameDistrict;
    private ArrayList<Town> towns;

    public District(String nameDistrict, ArrayList<Town> towns) {
        this.nameDistrict = nameDistrict;
        this.towns = towns;
    }

}
