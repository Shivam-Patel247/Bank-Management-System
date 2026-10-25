package com.project.bankmanagement;

public class WithdrawMoney {
	private CreateBankAccount account;
	public WithdrawMoney(CreateBankAccount account) {
		this.account = account;
	}
	public void withdrawAmount(double amount) {
		account.withdraw(amount);
		System.out.println("Current Balance: ₹" + account.balance() );
	}
}
