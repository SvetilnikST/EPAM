package com.svetilnik.classes.aggregationAndComposition.task3;

//город
public class Town extends District {
    private String nameTown;

    public Town(String nameDistrict) {
        super(nameDistrict);
        this.nameTown = nameTown;
    }

    public String getNameTown() {
        return nameTown;
    }

    public void setNameTown(String nameTown) {
        this.nameTown = nameTown;
    }

}
