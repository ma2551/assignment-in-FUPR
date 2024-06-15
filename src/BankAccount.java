import java.time.LocalDate;

public abstract class BankAccount {
    private double balance;
    private LocalDate openingDate;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.openingDate = LocalDate.now();
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    protected void setOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
    }

    // Other abstract methods can be defined here
}
