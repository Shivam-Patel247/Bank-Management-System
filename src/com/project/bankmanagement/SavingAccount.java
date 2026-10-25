package com.project.bankmanagement;

public class SavingAccount extends CreateBankAccount{
	public SavingAccount(String customerName, String accountNumber, double balance) {
		super(customerName, accountNumber, balance);
	}
	
	
	@Override
	public String getAccountType() {
		return "Savings Account";
	}
}
