package org.javatips.travelagency.factory;

import org.javatips.travelagency.bo.PlaneTicket;
import org.javatips.travelagency.bo.Ticket;

public class AirportAgency implements ITravelAgency {

    public Ticket makeTicket() {
        return new PlaneTicket();
    }
}
