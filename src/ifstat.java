import java.util.Scanner;
public class ifstat {
	public static void main(String args[]) {
		String Gender;
		int age;
				
		Scanner gen = new Scanner(System.in);
		System.out.println("Please mention your gender");
		Gender=gen.nextLine();
		
		
		System.out.println("How old are you?");
		age=gen.nextInt();
		System.out.println(age);
		
		if("Male".equals(Gender) && (age>18 && age<40)) 
		{
			System.out.println("Welcome to Tindrr");
		}	
		else if("Female".equals(Gender) && (age>16 && age<30))
		{	System.out.println("Welcome to Tindrr");
		}	
		else
			{
			System.out.println("This is not for your age, try something else");
			}	
		
		
	}

}
