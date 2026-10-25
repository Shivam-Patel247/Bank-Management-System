package com.project.bankmanagement;

public class CreateBankAccount {
     private String customerName;
     private String accountNumber;
     private double balance;
     
     public CreateBankAccount(String customerName, String accountNumber, double balance) {
    	 
    	 if (balance < 0) {
             throw new IllegalArgumentException(
                 "Initial balance cannot be negative."
             );
         }
    	 
    	 this.customerName = customerName;
    	 this.accountNumber = accountNumber;
    	 this.balance = balance;
     }
     
     public String getCustomerName() {
    	 return customerName;
     }
     
     public String getAccountNumber() {
    	 return accountNumber;
     }
     
     public double balance() {
    	 return balance;
     }

     
     public void deposit(double amount) {
    	 if(amount <= 0) {
    		 System.out.println("Deposit  amount must be positive");
    		 return;
    	 }
    	 
    	 balance += amount;
    	 System.out.println("Deposit successful!");
     }
     
     public void withdraw(double amount) {
    	 if(amount <= 0) {
    		 System.out.println("Withdraw amount must be positive! ");
    	 }
    	 else if(amount >  balance) {
    		 System.out.println("Insufficient balance.");
    	 }
    	 
    	 else {
    		 balance-=amount;
    		 System.out.println("Withdrawal successful!");
    	 }
     }

     public void displayCreateBankAccount() {
    	 System.out.println("Customer Name : " + customerName);
    	 System.out.println("Account Number : " + accountNumber);
    	 System.out.println("Balance :  ₹" + balance);
     }
     public String getAccountType() {
    	 return "General Account";
     }
}
