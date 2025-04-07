package org.javatips.travelagency.builder;

import org.javatips.travelagency.customer.ICustomer;
import org.javatips.travelagency.factory.ITravelAgency;
import org.javatips.travelagency.factory.TrainAgency;

public class TrainAgencyBuilder implements ITravelAgencyBuilder {
    @Override
    public ITravelAgency build(ICustomer customer) {
        return new TrainAgency();
    }
}



