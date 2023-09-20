package loops;

import java.util.Scanner;

public class PalindromeNumberCheck {

	public static void main(String[] args) {

//		with Scanner Class:
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter a Number:");
//		int a = s.nextInt();
		
		int a = 132;		//Without Scanner class
		
		int temp = a;
		
		int rev =0;
		while(a !=0) {
			rev =rev*10 + a%10;
			a=a/10;
		}
		if(temp == rev) {
			System.out.println("It is a Palindrome Number");
		}else {
			System.out.println("It is Not a Palindrome Number");
		}
	}

}
