public abstract class BankAccount {
    
    int accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    //Metoder

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void displayAccountInfo();


}
