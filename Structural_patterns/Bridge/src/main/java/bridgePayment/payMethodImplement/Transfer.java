package main.java.bridgePayment.payMethodImplement;


public class Transfer implements PayMethod {

    @Override
    public void execute(double amount) {
        System.out.println("Processing bank transfer: " + amount + " EUR");
    }
}

