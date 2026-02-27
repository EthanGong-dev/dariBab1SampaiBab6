package coding;

public abstract class Account {

	private String accountNumber;
	private String accountHolderName;
	protected double balance;
	
	public Account(String accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public void deposit (double amountDeposit) {
		if (amountDeposit > 0) {
			balance += amountDeposit;
			System.out.printf("RM%1.2f telah dimasukkan ke dalam account anda,", amountDeposit );
		}
		else {
			System.out.println("Deposit amount mestilah lebih daripada RM0 dan ke atas!");
		}
	}
	
	public String getAccountNumber() { 
		return accountNumber; 
		}
    public String getAccountHolderName() { 
    	return accountHolderName; 
    	}
    public double getBalance() { 
    	return balance;
    	}
	
	abstract void withdraw (double amountWithdraw);
}
