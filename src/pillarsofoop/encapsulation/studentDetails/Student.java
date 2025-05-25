package pillarsofoop.encapsulation.studentDetails;

public class Student {

    private int accountNumber;
    private int balance;
    private String accountHolderName;

    public void setAccountNumber(int accountNum) {
        accountNumber = accountNum;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int value) {
        balance = value;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public int deposit(int money) {
        return balance += money;
    }

    public int withdraw(int money) {
        if (money > this.balance) {
            System.out.println("Insufficient balance to withdraw amount");
            return 0;
        } else {

            return balance -= money;
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setAccountHolderName("John");
        student.setAccountNumber(15443);
        student.setBalance(5000);

        System.out.println("Name : " + student.getAccountHolderName());
        System.out.println("Account number : " + student.getAccountNumber());
        System.out.println("Initital Balance : " + student.getBalance());
        System.out.println(" Balance after deposit : " + student.deposit(3000));
        System.out.println("Balance after withdraw : " + student.withdraw(1000));

    }
}
