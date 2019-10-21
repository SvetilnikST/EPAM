package by.svetilnik.epam.d_classes.simpleClasses.task8;

import java.util.ArrayList;

public class CustomersListLogic {

    public static void fillCustomersList(CustomerList customerAggregation) {

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(0, new Customer(1, "Иванов", "Иван", "Иванович", "Минск", 1, 54321));
        customers.add(1, new Customer(2, "Сидоров", "Иван", "Иванович", "Минск", 2, 54321));
        customers.add(2, new Customer(3, "Петрова", "Ольга", "Михаловна", "Полоцк", 3, 54321));
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
}
