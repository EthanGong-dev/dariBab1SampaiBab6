package coding;

public class CurrentAccount extends Account{
	
	private double overDraftLimit = 500.0;
	
	public CurrentAccount(String accountNumber, String name, double balance, double overDraftLimit) {
		
		super(accountNumber, name, balance);

		this.overDraftLimit = overDraftLimit;
	}
	
	public void withdraw (double amountWithdraw) {
		double approved = balance + overDraftLimit;
		
		if (amountWithdraw > approved) {
			System.out.println("Account anda sudah melibihi dari overdraft yang telah ditetapkan dari pihak kami.");
			System.out.printf("Yang anda minta: RM1.2f\nBalance + Overdraft (yang tinggal): RM%1.2f", amountWithdraw,  approved);
		}
		else {
			balance -= amountWithdraw;
			
			System.out.printf("Withdraw: RM%1.2f\nBalance: RM%1,2f", amountWithdraw, balance);
			
			if (balance <= 0) {
				System.out.printf("Nota: Anda menggunakan RM%.2f daripada had Overdraft.\n", Math.abs(balance));
			}
		}
	}

}
