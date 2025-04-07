package org.javatips.travelagency.factory;

import org.javatips.travelagency.bo.BusTicket;
import org.javatips.travelagency.bo.Ticket;

public class BusAgency implements ITravelAgency {

    public Ticket makeTicket() {
        return new BusTicket();
    }
}
