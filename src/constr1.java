
public class constr1 {
	
	public String a;
	
	

	public constr1(String name) {
		a = name;
	}
	
	public void pk() {
	System.out.println("Your name is "+a);
	}
	public static void main(String args[]) {
		constr1 sc = new constr1("chakri");
		
		sc.pk();
		
	}
}
