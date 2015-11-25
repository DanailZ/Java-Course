import java.util.Scanner;


public class chetno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter fnumber");
		
		int a =sc.nextInt();
	
		boolean result = (a%2==0);
		
		System.out.println("Is this number even?"+result);
		
		

	}

}
