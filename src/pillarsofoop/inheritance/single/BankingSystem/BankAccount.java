package pillarsofoop.inheritance.single.BankingSystem;


public class BankAccount {
    private String Username;
    private int AccountNumber;
    private double Balance;

    public BankAccount(String user, int number, double amount) {
        Username = user;
        AccountNumber = number;
        Balance = amount;
    }

    public String getUsername(){
        return Username;
    }

    public int getAccountNumber(){
        return AccountNumber;
    }

    public double getBalance () {
        return Balance;
    } 

    public double deposit(double addAmount) {
        Balance += addAmount;
        return Balance;
        
    }

    public double withDraw(double decreaseAmount) {
        Balance -= decreaseAmount;
        return Balance ;
        
    }

    public void displayDetails(){
        System.out.println("Name : " + Username + "\n" 
                        + "Account number : " + AccountNumber +"\n"
                        + "Balance : " + getBalance() + "\n");
                    }
};

