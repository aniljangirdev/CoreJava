package pack5;

public class StrategyPattern {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        PaymentStrategy creditCardPayment = new PayPalPayment();
        shoppingCart.setPaymentStrategy(creditCardPayment);
        shoppingCart.checkout(100);
    }


}

interface PaymentStrategy{
    void pay(int amt);
}

class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(int amt) {
        System.out.println("Paid " + amt + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {

    @Override
    public void pay(int amt) {
        System.out.println("Paid " + amt + " Paypal.");
    }
}

class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void checkout(int amt){
        this.paymentStrategy.pay(amt);
    }
}