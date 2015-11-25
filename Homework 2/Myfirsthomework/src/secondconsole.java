import java.util.Scanner;

public class secondconsole {
	

	public static void main(String[] args) {
		Scanner circle =new Scanner(System.in);
	
		
	System.out.println("Enter the radious");
	int numInt1=circle.nextInt();
	System.out.println("Enter the diameter");
	int numInt2=circle.nextInt();
	System.out.println("Enter the Circumference");
	int numInt3=circle.nextInt();
	
	System.out.println("answer:"+((numInt1*numInt2*numInt3)));
	
	circle .close();
	
	
	
		
		
		

	}

}
