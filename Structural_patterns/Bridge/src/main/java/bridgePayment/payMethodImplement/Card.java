package bridgePayment.payMethodImplement;


public class Card implements PayMethod {

    @Override
    public void execute(double amount) {
        System.out.println("Processing card payment: " + amount + " EUR");
    }
}

