package loops;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		int a = 11, Count =0;
		
		if (a>1) {							//Check if the number is greater than 1
			
			for(int i=1; i<=a; i++) {		//Condition 2: Initialize a Count to keep track of divisors
				
				if(a%i == 0)
					Count++;
				
			} if(Count ==2) {
				
				System.out.println("It is a Prime Number");
				
			}else {
				
				System.out.println("It is Not a Prime Number");
			}
			
		}else {
			System.out.println("It is not a Prime Number");
		}
	}

}
