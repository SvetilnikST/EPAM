package by.svetilnik.epam.d_classes.aggregationAndComposition.task5.travelVouncher;

import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.TravelVouncerList;

public class TravelVouncherView {
    public static void printVouncherList(TravelVouncerList travelVouncerList) {
        System.out.println("List vounchers: ");
        for (int i = 0; i < travelVouncerList.getTravelVouchers().size(); i++) {
            System.out.println(travelVouncerList.getTravelVouchers().get(i));
        }

    }
}
