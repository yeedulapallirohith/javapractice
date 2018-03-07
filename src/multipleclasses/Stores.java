package multipleclasses;
import java.util.Scanner;
public class Stores {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Kemp k = new Kemp();
		
		System.out.println("What is store name?");
		
		String name = sc.nextLine();
		
		k.store(name);
		
		
		
		
	}

}
