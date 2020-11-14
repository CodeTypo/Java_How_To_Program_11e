import java.util.Scanner;


public class AccountTester {
		public static void main(String[] args) {
		 Account account1 = new Account("Jane Green", 50.00);
		 Account account2 = new Account("John Blue", 11.53);

		 // display initial balance of each object
		 displayAccount(account1);
		 displayAccount(account2);

		 // create a Scanner to obtain input from the command window
		 Scanner input = new Scanner(System.in);

		 System.out.print("Enter deposit amount for account1: "); // prompt
		 double depositAmount = input.nextDouble(); // obtain user input
		 System.out.printf("%nadding %.2f to account1 balance%n%n",
		 depositAmount);
		 account1.deposit(depositAmount); // add to account1’s balance

		 // display balances
		 displayAccount(account1);
		 displayAccount(account2);
		 System.out.print("Enter withdraw amount for account2: "); // prompt
		 double withdrawAmount = input.nextDouble(); // obtain user input
		 System.out.printf("%nwithdrawing %.2f from account2 balance%n%n",
		 withdrawAmount);
		 account2.withdraw(withdrawAmount); // add to account2 balance

		 // display balances
		 displayAccount(account1);
		 displayAccount(account2);
		}//end of main
 
		public static void displayAccount (Account acc){
		System.out.printf("%s balance: $%.2f%n",
		acc.getName(), acc.getBalance());
		}
	}//end of class




