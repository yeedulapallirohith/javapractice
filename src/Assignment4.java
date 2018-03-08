import java.util.Scanner;
public class Assignment4 {
	
	public String firstName;
	int age;
	long phoneNum;
	
	public Assignment4(String name, int age1 , long phno) {
		firstName=name;
		this.age = age1;
		phoneNum = phno;
		}
	 public void ex() {
		 System.out.println("Your first name is " +firstName);
		 System.out.println("Your first name is " +age); 
		 System.out.println("Your first name is " +phoneNum); 
		 
	 }
	 
	 
	public static void main(String[] args) {
	
	Assignment4 asobj = new Assignment4("Rohith ",24,630862771);
		
	asobj.ex();
	
	}

}
