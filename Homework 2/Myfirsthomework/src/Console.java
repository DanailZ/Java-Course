	import java.util.Scanner;
	
public class Console {


	public static void main(String[] args) {
		Scanner konzola = new Scanner(System.in);
		
		
		
		 
		 System.out.println("Enter the first number");
		 int numInt1=konzola.nextInt();
		 System.out.println("Enter the second number");
		 int numInt2=konzola.nextInt();
		 System.out.println("Enter the third number");
		 int numInt3=konzola.nextInt();
		 System.out.println("Enter the forth number");
		 int numInt4=konzola.nextInt();
		 
		 System.out.println("answer:" +((numInt1+numInt2+numInt3+numInt4)));
		 
		 
		
		 
		 
		 konzola.close();
		 
		 
		 }

}
