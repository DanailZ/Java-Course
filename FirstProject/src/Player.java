import java. util.*;
import java. util.Scanner;
public class Player {
	
		
		String player ;
		long egn ;
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		

		public Player() {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter EGN");
			
			this.egn = input.nextLong();
			for (int i = 1; i <= 5; i++) {
				System.out.println("Enter number");
				numbers.add(input.nextInt());
				
			}
			input.close();
		}

		public long getEgn() {
			return egn;
		}

		public void setEgn(long egn) {
			this.egn = egn;
		}

		public ArrayList<Integer> getNumbers() {
			return numbers;
		}

		public void setNumbers(ArrayList<Integer> numbers) {
			this.numbers = numbers;
		}
	    
		
	}
	
	

