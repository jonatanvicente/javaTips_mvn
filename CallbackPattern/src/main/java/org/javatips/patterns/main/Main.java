package org.javatips.patterns.main;

import org.javatips.patterns.bo.BillingAccount;
import org.javatips.patterns.bo.CreditCard;
import org.javatips.patterns.bo.IPaymentMethod;
import org.javatips.patterns.remote.Remote;

public class Main {

    private static Remote remote;

    static {
        remote = new Remote();
    }

    public static void main (String[] ar){

        Main m = new Main();
        m.callRemote(new CreditCard());
        m.callRemote(new BillingAccount());
    }

    void callRemote(IPaymentMethod pay){
        remote.executeCallback(pay);
    }

}
