package org.javatips.travelagency.factory;

import org.javatips.travelagency.bo.Ticket;
import org.javatips.travelagency.bo.TrainTicket;
import org.javatips.travelagency.customer.ICustomer;

public class TrainAgency implements ITravelAgency {

    public Ticket makeTicket(ICustomer c) {
        return new TrainTicket();
    }

}
