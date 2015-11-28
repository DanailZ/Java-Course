import java.util.Scanner;


public class Pow {

	public static void main(String[] args) {
    
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number");
		int N = sc.nextInt();
		 System.out.println("Enter the second number" );
		 		int M= sc.nextInt();
		 		
		  int c = 1;
		  
		  for(int i = 0 ; i<M;i++){
			  c=c*N;
			  
		  }
		 		System.out.println("The result is :"+c);
		 		
		sc.close();
	}
                
}
