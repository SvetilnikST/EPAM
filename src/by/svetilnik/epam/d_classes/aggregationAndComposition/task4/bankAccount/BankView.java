package by.svetilnik.epam.d_classes.aggregationAndComposition.task4.bankAccount;

import by.svetilnik.epam.d_classes.aggregationAndComposition.task4.client.ClientsList;

import java.util.ArrayList;

public class BankView {

    public static void printInfoAccount(BankAccount bankAccount) {
        System.out.println(
                "BankAccount{" +
                        "id=" + bankAccount.getId() +
                        ", number=" + bankAccount.getNumber() +
                        ", sum=" + bankAccount.getSum() +
                        ", active=" + bankAccount.isActive() +
                        "}"

        );

    }


    public static void printInfoAccounts(ClientsList clientsList) {

        for (int i = 0; i < clientsList.getClients().size() - 1; i++) {
            for (int j = 0; j < clientsList.getClients().get(i).getBankAccounts().size() - 1; j++) {
                printInfoAccount(clientsList.getClients().get(i).getBankAccounts().get(j));
            }
        }
    }

    public static void printAccount(ArrayList<BankAccount> bankAccounts) {

        for (int i = 0; i < bankAccounts.size(); i++) {
            printInfoAccount(bankAccounts.get(i));
        }
    }

}
