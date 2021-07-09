package almamatter;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Dividend and divisor");
		int a= s.nextInt();
		int b=s.nextInt();
		int q= a/b;
		int r=a%b;
		System.out.println("Quotient: "+ q);
		System.out.println("Remainder: "+ r);
		
	}

}
