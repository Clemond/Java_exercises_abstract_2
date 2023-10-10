public class Main{
    public static void main(String[] args) {

        // Skapa en abstract klass som heter BankAccount med instansvariablerna:
        // int accountNumber
        // String accountHolder
        // double balance

        // Skapa en konstruktor som tar in alla parametrar ovan.

        // Metoder:

        // en abstract metod som heter deposit med parametern (double amount), den ska tillåta dig att sätta in pengar på kontot.

        // en abstract metod som heter withdraw med parametern (double amount), den ska tillåta dig att ta ut pengar from kontot. Säkerställ att balance inte kan nå under 0.

        // en abstract metod som heter displayAccountInfo(), den visar det aktuella saldot.

        // Skapa en subklass som får ärva från BankAccount, SavingsAccount.

        // Den här klassen kan hålla reda på en speciell logik för ett SavingsAccount, exempelvis att man har
        // ett minimum minstavärde på kontot. Att ens konto inte kan understiga 0, kan man implementera i 
        // withdraw-metoden.
        // Vad mer kan ett SavingsAccount tänkas göra?
        // Skapa ett nytt objekt av SavingsAccount från main, skapa flera konton. 

        SavingsAccount konto1 = new SavingsAccount(123_456_789, "Nicholas", 100);

        konto1.deposit(80);
        konto1.displayAccountInfo();



        
    }
}