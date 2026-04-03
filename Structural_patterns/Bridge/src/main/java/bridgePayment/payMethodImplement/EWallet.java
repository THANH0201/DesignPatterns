package main.java.bridgePayment.payMethodImplement;


public class EWallet implements PayMethod {

    @Override
    public void execute(double amount) {
        System.out.println("Processing e-wallet payment: " + amount + " EUR");
    }
}

