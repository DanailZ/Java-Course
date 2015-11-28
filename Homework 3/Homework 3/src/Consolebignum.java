import java.util.Scanner;

public class Consolebignum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int min = 50;
		int max= 0;
		for(int i=0 ;i<5;i++){
			System.out.println("Enter the number");
			int a = sc.nextInt();
			
			if(a>max){
				max = a;
				
			}
			if (a<min){
				min = a;
				
			}
		}
			System.out.println("The biggest number is:"+ max);
			System.out.println("The lowest number is:"+ min);
			
			sc.close();
		

	}

}
