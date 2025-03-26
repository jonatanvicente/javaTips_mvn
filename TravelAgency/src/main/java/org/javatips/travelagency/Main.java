package org.javatips.travelagency;

import org.javatips.travelagency.bo.Ticket;
import org.javatips.travelagency.customer.ICustomer;
import org.javatips.travelagency.customer.Kid;
import org.javatips.travelagency.factory.BusAgency;
import org.javatips.travelagency.factory.ITravelAgency;

public class Main {


    public static void main(String[] args) {

        ICustomer kid = new Kid();
        ITravelAgency travelAgency = new BusAgency();
        Ticket t = travelAgency.makeTicket(kid);
        t.getType();

    }
}
