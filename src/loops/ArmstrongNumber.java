package loops;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
				// Declare and initialize variables
		
		        int a = 123;  						// Number to be checked for being an Armstrong number		        
		        int temp, sum=0, rem=0;
		        temp = a;							// Store the original number in a temporary variable

		        									// Calculate the sum of cubes of individual digits

		        while(a != 0){		        
		        rem = a % 10;						// Extract the last digit of the number		        
		        sum = sum + (rem * rem * rem);		// Calculate the cube of the extracted digit and add it to the sum	        
		        a = a / 10;							// Remove the last digit from the number
		        
		        }

		        									// Check if the original number is an Armstrong number		        
		        if (temp == sum) {
		            System.out.println(temp + " is an Armstrong Number");
		        } else {
		            System.out.println(temp + " is Not an Armstrong Number");
		     }
	 }
}

