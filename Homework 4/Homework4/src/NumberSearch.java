import java.util.Scanner;

public class NumberSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = {7,23,4,6,9,4,1,2,3,55};
		System.out.println("enter  one of the numbers :" );
		int b = sc.nextInt();
	
		
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==b){
			System.out.print(i);
			}
		}
	}
}
			
			
	        
		
		
		
		
		
		
	
		
	
		
	


