package org.javatips.travelagency.factory;

import org.javatips.travelagency.bo.BusTicket;
import org.javatips.travelagency.bo.Ticket;
import org.javatips.travelagency.customer.ICustomer;

public class BusAgency implements ITravelAgency {

    public Ticket makeTicket(ICustomer c) {
        return new BusTicket();
    }
}
