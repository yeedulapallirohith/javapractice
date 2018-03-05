
public class assn2 {
	static int x = 6;
	static int y =4;
	
		public static void main(String[] args) {
			Example as = new Example();   //importing value of a from Example class
			int aj = as.a;
			
			int z= x+y;
		System.out.println(as.a);
		System.out.println(z);
		
		
		int tot = product() + z; //calling return value from product
		System.out.println(tot);
		
	}
	
	public static int product() {
		int mul= x*y;
		System.out.println("product is "+mul);
		return mul;		
		
	}
	
	
	

}
