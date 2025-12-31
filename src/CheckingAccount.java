public class CheckingAccount extends BankAccount {

	private double overdraftLimit = 200.0;
	
	public CheckingAccount(String accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
	}

	@Override
	public void withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Withdrawal amount must be positive.");
		}

		if (balance - amount < -overdraftLimit) {
			throw new IllegalArgumentException("Overdraft limit exceeded.");
		}

		balance -= amount;
		transactions.add("Withdrew: $" + amount + ", Balance: $" + balance);
	}
}
