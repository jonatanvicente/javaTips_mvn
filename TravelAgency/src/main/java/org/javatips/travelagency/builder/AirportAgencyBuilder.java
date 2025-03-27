package org.javatips.travelagency.builder;

import org.javatips.travelagency.customer.ICustomer;
import org.javatips.travelagency.factory.AirportAgency;
import org.javatips.travelagency.factory.ITravelAgency;

public class AirportAgencyBuilder implements ITravelAgencyBuilder {
    @Override
    public ITravelAgency build(ICustomer customer) {
        return new AirportAgency();
    }
}
