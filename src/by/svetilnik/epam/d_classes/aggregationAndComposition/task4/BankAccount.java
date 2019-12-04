package by.svetilnik.epam.d_classes.aggregationAndComposition.task4;

public class BankAccount {
    private int id;
    private int number;
    private double sum = 0;
    private boolean active = false;


    public BankAccount(int id, int number, double sum, boolean active) {
        this.id = id;
        this.number = number;
        this.sum = sum;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", number=" + number +
                ", sum=" + sum +
                ", active=" + active +
                '}';
    }
}
