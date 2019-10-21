package by.svetilnik.epam.d_classes.simpleClasses.task7;

public class TriangelLogic {

    public static final int HALF_FOR_FRACTION = 2;
    public static final double FRACTION_FOR_EQUILATERAL = Math.sqrt(3) / 4;
    public static final int FOR_FIND_MEDIAN = 3;

    public static double area(Triangel triangel) {
        return (triangel.getA() * triangel.getHeight()) / HALF_FOR_FRACTION;
    }

    public static int perimeter(Triangel triangel) {
        return triangel.getA() + triangel.getB() + triangel.getC();
    }

    public static int areaAcrossSide(Triangel triangel) {
        return perimeter(triangel) / HALF_FOR_FRACTION;
    }

    public static double areaGeron(Triangel triangel) {
        int halfPerimeter = perimeter(triangel) / HALF_FOR_FRACTION;
        return Math.sqrt(halfPerimeter * (halfPerimeter - triangel.getA()) * (halfPerimeter - triangel.getB()) * (halfPerimeter - triangel.getC()));
    }


    public static boolean triangleIsEquilateral(Triangel triangel) {
        return triangel.getA() == triangel.getB() && triangel.getA() == triangel.getC();
    }

    public static double areaEquilateral(Triangel triangel) {
        if (triangleIsEquilateral(triangel)) {
            return Math.pow((double) triangel.getA(), FRACTION_FOR_EQUILATERAL);
        }
        return 0;
    }

    public static void median(Triangel triangel) {
        double x = medianCoordinateOne(triangel);
        double y = medianCoordinateTwo(triangel);
        System.out.printf("%.2f", x);
        System.out.print(";");
        System.out.printf("%.2f", y);
    }

    public static double medianCoordinateOne(Triangel triangel) {

        double coordinateA1 = triangel.getTops().get(0).getOneParam();
        double coordinateB1 = triangel.getTops().get(1).getOneParam();
        double coordinateC1 = triangel.getTops().get(2).getOneParam();

        return (coordinateA1 + coordinateB1 + coordinateC1) / FOR_FIND_MEDIAN;
    }

    public static double medianCoordinateTwo(Triangel triangel) {

        double coordinateA2 = triangel.getTops().get(0).getTwoParam();
        double coordinateB2 = triangel.getTops().get(1).getTwoParam();
        double coordinateC2 = triangel.getTops().get(2).getTwoParam();

        return (coordinateA2 + coordinateB2 + coordinateC2) / FOR_FIND_MEDIAN;
    }

}
