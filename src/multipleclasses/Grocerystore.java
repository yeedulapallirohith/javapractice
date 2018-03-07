package multipleclasses;
import java.util.Scanner;
public class Grocerystore {
	public static void main(String[]args) {
	
		Fruits fruitobj = new Fruits(); //importing from Fruits class 
		fruitobj.apples();
		
		Fruits q = new Fruits(); //import from Fruits class
		q.quantity();
		
		Fruits imp = new Fruits();
		imp.imports();
		
		Fruits ban = new Fruits();
		ban.banana();
		 
		
	}
	
}
