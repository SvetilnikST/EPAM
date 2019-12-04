package by.svetilnik.epam.d_classes.aggregationAndComposition.task4.bankAccount;

import by.svetilnik.epam.d_classes.aggregationAndComposition.task4.bankAccount.BankAccount;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task4.client.ClientsList;

import java.util.ArrayList;

public class BankAccountLogic {

    //поиск счетов
    public static ArrayList findAccount(ClientsList clientsList, int number) {

        ArrayList<BankAccount> bankAccounts = new ArrayList<>();

        for (int i = 0; i < clientsList.getClients().size()-1; i++) {
            for (int j = 0; j < clientsList.getClients().get(i).getBankAccounts().size(); j++) {
                if (clientsList.getClients().get(i).getBankAccounts().get(j).getNumber() == number) {
                    bankAccounts.add(clientsList.getClients().get(i).getBankAccounts().get(j));
                }
            }
        }
        if (bankAccounts == null) {
            System.out.println("Not found.");
        }

        return bankAccounts;
    }


}
