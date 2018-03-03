import java.util.Scanner;
public class Sum {
	public static void main(String args[]) {
		Scanner Addition = new Scanner(System.in);
		double num1, num2, Sum;
		System.out.println("Enter first number");
		num1=Addition.nextDouble();
		System.out.println("Enter Second number");
		num2=Addition.nextDouble();
		Sum=num1+num2;
		System.out.println("Sum of numbers is"+Sum);
				
	}
	

}
