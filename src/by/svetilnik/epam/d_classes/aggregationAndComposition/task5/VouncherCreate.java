package by.svetilnik.epam.d_classes.aggregationAndComposition.task5;

import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.enums.CountDays;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.enums.TypeFood;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.enums.TypeTransport;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.enums.TypeVoucher;

import java.util.ArrayList;

public class VouncherCreate {

    public static ArrayList<TravelVoucher> createTravelsList() {
        ArrayList<TypeVoucher> typeVouchers1 = new ArrayList<>();
        typeVouchers1.add(TypeVoucher.Excursion);
        typeVouchers1.add(TypeVoucher.Shopping);
        ArrayList<TypeTransport> typeTransports1 = new ArrayList<>();
        typeTransports1.add(TypeTransport.BUS);
        TravelVoucher travelVoucher1 = new TravelVoucher("First", typeVouchers1, typeTransports1, TypeFood.Breakfast, CountDays.Three);

        ArrayList<TypeVoucher> typeVouchers2 = new ArrayList<>();
        typeVouchers2.add(TypeVoucher.Relaxation);
        typeVouchers2.add(TypeVoucher.Therapy);
        ArrayList<TypeTransport> typeTransports2 = new ArrayList<>();
        typeTransports2.add(TypeTransport.PLANE);
        typeTransports2.add(TypeTransport.CAR);
        TravelVoucher travelVoucher2 = new TravelVoucher("Second", typeVouchers2, typeTransports2, TypeFood.AllInclusive, CountDays.Ten);

        ArrayList<TravelVoucher> travelVouncherList = new ArrayList<>();
        travelVouncherList.add(travelVoucher1);
        travelVouncherList.add(travelVoucher2);

        return travelVouncherList;
    }

    public static TravelVouncerList searchByTypeVouncher(TravelVouncerList travelVouncerList, TypeVoucher typeVoucher) {
        ArrayList<TravelVoucher> rez = new ArrayList<>();
        if (travelVouncerList != null) {
            for (int i = 0; i < travelVouncerList.getTravelVouchers().size(); i++) {
                for (int j = 0; j < travelVouncerList.getTravelVouchers().get(i).getTypeVouchers().size(); j++) {
                    if (travelVouncerList.getTravelVouchers().get(i).getTypeVouchers().get(j) == typeVoucher) {
                        rez.add(travelVouncerList.getTravelVouchers().get(i));
                    }
                }
            }
            travelVouncerList.setTravelVouchers(rez);
        }
        return travelVouncerList;
    }


    public static TravelVouncerList searchByTypeTransport(TravelVouncerList travelVouncerList, TypeTransport typeTransport) {
        ArrayList<TravelVoucher> rez = new ArrayList<>();
        if (travelVouncerList != null) {
            for (int i = 0; i < travelVouncerList.getTravelVouchers().size(); i++) {
                for (int j = 0; j < travelVouncerList.getTravelVouchers().get(i).getTypeTransports().size(); j++) {
                    if (travelVouncerList.getTravelVouchers().get(i).getTypeTransports().get(j) == typeTransport) {
                        rez.add(travelVouncerList.getTravelVouchers().get(i));
                    }
                }
            }
            travelVouncerList.setTravelVouchers(rez);
        }
        return travelVouncerList;
    }

    public static TravelVouncerList searchByFood(TravelVouncerList travelVouncerList, TypeFood typeFood) {
        ArrayList<TravelVoucher> rez = new ArrayList<>();
        if (travelVouncerList != null) {
            for (int i = 0; i < travelVouncerList.getTravelVouchers().size(); i++) {
                if (travelVouncerList.getTravelVouchers().get(i).getTypeFoodOnTour() == typeFood) {
                    rez.add(travelVouncerList.getTravelVouchers().get(i));
                }
            }
            travelVouncerList.setTravelVouchers(rez);
        }
        return travelVouncerList;
    }


    public static TravelVouncerList searchByCountDays(TravelVouncerList travelVouncerList, CountDays countDays) {
        ArrayList<TravelVoucher> rez = new ArrayList<>();
        if (travelVouncerList != null) {
            for (int i = 0; i < travelVouncerList.getTravelVouchers().size(); i++) {
                if (travelVouncerList.getTravelVouchers().get(i).getCountDays() == countDays) {
                    rez.add(travelVouncerList.getTravelVouchers().get(i));
                }
            }
            travelVouncerList.setTravelVouchers(rez);
        }
        return travelVouncerList;
    }
}
