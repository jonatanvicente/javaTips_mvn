package org.javatips.travelagency.factory;

import org.javatips.travelagency.bo.Ticket;
import org.javatips.travelagency.bo.TrainTicket;

public class TrainAgency implements ITravelAgency {

    public Ticket makeTicket() {
        return new TrainTicket();
    }

}
