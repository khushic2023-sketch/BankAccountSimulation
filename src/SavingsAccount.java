public class SavingsAccount extends BankAccount {

	private double interestRate;

	public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
		super(accountNumber, initialBalance);

		if (interestRate < 0) {
			throw new IllegalArgumentException("Interest rate cannot be negative.");
		}
		this.interestRate = interestRate;
	}

	public void applyInterest() {
		double interest = balance * interestRate;
		balance += interest;
	}

	public double getInterestRate() {
		return interestRate;
	}
}
