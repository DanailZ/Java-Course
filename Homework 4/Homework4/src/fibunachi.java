import java. util.Scanner;

public class fibunachi {



	public static void main(String[] args) {
	 
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the numbers" );
		int sc = scanner.nextInt();
		int[] fibonaci = new int[sc];
		int a,b,c;
		 a= 1;
		 b =2;
		 
	     for (int i = 0; i < sc; i++) {
		   
			c = a+ b ;
			fibonaci[i]=c;
			System.out.println(fibonaci[i]);
			a=b;b=c;
		}		
		   
		}
	
	}


