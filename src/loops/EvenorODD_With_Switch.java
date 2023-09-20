package loops;

import java.util.Scanner;

public class EvenorODD_With_Switch {

	public static void main(String[] args) {


//		Scanner S = new Scanner(System.in);
//		System.out.println("Enter Number :");
//		
//		int Number = S.nextInt();
//		
//		
//		switch(Number %2) {
//		
//		case 0:
//			
//			System.out.println("Even Number");
//			break;
//		case 1:
//			
//			System.out.println("Odd Number");
//			break;
//			
//		default :
//			System.out.println("Enter Valid Value");
//			
//			S.close();
		
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = scanner.nextLong(); // Read the input as a long
        
        String result;
        
        switch ((int) (number % 2)) { // Cast the result of % 2 to int
            case 0:
                result = "even";
                break;
            case 1:
    
                result = "odd";
                break;
            default:
                result = "undefined"; // This case handles non-integer inputs
                break;
        }
        
        System.out.println("The number is " + result);
        
        scanner.close();
		}
		
	}

