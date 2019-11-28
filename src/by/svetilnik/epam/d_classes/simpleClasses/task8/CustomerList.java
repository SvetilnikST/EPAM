package by.svetilnik.epam.d_classes.simpleClasses.task8;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    private ArrayList<Customer> customers;

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "CustomerList{" +
                "customers=" + customers +
                '}';
    }


}
