package loops;

public class Odd_and_EvenNumbers {

	public static void main(String[] args) {

		int i = 1;
		// Even numbers from 1 to 20
		
//		for (i=1; i<=20; i++) {
//			
//			if(i%2 == 0) {
//				
//				System.out.println(i + " ");
//			}

			//Odd numbers from 1 to 20
			
			for(i=1; i<=20; i++) {
				if(i%2 != 0) {
					System.out.println(i + " ");
				}
			}
	}

}
