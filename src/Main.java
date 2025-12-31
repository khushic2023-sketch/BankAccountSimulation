public class Main {
	
	public static void main(String[] args) {
	
		CheckingAccount checking = new CheckingAccount("CHK1001", 500.00);
		SavingsAccount savings = new SavingsAccount("SAV2001", 1000.00, 0.02);

		checking.deposit(200.00);
		checking.withdraw(150.00);

		savings.deposit(500.00);
		savings.applyInterest();
	
		System.out.println("Checking Account Balance: $" + checking.getBalance());
		System.out.println("Savings Account Balance: $" + savings.getBalance());
	}
}
