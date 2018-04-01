public class TestThread {

   public static void main(String args[]) {
      ThreadEx T1 = new ThreadEx( "Thread-1");
      T1.start();
      
      ThreadEx T2 = new ThreadEx( "Thread-2");
      T2.start();
   }   
}