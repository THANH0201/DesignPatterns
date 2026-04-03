package main.java.bridgePayment.payTypeAbstract;


public class InstallmentPay extends PayType {

    public InstallmentPay(PayMethod method) {
        super(method);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing installment payment...");
        method.execute(amount / 3);
    }
}

