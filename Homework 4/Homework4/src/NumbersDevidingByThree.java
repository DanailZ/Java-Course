import java.util.Scanner;

public class NumbersDevidingByThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  first number:");
		int a = sc.nextInt();
		System.out.println("Enter the  second number:");
		int b = sc.nextInt();
		int[] c = new int[b - a + 1];

		for (int i = 0; i < c.length; i++) {
			c[i] = a;
			a++;
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i] % 3 == 0) {
				System.out.println(c[i]);
			}

		}
	}
}
	

	