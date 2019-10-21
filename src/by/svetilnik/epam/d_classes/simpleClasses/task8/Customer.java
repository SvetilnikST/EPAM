package by.svetilnik.epam.d_classes.simpleClasses.task8;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String adress;
    private int numberCreditCard;
    private int numberBunkAccount;

    public Customer() {
    }

    public Customer(int id, String surname, String name, String patronymic, String adress, int numberCreditCard, int numberBunkAccount) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.adress = adress;
        this.numberCreditCard = numberCreditCard;
        this.numberBunkAccount = numberBunkAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNumberCreditCard() {
        return numberCreditCard;
    }

    public void setNumberCreditCard(int numberCreditCard) {
        this.numberCreditCard = numberCreditCard;
    }

    public int getNumberBunkAccount() {
        return numberBunkAccount;
    }

    public void setNumberBunkAccount(int numberBunkAccount) {
        this.numberBunkAccount = numberBunkAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", adress='" + adress + '\'' +
                ", numberCreditCard=" + numberCreditCard +
                ", numberBunkAccount=" + numberBunkAccount +
                '}';
    }
}
