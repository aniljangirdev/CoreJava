package patterns;

public class TemplatePattern {
    public static void main(String[] args) {
        PaymentOnline paymentOnline = new PaymentOnline();
        paymentOnline.makeCustomerHappy("");
    }
}

class PaymentOnline extends OnlineBanking {

    @Override
    void makeCustomerHappy(String s) {
        // get order details
        // call processCustomer with order id
//        processCustomer(order.id);
    }
}

abstract class OnlineBanking {
    public void processCustomer(int id) {
        // do stuff
    }

    abstract void makeCustomerHappy(String s);
}
