package pillarsofoop.inheritance.single.BankingSystem;

public class SavingAccount extends BankAccount{
    private double interest_rate;

    public SavingAccount (String user, int number, double amount, double interest){
        super(user, number, amount);
        interest_rate = interest;
    }

    public double getInterestRate(){
        return interest_rate;
    }

    public double addInterest(){
        double addInterest = getBalance() * interest_rate;
        double newBalance = deposit(addInterest); 
        return newBalance;
    }
}