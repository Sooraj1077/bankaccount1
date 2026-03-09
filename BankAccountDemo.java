class BankAccount {

    double balance = 1000;

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Show balance
    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.deposit(500);
        acc.withdraw(200);
        acc.showBalance();
    }
}