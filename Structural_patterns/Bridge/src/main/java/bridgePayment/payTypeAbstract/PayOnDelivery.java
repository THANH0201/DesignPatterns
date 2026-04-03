package main.java.bridgePayment.payTypeAbstract;


public class PayOnDelivery extends PayType {

    public PayOnDelivery(PayMethod method) {
        super(method);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment will be made upon delivery...");
        method.execute(amount);
    }
}

