package main.java.bridgePayment;



public class Main {
    public static void main(String[] args) {

        PayType pay1 = new PayNow(new Card());
        pay1.processPayment(100);

        System.out.println();

        PayType pay2 = new PayOnDelivery(new Cash());
        pay2.processPayment(50);

        System.out.println();

        PayType pay3 = new InstallmentPay(new Transfer());
        pay3.processPayment(300);

        System.out.println();

        PayType pay4 = new SubscriptionPay(new EWallet());
        pay4.processPayment(20);
    }
}

