import java.util.Scanner;

public class SymetricMassive {

	public static void main(String[] args) {
		int[] array = new int[10];
		boolean a = false;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 10 numbers:");
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
			
		}
		for (int i = 0; i < array.length/2; i++) {
			if(array[i]==array[array.length-1-i]){
				a=true;
		}else if (array[i]!=array[array.length-1-i]){
			a=false;
		}
		System.out.println(a);
			
			
		}
		
		

	}

}
