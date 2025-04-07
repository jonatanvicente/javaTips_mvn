package org.javatips.travelagency.builder;

import org.javatips.travelagency.customer.ICustomer;
import org.javatips.travelagency.factory.ITravelAgency;

public interface ITravelAgencyBuilder {

    ITravelAgency build(ICustomer customer);

}
