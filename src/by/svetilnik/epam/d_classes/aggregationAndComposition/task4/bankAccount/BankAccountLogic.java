package by.svetilnik.epam.d_classes.aggregationAndComposition.task4.bankAccount;

import by.svetilnik.epam.d_classes.aggregationAndComposition.task4.bankAccount.BankAccount;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task4.client.ClientsList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BankAccountLogic {

    //поиск счетов по номеру
    public static ArrayList findAccount(ClientsList clientsList, int number) {

        ArrayList<BankAccount> bankAccounts = new ArrayList<>();

        for (int i = 0; i < clientsList.getClients().size() - 1; i++) {
            for (int j = 0; j < clientsList.getClients().get(i).getBankAccounts().size(); j++) {
                if (clientsList.getClients().get(i).getBankAccounts().get(j).getNumber() == number) {
                    bankAccounts.add(clientsList.getClients().get(i).getBankAccounts().get(j));
                }
            }
        }
        return bankAccounts;
    }


    //сортировка счетов по номеру
    public static ArrayList sortAccounts(ClientsList clientsList) {

        ArrayList<BankAccount> bankAccounts = new ArrayList<>();

        for (int i = 0; i < clientsList.getClients().size() - 1; i++) {
            ArrayList<BankAccount> accounts = sortAccount(clientsList.getClients().get(i).getBankAccounts());
            bankAccounts.addAll(accounts);
        }
        return bankAccounts;
    }


    //сортировка счетов по номерам
    public static ArrayList<BankAccount> sortAccount(ArrayList<BankAccount> accounts) {
        if (accounts.size() > 0) Collections.sort(accounts, new Comparator<BankAccount>() {
            @Override
            public int compare(final BankAccount o1, final BankAccount o2) {
                if (o1.getNumber() > o2.getNumber()) {
                    return 1;
                } else if (o1.getNumber() < o2.getNumber()) {
                    return -1;
                } else
                    return 0;
            }
        });
        return accounts;
    }


}
