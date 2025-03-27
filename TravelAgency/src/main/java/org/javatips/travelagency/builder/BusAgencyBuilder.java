package org.javatips.travelagency.builder;

import org.javatips.travelagency.customer.ICustomer;
import org.javatips.travelagency.factory.BusAgency;
import org.javatips.travelagency.factory.ITravelAgency;

public class BusAgencyBuilder implements ITravelAgencyBuilder {
    @Override
    public ITravelAgency build(ICustomer customer) {
        return new BusAgency();
    }
}