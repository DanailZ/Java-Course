import java .util.Scanner;

public class MaxNumber {
	static Scanner sc = new Scanner(System.in);
	public static void maxNumber(int a , int b,int c , int d ){
	
	
		if(a>b){
			System.out.println("the biugger number:"+a);
		
		}else{
			System.out.println("The bigger number is :"+b);
			
		}
		System.out.println("The numbers from the console:");
		
		if (c>d){
			System.out.println("The bigger console number is:"+ c);
			
		}else{
			System.out.println("The bigger console number is:"+d);
			
		}		
	}
	public static void main(String[]args){
		System.out.println("Add numbers from the console:");
		
		System.out.println(" Enter the number:");
		int a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		System.out.println("Enter the third number:");
		int c = sc.nextInt();
		System.out.println("Enter the last number:");
		int d = sc.nextInt();
	
	
		maxNumber(a, b, c, d);
	}
}


		
	