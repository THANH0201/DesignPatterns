package main.java.bridgePayment.payTypeAbstract;


public class PayNow extends PayType {

    public PayNow(PayMethod method) {
        super(method);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paying immediately...");
        method.execute(amount);
    }
}

