package by.svetilnik.epam.d_classes.aggregationAndComposition.task5.travelVouncher;

import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.TravelVouncerList;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.CountDays;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.TypeFood;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.TypeTransport;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.TypeVoucher;

import java.util.ArrayList;
import java.util.Comparator;

public class TravelVouncherLogic {

    public static ArrayList<TravelVoucher> createTravelsList() {
        ArrayList<TypeVoucher> typeVouchers1 = new ArrayList<>();
        typeVouchers1.add(TypeVoucher.Excursion);
        typeVouchers1.add(TypeVoucher.Shopping);
        ArrayList<TypeTransport> typeTransports1 = new ArrayList<>();
        typeTransports1.add(TypeTransport.BUS);
        TravelVoucher travelVoucher1 = new TravelVoucher("First", typeVouchers1, typeTransports1, TypeFood.Breakfast, CountDays.Ten);

        ArrayList<TypeVoucher> typeVouchers2 = new ArrayList<>();
        typeVouchers2.add(TypeVoucher.Relaxation);
        typeVouchers2.add(TypeVoucher.Therapy);
        ArrayList<TypeTransport> typeTransports2 = new ArrayList<>();
        typeTransports2.add(TypeTransport.PLANE);
        typeTransports2.add(TypeTransport.CAR);
        TravelVoucher travelVoucher2 = new TravelVoucher("Second", typeVouchers2, typeTransports2, TypeFood.AllInclusive, CountDays.Three);

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

    //сортировка путевок по кол-ву дней
    public static void sortVouncher(TravelVouncerList travelVouncerList) {

        ArrayList<TravelVoucher> travelVouchers = new ArrayList<>();
        for (int i = 0; i < travelVouncerList.getTravelVouchers().size() - 1; i++) {
            ArrayList<TravelVoucher> vounchers = sortVounchers(travelVouncerList.getTravelVouchers());
            travelVouchers.addAll(vounchers);
        }
    }

    //сортировка счетов по кол-ву дней
    public static ArrayList<TravelVoucher> sortVounchers(ArrayList<TravelVoucher> vouchers) {
        if (vouchers.size() > 0) vouchers.sort(new Comparator<TravelVoucher>() {
            @Override
            public int compare(final TravelVoucher o1, final TravelVoucher o2) {
                return Integer.compare(o1.getCountDays().getCount(), o2.getCountDays().getCount());
            }
        });
        return vouchers;
    }

    public static TravelVouncerList selectionVoucher(TravelVouncerList travelVouncerList, TypeVoucher typeVoucher, TypeTransport typeTransport, TypeFood typeFood, CountDays countDays) {

        searchByTypeVouncher(travelVouncerList, typeVoucher);
        searchByTypeTransport(travelVouncerList, typeTransport);
        searchByFood(travelVouncerList, typeFood);
        searchByCountDays(travelVouncerList, countDays);

        return travelVouncerList;
    }


}
