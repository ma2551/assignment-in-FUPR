import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Add a new account holder
        AccountHolder johnDoe = new AccountHolder("John", "Doe", LocalDate.of(2000, 1, 1));

        // Set up a new savings account with an initial balance of £1000 and an interest rate of 5%
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 0.05);
        savingsAccount.setOpeningDate(LocalDate.now());
        johnDoe.setSavingsAccount(savingsAccount); // associate account holder with the savings account

        // Deposit £1000 into the savings account every year for 10 years.
        for (int i = 1; i <= 10; i++) {
            LocalDate depositDate = savingsAccount.getOpeningDate().plusYears(i);
            double balanceAfterDeposit = savingsAccount.deposit(1000.0);
            System.out.printf("Year %d: Balance after deposit: £%.2f%n", i, balanceAfterDeposit);
        }
    }
}
