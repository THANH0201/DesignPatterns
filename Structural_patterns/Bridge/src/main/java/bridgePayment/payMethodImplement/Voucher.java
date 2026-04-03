package main.java.bridgePayment.payMethodImplement;


public class Voucher implements PayMethod {

    @Override
    public void execute(double amount) {
        System.out.println("Applying voucher for: " + amount + " EUR");
    }
}

