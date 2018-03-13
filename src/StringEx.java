
public class StringEx {

	public static void main(String[] args) {
		String name = "Rohith Sharma is a greats batman";
		
		if(name.isEmpty()) {
			System.out.println("String is Empty");
		}
		if(name.startsWith("R")) {
			System.out.println("Name is Rohith");
		}
		System.out.println("Substring = "+name.substring(3, 9));
		System.out.println("character at 9 = "+name.charAt(9));
		System.out.println("index of S is "+name.indexOf("S"));
		System.out.println("Replace R with L ="+name.replace("Rohith","Pandya"));
		System.out.println("Subsequence from 0 to 7 is "+name.substring(0,7));
	}

}
