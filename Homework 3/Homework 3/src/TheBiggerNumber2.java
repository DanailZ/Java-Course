import java.util.Scanner;

public class TheBiggerNumber2 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		 

		

			sc = new Scanner (System.in);
			
			System.out.println("Enter the first number :");
			
			int a = sc.nextInt();
			System.out.println("Enter the second number :");
			
			int b = sc.nextInt();
			
			System.out.println("Enter the third nymber :");
			
			int c = sc.nextInt();
			
		if (a >b && a>c){
			System.out.println("This number is bigger :" + a);
		
		} else if (b > a && b > c ){
			System.out.println("This number is bigger:" + b);
			
		}else 
			System.out.println("This number is bigger :"+ c );
		}
		
		

		
		
				

	}


