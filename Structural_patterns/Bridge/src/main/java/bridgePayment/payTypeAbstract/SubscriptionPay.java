package main.java.bridgePayment.payTypeAbstract;


import main.java.bridgePayment.payMethodImplement.PayMethod;
import main.java.bridgePayment.payTypeAbstract.PayType;

public class SubscriptionPay extends PayType {

    public SubscriptionPay(PayMethod method) {
        super(method);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing recurring subscription payment...");
        method.execute(amount);
    }
}

