package multipleclasses;
import java.util.Scanner;
public class Random {
	public static void main(String[] args) {
				Random dice = new Random();
				int number;
				
				for(int counter=1;counter<=10;counter++) {
					number=dice.nextInt(6);
					System.out.println(number);
					
				}
				
	}

}