package pillarsofoop.abstraction.paymentsystem;

public class Paypal extends Payment {

    @Override
    public double processPayment(double amount){
        return amount;
    }
}