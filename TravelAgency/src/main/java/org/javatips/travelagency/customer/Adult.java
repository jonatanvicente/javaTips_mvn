package org.javatips.travelagency.customer;

public class Adult implements ICustomer {

    @Override
    public void getType() {
        System.out.println("Adult");
    }
}
