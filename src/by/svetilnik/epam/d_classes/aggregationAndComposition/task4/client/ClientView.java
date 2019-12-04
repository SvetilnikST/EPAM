package by.svetilnik.epam.d_classes.aggregationAndComposition.task4.client;

import by.svetilnik.epam.d_classes.aggregationAndComposition.task4.client.Client;

public class ClientView {
    public static void printClientInfo(Client client) {
        System.out.println(
                "Client{" +
                        "id = " + client.getId() +
                        ", fullName = '" + client.getFullName() + ",");

        if (client.getBankAccounts() != null) {
            for (int i = 0; i < client.getBankAccounts().size(); i++) {
                System.out.println(
                        "BankAccount{" +
                                "id = " + client.getBankAccounts().get(i).getId() +
                                ", number = " + client.getBankAccounts().get(i).getNumber() +
                                ", sum = " + client.getBankAccounts().get(i).getSum() +
                                ", active = " + client.getBankAccounts().get(i).isActive() +
                                '}'
                );
            }
        } else {
            System.out.print("This client does not have Bank accounts.}");
        }
        System.out.println("};");
    }
}
