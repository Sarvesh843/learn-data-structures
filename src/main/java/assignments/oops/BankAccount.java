package assignments.oops;

public class BankAccount {
    public int balance;
    public String name;

    public BankAccount(int bal, String s) {
        balance = bal;
        name = s;
    }

    public void depositFund(int fund) {
        balance += fund;
    }

    public boolean withdrawFund(int fund) {
        if (balance >= fund) {
            balance -= fund;
            return true;
        } else {
            return false;
        }
    }
}
