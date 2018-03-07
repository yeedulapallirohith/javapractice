import java.util.Scanner; //importing scanner class

class Fib2
{
  int n1,n2,n3,z;  
  
  Fib2(int n)  //constructor
  {    
      z = n;
      n1=0;
      n2=1;
  }    
  
  void count()
  {
      System.out.println("The Fibonacci Series till "+ z +" are:");
      System.out.print(n1+" "+n2+" ");
      int i;
      for(i=3;i<=z;i++)
      {
          n3=n1+n2; //the next number will be the sum of two of the preceeding number
          System.out.print(n3+" ");
          n1=n2; //The value in the first position will be moved to value of second position
          n2=n3; //The value of second postion will be moved to third position when compared to preceeding values
      }
  }
}

class MainFib
{
  public static void main(String args[])
  {
      Scanner input = new Scanner(System.in); 
      System.out.println("Enter the max limit position");
      int n = input.nextInt();
      Fib2 abc= new Fib2(n);
      abc.count();
  }    
}