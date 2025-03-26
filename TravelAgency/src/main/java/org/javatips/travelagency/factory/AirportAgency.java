package org.javatips.travelagency.factory;

import org.javatips.travelagency.bo.PlaneTicket;
import org.javatips.travelagency.bo.Ticket;
import org.javatips.travelagency.customer.Adult;
import org.javatips.travelagency.customer.ICustomer;

public class AirportAgency implements ITravelAgency {

    public Ticket makeTicket(ICustomer c) {
        return new PlaneTicket();
    }
}
