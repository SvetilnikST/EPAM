package com.svetilnik.classes.aggregationAndComposition.task3;

//город
public class Town {
    private String nameTown;
    private District district;

    public Town(String nameTown, District district) {
        this.nameTown = nameTown;
        this.district = district;
    }

    public String getNameTown() {
        return nameTown;
    }

    public void setNameTown(String nameTown) {
        this.nameTown = nameTown;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
