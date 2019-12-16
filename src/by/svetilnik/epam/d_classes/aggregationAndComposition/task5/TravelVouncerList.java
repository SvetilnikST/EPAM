package by.svetilnik.epam.d_classes.aggregationAndComposition.task5;

import java.util.ArrayList;

public class TravelVouncerList {
    private ArrayList<TravelVoucher> travelVouchers;

    public TravelVouncerList() {
    }

    public TravelVouncerList(ArrayList<TravelVoucher> travelVouchers) {
        this.travelVouchers = travelVouchers;
    }

    public ArrayList<TravelVoucher> getTravelVouchers() {
        return travelVouchers;
    }

    public void setTravelVouchers(ArrayList<TravelVoucher> travelVouchers) {
        this.travelVouchers = travelVouchers;
    }

    @Override
    public String toString() {
        return "TravelVouncerList{" +
                "travelVouchers=" + travelVouchers +
                '}';
    }
}
