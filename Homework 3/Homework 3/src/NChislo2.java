import java.util.Scanner;

public class NChislo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int N = sc.nextInt();
		
		
		for(int i = 1;i<=N;i++){
			
			{
				if(i%3 !=0 && i%7 !=0){
					System.out.println(i);
				}
			}
		
sc.close();
	}

	}}
