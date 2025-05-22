package abstraction.paymentsystem;

public class Main {

    public static void main (String[] args){

        CreditCard card = new CreditCard();
        System.out.println("Processing credit card payment of $" + card.processPayment(1000));

        Paypal pal = new Paypal();
        System.out.println("Processing PayPal payment of $ " + pal.processPayment(500));

        GooglePay gpay = new GooglePay();
        System.out.println("Processing Gooleg Pay payment of $ " + gpay.processPayment(300));
    }
}