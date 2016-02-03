
public class MyNewThread extends Thread{
	
	 public void run() {
		 
	
		for (int i = 0; i < 1000000; i++) {
		try{
			Thread.sleep(500);
			
			
		}catch (Exception e ){
			e.printStackTrace();
		}
		System.out.print("z");
	}
	 

}
}
