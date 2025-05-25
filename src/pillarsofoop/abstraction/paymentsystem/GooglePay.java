package pillarsofoop.abstraction.paymentsystem;

public class GooglePay extends Payment {

    @Override

    public double processPayment(double amount) {
        return amount;
    }
}
