package coding;

public class SavingAccount extends Account {
	
	public SavingAccount(String accountNumber, String accountHolderName, double balance) {
		super(accountNumber, accountHolderName, balance);
	}
	
	public void withdraw(double amountWithdraw) {
		double balanceAfterWithdraw = balance - amountWithdraw;
		
		if (balanceAfterWithdraw <= 20) {
			System.out.println("Baki minimum RM20 perlu dikekalkan!");
		}
		else {
			balance -= amountWithdraw;
			System.out.println("Sebanyak RM" + amountWithdraw + " ditolak dari account anda.");
		}
	}
	
}
