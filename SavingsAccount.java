public class SavingsAccount extends BankAccount{



    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void deposit(double amount) {
        balance = (balance + amount);
            System.out.println("Deposit succesfull!");
            System.out.println("Nuvarande saldo: " + balance + "kr");
    }

    @Override
    public void withdraw(double amount) {
        if((balance - amount) < 0){
            System.out.println("För lågt saldo!");
            System.out.println("Nuvarande saldo: " + balance + "kr");
        }
        else{
            balance = (balance - amount);
            System.out.println("Withdraw succesfull!");
            System.out.println("Nuvarande saldo: " + balance + "kr");
        }
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Accound number: " + accountNumber);
        System.out.println("Account holder: " + accountHolder);
        System.out.println("Account balance: " + balance + "kr");
        
    }
    
}
