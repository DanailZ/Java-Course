import java.util.Scanner;

public class BiggestNumberFrom5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the furst number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("Enter the third number");
		int c = sc.nextInt();
		System.out.println("Enter the forth number");
		int d = sc.nextInt();
		System.out.println("Enter the fifth number");
		int e =sc.nextInt();
		
		if(a >b&& a>c && a>d && a>e){
			System.out.println("The biggest number is:"+a);
		}else if (b>a && b>c && b>d && b >e){
			System.out.println("The biggest number is:"+b);
		}else if(c>a && c>b && c>d && c>e){
			System.out.println("The buggest number is :"+c);
		}else if (d > a && d>b && d>c && d>e){
			System.out.println("The biggest number is:"+d);
		}else{
			System.out.println("Your biggest number is:"+e);
			
		}
         sc.close();
	}

}
