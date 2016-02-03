
public class ThreadOne implements Runnable{
	public String name;
	public ThreadOne() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("The thread is started!");
		setName(name);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The thread is complete!");
	}
	

	

}
