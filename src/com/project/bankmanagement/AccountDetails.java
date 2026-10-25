package com.project.bankmanagement;

import java.util.Scanner;

public class AccountDetails {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CreateBankAccount account = null;
		boolean running = true;

		while (running) {
			System.out.println("\n---BANK MANAGEMENT SYSTEM---");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withraw Money");
			System.out.println("4. Check Balance");
			System.out.println("5. Display Account Details");
			System.out.println("6. Exit");

			System.out.println("Enter your choice : ");
			int selectNum = scanner.nextInt();
			scanner.nextLine();
			switch (selectNum) {
			case 1: {
				if (account != null) {
					System.out.println("An account already exists");
					break;
				}
				System.out.println("Enter the  Name : ");
				String customerName = scanner.nextLine();

				System.out.println("Enter the account Number : ");
				String accountNumber = scanner.nextLine();

				System.out.println("Enter initial deposit : ");
				double balance = scanner.nextDouble();
				scanner.nextLine();

				if (balance < 0) {
					System.out.println("Initial deposit cannot be negative");
					break;
				}
				System.out.println("Select account type:");
				System.out.println("1. saving Account");
				System.out.println("2. current Account");
				System.out.println("Enter choice : ");

				int type = scanner.nextInt();
				scanner.nextLine();

				if (type == 1) {
					account = new SavingAccount(customerName, accountNumber, balance);
				}

				else if (type == 2) {
					account = new CurrentAccount(customerName, accountNumber, balance);
				} else {
					System.out.println("Invalid account type");
					break;
				}

				System.out.println("Account created successfully!");
				break;

			}
			case 2: {

				if (account == null) {
					System.out.println("Please create an account first");
					break;
				}

				System.out.println("Enter deposit amount : ");
				double amount = scanner.nextDouble();

				DepositMoney deposit = new DepositMoney(account);
				deposit.addDeposit(amount);
				break;
			}

			case 3: {
				if (account == null) {
					System.out.println("Please create an account first.");
					break;
				}

				System.out.println("Enter withdrawal amount : ");
				double amount = scanner.nextDouble();

				WithdrawMoney withdraw = new WithdrawMoney(account);
				withdraw.withdrawAmount(amount);
				break;
			}

			case 4: {
				if (account == null) {
					System.out.println("Please create an account first");
					break;
				}

				System.out.println("Current Balance : ₹" + account.balance());
				break;

			}
			case 5: {
				if (account == null) {
					System.out.println("Please create an account first.");
					break;
				}

				account.displayCreateBankAccount();
				System.out.println("Account type : " + account.getAccountType());
				break;
			}
			case 6:
				running = false;
				System.out.println("Thank you for using our bank!");
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		}
		scanner.close();
	}
}
