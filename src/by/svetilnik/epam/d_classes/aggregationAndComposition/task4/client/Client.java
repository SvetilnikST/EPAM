package by.svetilnik.epam.d_classes.aggregationAndComposition.task4.client;

import by.svetilnik.epam.d_classes.aggregationAndComposition.task4.bankAccount.BankAccount;

import java.util.ArrayList;

public class Client {
    private int id;
    private String fullName;
    private ArrayList<BankAccount> bankAccounts;

    public Client(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Client(int id, String fullName, ArrayList<BankAccount> bankAccounts) {
        this.id = id;
        this.fullName = fullName;
        this.bankAccounts = bankAccounts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ArrayList<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", bankAccounts=" + bankAccounts +
                '}';
    }
}
