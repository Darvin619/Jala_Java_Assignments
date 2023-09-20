package loops;

public class LargestNumberWithMultiple_if_else_Statement {

	public static void main(String[] args) {
		int a=24,b=45, c=302;
		
		if (a>b && a>c) {
			System.out.println("Largest Number is :" + a);
		}else if(b>a && b>c) {
			System.out.println("Largest Number is :" + b);
		}else {
			System.out.println("Largest Number is :" + c);
		}

	}

}
