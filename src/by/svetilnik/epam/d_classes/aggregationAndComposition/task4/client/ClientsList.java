package by.svetilnik.epam.d_classes.aggregationAndComposition.task4.client;

import java.util.ArrayList;

public class ClientsList {
    private ArrayList<Client> clients;

    public ClientsList(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
}
