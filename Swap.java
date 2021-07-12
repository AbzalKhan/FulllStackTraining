package almamatter;

import java.util.Scanner;

public class Swap {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter two numbers..");
	int a = s.nextInt();
	int b = s.nextInt();
	System.out.println("Before Swapping..");
	System.out.println("A = "+a+" B = "+b);
	int c=a;
	a=b;
	b=c;
	System.out.println("After swapping...");
	System.out.println("A= "+a+" B = "+b);
	
}
}
