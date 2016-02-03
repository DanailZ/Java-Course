
public class MyNewThread2 extends Thread{
	public void run() {
		for (int i = 500000;i >=0; i--) {
		 
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
				
			
			
		}
	}
	

}
