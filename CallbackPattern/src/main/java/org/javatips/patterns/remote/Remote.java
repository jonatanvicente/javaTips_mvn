package org.javatips.patterns.remote;

import org.javatips.patterns.bo.IPaymentMethod;

public class Remote {

    public void executeCallback (IPaymentMethod pay){
        pay.execute();
    }

}
