import java.util.Scanner;

public class boolev {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
	
	     System.out.println("Enter the number");
	     int a = sc.nextInt();
		
		boolean result =(a%35 == 0);
		System.out.println("The result is: " + result);
		
	}

}
