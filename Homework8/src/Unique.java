import java.util.*;

public class Unique {

	private static String text = "A role-playing game (RPG and sometimes roleplaying game )"
			+ "is a game in which players assume the roles of characters in a fictional setting."
			+ "Players take responsibility for acting out these roles within a narrative, either through literal acting"
			+ "or through a process of structured decision-making or character development."
			+ "Actions taken within many games succeed or fail according to a formal system of rules and guidelines.";

	private static LinkedList<String> list = new LinkedList<String>();
	private static LinkedList<String> replist = new LinkedList<String>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(text);
		String word;
		while (sc.hasNext()) {
			word = sc.next();

			if (!(list.contains(word))) {
				list.add(word);
			} else {
				replist.add(word);

			}
		}
			for (int i = 0; i < replist.size(); i++) {
				list.remove(replist.get(i));

			}
			System.out.println(list);

	}
}
