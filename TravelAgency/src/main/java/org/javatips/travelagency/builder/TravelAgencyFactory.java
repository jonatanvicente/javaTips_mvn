package org.javatips.travelagency.builder;

import org.javatips.travelagency.customer.Adult;
import org.javatips.travelagency.customer.Aged;
import org.javatips.travelagency.customer.ICustomer;
import org.javatips.travelagency.customer.Kid;
import org.javatips.travelagency.factory.AirportAgency;
import org.javatips.travelagency.factory.ITravelAgency;

import java.util.HashMap;
import java.util.Map;

public class TravelAgencyFactory {

    //Singleton
    private static final TravelAgencyFactory INSTANCE = new TravelAgencyFactory();

    //Strategy
    private final Map<Class<? extends ICustomer>, ITravelAgencyBuilder> builders = new HashMap<>();

    private TravelAgencyFactory(){
        builders.put(Kid.class, new BusAgencyBuilder());
        builders.put(Adult.class, new AirportAgencyBuilder());
        builders.put(Aged.class, new TrainAgencyBuilder());
    }

    public static TravelAgencyFactory getInstance() {
        return INSTANCE;
    }

    public ITravelAgency build(ICustomer customer) {
        ITravelAgencyBuilder builder = builders.get(customer.getClass());
        return builder.build(customer);
    }
}

