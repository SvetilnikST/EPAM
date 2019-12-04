package by.svetilnik.epam.d_classes.aggregationAndComposition.task4.client;

import by.svetilnik.epam.d_classes.aggregationAndComposition.task4.bankAccount.BankAccount;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task4.client.Client;

public class ClientLogic {

    public static void addAccount(Client client, BankAccount bankAccount) {
        client.getBankAccounts().add(bankAccount);
    }

    public static void deleteAccount(Client client, int number) {
        for (int i = 0; i < client.getBankAccounts().size(); i++) {
            if (client.getBankAccounts().get(i).getNumber() == number)
                client.getBankAccounts().remove(i);
        }
    }


    public static void editActiveAccount(Client client, int number, boolean active) {
        for (int i = 0; i < client.getBankAccounts().size(); i++) {
            if (client.getBankAccounts().get(i).getNumber() == number) {
                client.getBankAccounts().get(i).setActive(active);
            }
        }

    }

    public static double getSumAllAccounts(Client client) {

        return getPositiveSumAccount(client) + getNegativeSumAccounts(client);
    }

    public static double getNegativeSumAccounts(Client client) {

        double negativeSum = 0.0;

        if (client.getBankAccounts() != null) {
            for (int i = 0; i < client.getBankAccounts().size(); i++) {

                if (client.getBankAccounts().get(i).getSum() < 0) {
                    negativeSum = negativeSum + client.getBankAccounts().get(i).getSum();
                }
            }
        }

        return negativeSum;
    }

    public static double getPositiveSumAccount(Client client) {
        double positiveSum = 0.0;

        if (client.getBankAccounts() != null) {
            for (int i = 0; i < client.getBankAccounts().size(); i++) {
                if (client.getBankAccounts().get(i).getSum() > 0) {
                    positiveSum = positiveSum + client.getBankAccounts().get(i).getSum();
                }
            }
        }
        return positiveSum;
    }


}
