package loops;

public class LargestNumber_among3Numbers {

	static int a = 240;
	static int b = 107;
	static int c = 180;
	
	public static void main(String[] args) {
	
		
		//Method1:
//		int largest = a;
//		
//		if(b>largest) {
//			largest=b;
//		}
//		if(c>largest) {
//			largest=c;
//		}
//		
//		System.out.println(largest);
//	}
	
	//Method2:
	if(a > b && a>c) {
		System.out.println("Largest Number is " + a);
	}
	else if(b>a && b>c) {
		System.out.println("Largest Number is " + b);
	}
	else {
		System.out.println("Largest Number is " + c);
	}

}}
