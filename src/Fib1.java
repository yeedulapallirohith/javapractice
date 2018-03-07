import java.util.Scanner;
public class Fib1 {


 public static void main (String args[]) {
	 int z; //Declare an integer and don't assign any value
		
	 Scanner input = new Scanner(System.in); //You are allowing whatever value given as input to scanner will be taken in "input"
	 
	 System.out.println("Enter the length of Fibonacci");
	 z=input.nextInt(); //the input value is assigned to "integer z"
	 
	 int[] n = new int[z];
	  n[0] = 0;//declaring the position with the values to initialize the series in array
	  n[1] = 1;
	
	  for(int i = 2; i<z;i++) { //by considering interger i as position, increment the position till the value of z whatever is assigned
		n[i] = n[i-1]+n[i-2];// the number in position i is the sum of the both preceeding numbers
	}
	 
	 System.out.println("Hi, Fibonacci series until "+z+" are: ");
	 for(int i = 0; i < z; i++) {
		 System.out.println(n[i]+" ");
	 }
	 
 }
}