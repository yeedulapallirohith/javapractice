import java.io.*;
public class SerialEx {
	  public static void main(String [] args) {
	      
		  Asphalt e = new Asphalt();
	      e.name = "Rohith";
	      e.address = "1298 Dunbarton Dr Chicago";
	      e.SSN = 98765;
	      e.number = 3333;
	      
	      try {
	         FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Rohith\\Pictures\\employee.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         
	          out.writeObject(e);
	         out.close();
	         fileOut.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         return;
	      } 
	      
	      
	      System.out.println("Serialized Employee...");
	      System.out.println("Name: " + e.name);
	      System.out.println("Address: " + e.address);
	      System.out.println("SSN: " + e.SSN);
	      System.out.println("Number: " + e.number);
	   }
}
