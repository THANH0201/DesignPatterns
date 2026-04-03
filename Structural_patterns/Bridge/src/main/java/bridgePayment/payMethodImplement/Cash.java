package main.java.bridgePayment.payMethodImplement;


public class Cash implements PayMethod {

    @Override
    public void execute(double amount) {
        System.out.println("Processing cash payment: " + amount + " EUR");
    }
}
