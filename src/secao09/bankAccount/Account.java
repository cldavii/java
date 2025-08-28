package secao09.bankAccount;

public class Account {
    private final int number;
    private final String name;
    private double balance;

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Account(int number, String name, double balance) {
        this.number = number;
        this.name = name;
        deposit(balance);
    }

    //Getters
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double value) {
        balance -= value + 5;
    }

    public void deposit(double value) {
        balance += value;
    }

    @Override
    public String toString() {
        return "Account " + getNumber() + ", Holder: " + getName() + ", Balance: $ " + String.format("%.2f", getBalance());
    }
}
