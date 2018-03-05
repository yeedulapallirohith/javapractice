class prime{
	public static void main(String args[]) {
		int max=180;
		for(int i=2;i<max;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(j==i)
				{
					System.out.println(i);
				}
				if(i%j==0)
				{
					break;
				}
			}
		}
		
	}	
}

			
			
			
