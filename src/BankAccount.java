import java.util.Scanner;

public class BankAccount {
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;

	public BankAccount(String customerName, String customerID) {
		this.customerName = customerName;
		this.customerID = customerID;
	}

	public void deposit(int amount) {
		if (amount > 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}

	public void withdraw(int amount) {
		if (amount > 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}

	public void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("You Deposited " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("You Withdrawn " + Math.abs(previousTransaction));
		} else {
			System.out.println("No Transaction Recorded");
		}

	}

	public void showMenu() {
		char option;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello " + customerName);
		System.out.println("Your ID is " + customerID);
		System.out.println("************************************");

		do {
			System.out.println("A. Check Balance");
			System.out.println("B. Deposit");
			System.out.println("C. Withdraw");
			System.out.println("D. View Previous Transaction");
			System.out.println("E. Exit");
			System.out.println("************************************");

			System.out.println("Enter An Option: ");
			
			option = scanner.next().charAt(0);
			System.out.println("\n");

			switch (option) {
			case 'A':
				System.out.println("Your Balance Is: " + balance);
				if (balance < 0) {
					System.out.println("Overdraft!");
				}
				System.out.println("************************************");
				break;
			case 'B':
				System.out.println("Enter a Deposit amount: ");
				int aAmount = scanner.nextInt();
				deposit(aAmount);
				getPreviousTransaction();
				System.out.println("************************************");
				break;
			case 'C':
				System.out.println("Enter a Widthdraw amount: ");
				int wAmount = scanner.nextInt();
				withdraw(wAmount);
				getPreviousTransaction();
				System.out.println("************************************");
				break;
			case 'D':
				getPreviousTransaction();
				System.out.println("************************************");
				break;
			case 'E':
				System.out.println("************************************");
				break;
			default:
				System.out.println("Not a Valid Input.");
				System.out.println("************************************");
				break;

			}

		} while (option != 'E');
		System.out.println("Thank you for using our services.");
	}
}
