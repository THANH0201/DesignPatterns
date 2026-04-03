package main.java.bridgePayment.payMethodImplement;

public class RewardPoint implements PayMethod {

    @Override
    public void execute(double amount) {
        System.out.println("Using reward points equivalent to: " + amount + " EUR");
    }
}

