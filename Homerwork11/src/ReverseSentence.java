import java.util.Scanner;
import java.util.Stack;

public class ReverseSentence {

	public static void main(String[] args) {
		
		System.out.println("Enter a sentence:");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		String[] word = sentence.split(" ");
		Stack<String> stack = new Stack<String>();
		
		for (int i = 0; i < word.length; i++) {
			stack.push(word[i]);
		}
		
		while(!stack.isEmpty()){
			String word2 = stack.pop();
			System.out.print(word2 + " ");
		}
		sc.close();

	}

}
