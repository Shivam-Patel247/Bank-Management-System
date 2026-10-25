package com.project.bankmanagement;

public class CurrentAccount extends CreateBankAccount{
	public CurrentAccount(String customerName, String accountNumber, double balance) {
		super(customerName, accountNumber, balance);
	}
	
	@Override
	public String getAccountType() {
		return "Current Account";
	}
}
