import java.util.Scanner;

public class minusplus {

	public static void main(String[] args) {



		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the first number:");
		double a = sc.nextDouble();
		System.out.println("Enter the second number:");
		
		double b = sc.nextDouble();
		
		if ((a/b) > 0){
		}else
			System.out.println("minus -.");
		
		System.out.println("plus +.");
		
		sc.close();
		
		}
	}


