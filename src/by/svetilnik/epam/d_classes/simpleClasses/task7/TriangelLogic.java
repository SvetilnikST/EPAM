package by.svetilnik.epam.d_classes.simpleClasses.task7;

public class TriangelLogic {

    public static final int HALF_FRO_FRACTION = 2;
    public static final double FRACTION_FOR_EQUILATERAL = Math.sqrt(3) / 4;

    public static double area(Triangel triangel) {
        return (triangel.getA() * triangel.getHeight()) / HALF_FRO_FRACTION;
    }

    public static int perimeter(Triangel triangel) {
        return triangel.getA() + triangel.getB() + triangel.getC();
    }

    public static int areaAcrossSide(Triangel triangel) {
        return perimeter(triangel) / HALF_FRO_FRACTION;
    }

    public static double areaGeron(Triangel triangel) {
        int halfPerimeter = perimeter(triangel) / HALF_FRO_FRACTION;
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

    public static double median(Triangel triangel){

        //находим  координаты середины сторон для АС и АВ

        double kAC1 = triangel.getTops().size();

        return 0;
    }
}
