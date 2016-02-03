
public class Mainnn {
   public static void main(String[]args){
	   Thread t1 = new MyNewThread();
	   Thread t2 = new MyNewThread2();
	   
	   t1.start();
	   t2.start();
	   
   }
}
