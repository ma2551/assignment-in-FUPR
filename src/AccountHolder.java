import java.time.LocalDate;

public class AccountHolder implements Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private SavingsAccount savingsAccount;

    public AccountHolder(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public void setSavingsAccount(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    // Implement other methods from the Person interface if necessary
}
