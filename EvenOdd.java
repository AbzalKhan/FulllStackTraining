package almamatter;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int a = s.nextInt();
		System.out.println((a%2==0)?"Even number":"Odd number");
		
	
	
	}

}
