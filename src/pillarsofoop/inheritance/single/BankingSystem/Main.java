package pillarsofoop.inheritance.single.BankingSystem;

public class Main {
    public static void main (String[] args) {
        BankAccount account = new BankAccount("Jane", 1553, 10000);
        account.displayDetails();

        System.out.println("Added amount : " + account.deposit(3000) + "\n"
        );
        System.out.println("Withdrawn amount : " + account.withDraw(2000) + "\n" 
        );

        SavingAccount acc = new SavingAccount("Jane", 1553, 10000, 0.5);

        System.out.println("Added Interest : " + acc.addInterest()
        + "\n");
                                                                

    }
}