import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StringOfNumbers {

	public static void main(String[] args) {

		System.out.println("Enter a math expression:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		Stack<Character> stack = new Stack<Character>();
		Queue<Character> queue = new LinkedList<Character>();

		if (checkNumbersOperators(str) == true && checkStartEnd(str) == true) {
			char[] ch = str.toCharArray();

			for (int i = 0; i < ch.length; i++) {
				if (Character.isDigit(ch[i])) {
					queue.offer(ch[i]);
				} else {
					stack.push(ch[i]);
				}
			}

			System.out.println("The queue with the numbers:");
			while (!queue.isEmpty()) {
				char ch1 = queue.poll();
				System.out.print(ch1 + " ");
			}
			
			System.out.println();
			System.out.println("The stack with operators:");
			while (!stack.isEmpty()) {
				char ch1 = stack.pop();
				System.out.print(ch1 + " ");
			}
			System.out.println();
			
            while(!queue.isEmpty() && !stack.isEmpty()){
			int result = sumSub(queue.poll(), queue.poll(), stack.pop());
			queue.offer((char) result);
			System.out.println(result);
            }

			System.out.println("The final queue after operations is:");
			while (!queue.isEmpty()) {
				char ch1 = queue.poll();
				System.out.print(ch1 + " ");
			}

		} else {
			System.out.println("Invalid expression.");

		}
		sc.close();

	}

	private static boolean checkNumbersOperators(String text) {
		char[] ch = text.toCharArray();
		boolean check = false;

		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i]) || ch[i] == '+' || ch[i] == '-') {
				check = true;
			} else {
				check = false;
			}
		}
		return check;
	}

	private static boolean checkStartEnd(String text) {
		char[] ch = text.toCharArray();
		boolean check = false;

		if (Character.isDigit(ch[0]) && Character.isDigit(ch[ch.length - 1])) {
			check = true;
		} else {
			check = false;
		}
		return check;
	}

	public static int sumSub(char num1, char num2, char operator) {
		int number1 = Character.getNumericValue(num1);
		int number2 = Character.getNumericValue(num2);
		int result = 0;

		if (operator == '+') {
			result = number1 + number2;
		} else if (operator == '-') {
			result = number1 - number2;
		}
		return result;
	}

}
