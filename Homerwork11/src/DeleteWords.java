import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DeleteWords {

	public static void main(String[] args) {
		
		System.out.println("Enter a sentence:");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		String[] word = sentence.split(" ");
		Queue<String> queue = new LinkedList<String>();
		
		for (int i = 0; i < word.length; i++) {
			if(word[i].length()>3){
				queue.offer(word[i]);
			}
		}
		
		while(!queue.isEmpty()){
			String word2 = queue.poll();
			System.out.print(word2 + " ");
		}
		sc.close();

	}

}