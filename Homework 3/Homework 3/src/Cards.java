
import java.util.Scanner;

public class Cards {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the card");

		String card = sc.nextLine();

		switch (card) {

		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "10":
		case "J":
		case "Q":
		case "K":
		case "A":
			System.out.println("your cards are valid");
			break;
		default:
			System.out.println("Invalid card");
		}

		sc.close();
	}
}
