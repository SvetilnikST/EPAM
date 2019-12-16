package by.svetilnik.epam.d_classes.aggregationAndComposition.task5;

import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.enums.CountDays;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.enums.TypeFood;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.enums.TypeTransport;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.enums.TypeVoucher;

import java.util.ArrayList;

public class TravelVoucher {
    private String name;
    private ArrayList<TypeVoucher> typeVouchers;
    private ArrayList<TypeTransport> typeTransports;
    private TypeFood typeFoodOnTour;
    private CountDays countDays;

    public TravelVoucher(String name, ArrayList<TypeVoucher> typeVouchers, ArrayList<TypeTransport> typeTransports, TypeFood typeFoodOnTour, CountDays countDays) {
        this.name = name;
        this.typeVouchers = typeVouchers;
        this.typeTransports = typeTransports;
        this.typeFoodOnTour = typeFoodOnTour;
        this.countDays = countDays;
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

    public ArrayList<TypeTransport> getTypeTransports() {
        return typeTransports;
    }

    public void setTypeTransports(ArrayList<TypeTransport> typeTransports) {
        this.typeTransports = typeTransports;
    }

    public TypeFood getTypeFoodOnTour() {
        return typeFoodOnTour;
    }

    public void setTypeFoodOnTour(TypeFood typeFoodOnTour) {
        this.typeFoodOnTour = typeFoodOnTour;
    }

    public CountDays getCountDays() {
        return countDays;
    }

    public void setCountDays(CountDays countDays) {
        this.countDays = countDays;
    }

    @Override
    public String toString() {
        return "TravelVoucher{" +
                "name='" + name + '\'' +
                ", typeVouchers=" + typeVouchers +
                ", typeTransports=" + typeTransports +
                ", typeFoodOnTour=" + typeFoodOnTour +
                ", countDays=" + countDays +
                '}';
    }
}
