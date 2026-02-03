package Tasks;

import java.util.Scanner;

public class Exception_practice {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numerator:");
		int n=s.nextInt();
		System.out.println("Enter denominator:");
		int d=s.nextInt();
		System.out.print(divide(n,d));
	}
	public static int divide(int a,int b) {
		int ans=0;
		try {
			ans=a/b;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			return ans;
		}
	}

}
