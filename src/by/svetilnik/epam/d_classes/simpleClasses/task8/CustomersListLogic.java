package by.svetilnik.epam.d_classes.simpleClasses.task8;

import by.svetilnik.epam.d_classes.simpleClasses.task8.logic.Adress;
import by.svetilnik.epam.d_classes.simpleClasses.task8.logic.City;
import by.svetilnik.epam.d_classes.simpleClasses.task8.logic.Street;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CustomersListLogic {

    public static void fillCustomersList(CustomerList customerAggregation) {

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Zvanov", "Иван", "Иванович", new Adress(1, new City(1, "Minsk"), new Street(1, "New"), "14/a", "23"), 1, 11111));
        customers.add(new Customer(2, "Petrov", "Иван", "Иванович", new Adress(2, new City(1, "Minsk"), new Street(1, "New"), "14/a", "23"), 2, 222222));
        customers.add(new Customer(3, "Aidorov", "Николай", "Иванович", new Adress(3, new City(1, "Minsk"), new Street(1, "New"), "14", "253"), 3, 33333));
        customerAggregation.setCustomers(customers);
    }

    public static CustomerList findForNumberCreditCard(CustomerList customerList, int from, int to) {

        ArrayList<Customer> customers = new ArrayList<>();

        for (int i = 0; i < customerList.getCustomers().size(); i++) {
            if (customerList.getCustomers().get(i).getNumberCreditCard() >= from && customerList.getCustomers().get(i).getNumberCreditCard() <= to) {
                customers.add(customerList.getCustomers().get(i));
            }
        }

        customerList.setCustomers(customers);
        return customerList;
    }

    public static CustomerList sortSurname(CustomerList customerList) {

        ArrayList<Customer> customers = customerList.getCustomers();

        if (customerList.getCustomers().size() > 0) {
            Collections.sort(customers, new Comparator<Customer>() {
                @Override
                public int compare(final Customer o1, final Customer o2) {
                    return o1.getSurname().compareTo(o2.getSurname());
                }
            });
        }
        return customerList;
    }
}
