package abstraction.paymentsystem;

public class CreditCard extends Payment {
    
    @Override
    public double processPayment(double amount) {
        return amount;
    }
}