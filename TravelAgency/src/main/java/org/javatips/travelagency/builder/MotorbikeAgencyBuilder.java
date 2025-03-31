package org.javatips.travelagency.builder;

import org.javatips.travelagency.customer.ICustomer;
import org.javatips.travelagency.factory.AirportAgency;
import org.javatips.travelagency.factory.ITravelAgency;
import org.javatips.travelagency.factory.MotorbikeAgency;

public class MotorbikeAgencyBuilder implements ITravelAgencyBuilder {
    @Override
    public ITravelAgency build(ICustomer customer) {
        return new MotorbikeAgency();
    }
}
