import java.util.Scanner;

public class EvenOrOdd {
static Scanner sc = new Scanner(System.in);

public static void EvenOrOddNumber(int a ){
	if(a>=0&&a%2 ==0){
		System.out.println("Your number is Even");
	}else{
	System.out.println("Your number is Odd");
	}
	
}
 public static void main(String[]args){
	 System.out.println("Enter the number:");
		int a = sc.nextInt();
		EvenOrOddNumber(a);
	 
 }

}
