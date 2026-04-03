package main.java.bridgePayment.payTypeAbstract;


import main.java.bridgePayment.payMethodImplement.PayMethod;

public abstract class PayType {
    protected PayMethod method;

    public PayType(PayMethod method) {
        this.method = method;
    }

    public abstract void processPayment(double amount);
}

