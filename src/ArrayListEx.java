import java.util.*;

public class ArrayListEx {
   public static void main(String args[]) {
    
	  ArrayList<String> obj = new ArrayList<String>();

	  obj.add("Rohith");
	  obj.add("Sharma");
	  obj.add("Abhishek");
	  obj.add("Vamshi");
	  obj.add("Manoj");

	  System.out.println("Array list has:"+obj);

	  obj.add(0, "Ajay");
	  obj.add(1, "Sumanth");

	  obj.remove("Rohith");
	  obj.remove("Sharma");

	  System.out.println("Now array list has:"+obj);

	  obj.remove(1);

	  System.out.println("Final array list is:"+obj);
   }
}