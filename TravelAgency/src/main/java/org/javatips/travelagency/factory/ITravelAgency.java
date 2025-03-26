package org.javatips.travelagency.factory;

import org.javatips.travelagency.bo.Ticket;
import org.javatips.travelagency.customer.ICustomer;

public interface ITravelAgency {
    public Ticket makeTicket (ICustomer c);
}
