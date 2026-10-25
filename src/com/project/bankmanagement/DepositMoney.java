package com.project.bankmanagement;

public class DepositMoney {
	private CreateBankAccount account;
	public DepositMoney(CreateBankAccount account) {
		this.account = account;
	}
	
	public void addDeposit(double amount) {
		account.deposit(amount);
		System.out.println("Current Balance : " + account.balance());
	}
    
}
