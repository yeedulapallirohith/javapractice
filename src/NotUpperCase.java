	import java.util.Scanner;

	public class NotUpperCase extends Exception{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		String s;
		
		NotUpperCase(String name){
			this.s = name;
		}
		
		public String toString() {
			return "The correct format of name is " + this.s.toUpperCase(); 
		}
		
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String s = "";
			try {
				System.out.println("Enter your name in Caps:");
				s = scan.nextLine();
				if(!(s.toUpperCase().equals(s))) {
					
					throw new NotUpperCase(s);
					
				}
				
			} catch (NotUpperCase r) {
						System.out.println(r);
			}
			finally {
				scan.close();
				System.out.println("Closed scanner object in finally block");
			}
			
		}


}
