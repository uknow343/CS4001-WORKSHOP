class BankAccount {
    String accountNumber;
    String holderName;
    double balance;

    public BankAccount(String accNum, String name, double initialBalance) {
        accountNumber = accNum;
        holderName = name;
        balance = initialBalance;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        if (amount <= balance) {
            balance = balance - amount;
        }else{
            System.out.println("Insufficient balance for " + holderName);
        }
    }

    public void displayBalance(){
        System.out.println("Account: " + accountNumber + " | Holder: " + holderName + " | Balance: " + balance);
    }
}

public class Main{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("01", "abinash", 1000.0);
        BankAccount account2 = new BankAccount("02", "rohan", 500.0);

        account1.deposit(450.0);
        account1.withdraw(200.0);
        account2.deposit(190.0);
        account2.withdraw(150.0);
        account1.displayBalance();
        account2.displayBalance();
    }
}