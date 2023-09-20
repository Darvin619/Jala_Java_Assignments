package loops;

import java.util.Scanner;

public class PrintGenderWithSwitch {

	public static void main(String[] args) {
		
//		String Gender = "M";								//Without Scanner
		
		Scanner Sc = new Scanner(System.in);				//With Scanner
		System.out.println("Enter Gender (M/F) :");
		
		String Gender = Sc.next();
		
		
		switch(Gender ){
			case "M":
			case "m":
			System.out.println("Male");
			break;
			
			case "F":
			case "f":
			System.out.println("Female");
			break;
			default :
				System.out.println("Invalid Input");
				Sc.close();
		}

	}

}
