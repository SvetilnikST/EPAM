package by.svetilnik.epam.d_classes.aggregationAndComposition.task5;

public class VouncherView {
    public static void printVouncherList(TravelVouncerList travelVouncerList) {
        System.out.println("List vounchers: ");
        for (int i = 0; i < travelVouncerList.getTravelVouchers().size(); i++) {
            System.out.println(travelVouncerList.getTravelVouchers().get(i));
        }

    }
}
