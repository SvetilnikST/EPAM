package by.svetilnik.epam.d_classes.aggregationAndComposition.task5;

public class TravelVoucher {
    private String name;
    private TypeVoucher typeVoucher;

    public TravelVoucher(String name, TypeVoucher typeVoucher) {
        this.name = name;
        this.typeVoucher = typeVoucher;
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
}
