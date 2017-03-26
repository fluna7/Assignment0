import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestAccount
{
	public static void main(String [] args) {
		
		
			System.out.println("Enter your account number");
			 Scanner input = new Scanner(System.in);
	         int number = input.nextInt();
			Account myAccount = new Account ( 1122, 20000);
			myAccount.getAnnualInterestRate(.0045);
			myAccount.withdraw(2500);
			myAccount.deposit(3000);
			System.out.println("balance: " + myAccount.getBalance() + 
					"\nMonthly Interest: " +myAccount.getMonthlyInterest() +
					"\nAccount created" +myAccount.getDateCreated());
			
			
		}
	
		
	
	
}