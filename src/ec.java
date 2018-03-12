
import java.util.Scanner;
public class ec {

	public static void main(String args[]) {
		
		Maths m1 = new Mathlogic();
		Mathlogic m = new Mathlogic();
		
		Scanner obj = new Scanner(System.in);
		

		
		System.out.println("Enter First number");
		int n = obj.nextInt();
		
		System.out.println("Enter Second number");
		int x = obj.nextInt();
		
		System.out.println("Sum is "+m.addition(n,x));
		System.out.println("Sub is "+m.substraction(n,x));
		System.out.println("Product is "+m.multiplication(n,x));
		
		
		
		
	}

}
