package by.svetilnik.epam.d_classes.simpleClasses.task8;

public class CustomersListView {

    public static void printCustomer(CustomerList customerAggregation) {

        for (int i = 0; i < customerAggregation.getCustomers().size(); i++) {
            System.out.println(customerAggregation.getCustomers().get(i));
        }
    }
}
