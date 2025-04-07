package org.javatips.travelagency;

import org.javatips.travelagency.customer.*;
import org.javatips.travelagency.builder.TravelAgencyFactory;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------- Kid Customer -----------");
        ICustomer kid = new Kid();
        TravelAgencyFactory.getInstance().build(kid).makeTicket().getType();

        System.out.println("---------- Teen Customer -----------");
        ICustomer teen = new Teen();
        TravelAgencyFactory.getInstance().build(teen).makeTicket().getType();

        System.out.println("---------- Adult Customer -----------");
        ICustomer adult = new Adult();
        TravelAgencyFactory.getInstance().build(adult).makeTicket().getType();

        System.out.println("---------- Aged Customer -----------");
        ICustomer aged = new Aged();
        TravelAgencyFactory.getInstance().build(aged).makeTicket().getType();

    }
}
