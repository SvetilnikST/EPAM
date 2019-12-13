package by.svetilnik.epam.d_classes.aggregationAndComposition.task5;

import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.enums.TypeFood;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.enums.TypeTransport;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.enums.TypeVoucher;

import java.util.ArrayList;

public class TravelVoucher {
    private String name;
    private ArrayList<TypeVoucher> typeVouchers;

    private ArrayList<TypeTransport> typeTransports;
    private TypeFood typeFoodOnTour;

    public TravelVoucher(String name, ArrayList<TypeVoucher> typeVouchers, ArrayList<TypeTransport> typeTransports, TypeFood typeOfFoodOnTour) {
        this.name = name;
        this.typeVouchers = typeVouchers;
        this.typeTransports = typeTransports;
        this.typeFoodOnTour = typeFoodOnTour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<TypeVoucher> getTypeVouchers() {
        return typeVouchers;
    }

    public void setTypeVouchers(ArrayList<TypeVoucher> typeVouchers) {
        this.typeVouchers = typeVouchers;
    }

    public ArrayList<TypeTransport> getTypeOfTransports() {
        return typeTransports;
    }

    public void setTypeOfTransports(ArrayList<TypeTransport> typeOfTransports) {
        this.typeTransports = typeOfTransports;
    }

    public TypeFood getTypeFoodOnTour() {
        return typeFoodOnTour;
    }

    public void setTypeFoodOnTour(TypeFood typeFoodOnTour) {
        this.typeFoodOnTour = typeFoodOnTour;
    }
}
