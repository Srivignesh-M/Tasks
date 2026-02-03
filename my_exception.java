package Tasks;

import java.util.Scanner;

public class my_exception {

	public static void main(String[] args) {
		int minBalance=1000;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter balance:");
		int balance=s.nextInt();
		System.out.println("Enter amount to withdraw:");
		int withdrawAmount=s.nextInt();
		try {
		if((balance-withdrawAmount)<minBalance) {
			throw new MinimumBalanceException();
		}
		}
		catch(MinimumBalanceException e) {
			System.err.println("Mininum Balance of "+minBalance+" Needed in your A1ccount");
		}

	}

}
