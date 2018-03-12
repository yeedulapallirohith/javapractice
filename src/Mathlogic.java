

public class Mathlogic implements Maths {
	int a,b,c;
	@Override
	public int addition(int a,int b) {
		
		this.a = a;
		this.b = b;
		c = a+b;
		return c;
	}
	@Override
	public int substraction(int s,int g) {
		
		c = a-b;
		return c;
	}

	@Override
	public int multiplication(int s,int g) {
		
		c = a*b;
		return c;
	}



}
