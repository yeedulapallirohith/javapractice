
import java.util.Scanner;
public class switch1 {
	public static void main(String args[]) {
		int age;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How old are you? ");
		age = sc.nextInt();
		
		switch(age) {
		
		case 1: 
			System.out.println("You can walk");
			
			break;
	
		case 2:
			System.out.println("You can talk");
			
			break;
			
			default:
				System.out.println("I dont know ur age");
		}
		
		
	}

}
