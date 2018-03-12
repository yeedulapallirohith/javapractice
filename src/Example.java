class Example{

	static int[] sumArray = new int[10];
	static int total = 0;

	public Example(int[] x) {
		
		for(int i = 0;i<x.length;i++)
		{
		System.out.println(x[i]);
		sumArray[i] = x[i];
		}
	
	}
	public void add() {
		
				

		System.out.println("Sum of array numbers is "+ total);
		
	}
	public static void main(String args[])
	{
		int r[] = {1,2,3,4,5};
		Example sc = new Example(r);
		
		for(int g: sumArray) 
		{
			total +=g;
		}
		sc.add();		
		
	}

}
