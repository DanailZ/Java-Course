import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     
     System.out.println("Enter N");
     int N = sc.nextInt();
     System.out.println("Enter K");
     int K = sc.nextInt();
     
     int factorial=1;
     int factorial2=1;
     int factorial3=1;
     
     
	
	for(int i=1;i<=N;i++){
		factorial*=i;
		
	}
		for(int i =1 ; i <= K;i++){
			factorial2*=i;
			
			
		}
		for(int i =1 ; i <= (N-K);i++){
			factorial3*=i;
			
		}
		
		int result = ((factorial * factorial2)/(factorial3));
		System.out.println("your result: "+ result);
           sc.close();		
	}

}
