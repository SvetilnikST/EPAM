package by.svetilnik.epam.d_classes.aggregationAndComposition.task4;

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

}
