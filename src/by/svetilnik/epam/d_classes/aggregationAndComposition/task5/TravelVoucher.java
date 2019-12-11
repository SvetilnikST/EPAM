package by.svetilnik.epam.d_classes.aggregationAndComposition.task5;

public class TravelVoucher {
    private String name;
    private TypeVoucher typeVoucher;
    private TypeOfTransport typeOfTransport;
    private TypeOfFoodOnTour typeOfFoodOnTour;

    public TravelVoucher(String name, TypeVoucher typeVoucher, TypeOfTransport typeOfTransport, TypeOfFoodOnTour typeOfFoodOnTour) {
        this.name = name;
        this.typeVoucher = typeVoucher;
        this.typeOfTransport = typeOfTransport;
        this.typeOfFoodOnTour = typeOfFoodOnTour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeVoucher getTypeVoucher() {
        return typeVoucher;
    }

    public void setTypeVoucher(TypeVoucher typeVoucher) {
        this.typeVoucher = typeVoucher;
    }

    public TypeOfTransport getTypeOfTransport() {
        return typeOfTransport;
    }

    public void setTypeOfTransport(TypeOfTransport typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

    public TypeOfFoodOnTour getTypeOfFoodOnTour() {
        return typeOfFoodOnTour;
    }

    public void setTypeOfFoodOnTour(TypeOfFoodOnTour typeOfFoodOnTour) {
        this.typeOfFoodOnTour = typeOfFoodOnTour;
    }
}
