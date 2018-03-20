import java.util.Scanner;

public class ForLoop {

	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int n = sc.nextInt();
		
		if(n>0 && n<16)
		{
			System.out.println("You are minor");
		}
		else if(n>16 && n<60)
			{
				System.out.println("Welcome to voting System");
			
			}
				else
				{
					System.out.println("You are old couger");
				}
				
		
		
	}

}
