import java.*;
public class MyThread {
	
	
	public static void main(String[]args){
		Thread thread = new Thread(new ThreadOne());
		thread.setName("Koche");
		thread.start();
	}
	

}
