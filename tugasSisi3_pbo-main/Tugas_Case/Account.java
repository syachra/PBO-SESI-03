package Tugas_Case;

/**
 *
 * @author akmal
 */
public class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double jumlah) {
        balance += jumlah;
    }

    public boolean withdraw(double jumlah) {
        if (balance - jumlah >= 0) {
            balance -= jumlah;
            return true;
        }
        return false;
    }
}

