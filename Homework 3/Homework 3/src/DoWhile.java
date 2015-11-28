import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int sum  =0;
		do{
		System.out.println("Enter the number");
		a=sc.nextInt();
		sum +=a;
		}
		while (a!=0);
		System.out.println("your number is:"+sum);
	  sc.close();
	}
		


	}


