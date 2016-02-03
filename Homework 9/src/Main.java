import java.util.*;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Integer> namesMap = new HashMap<String, Integer>();

		String[] words = { "yes", "hello", "black", "red",
					       "word", "no", "red", "zebra",
					       "yes", "network", "red","rabbit",
					       "red", "network", "programming", 
					       "red", "word", "red" 
		};

		List<String> list = new ArrayList<String>();

		
		for (int i = 0; i < words.length; i++) {
			if (namesMap.containsKey(words[i])) {
				Integer count = namesMap.get(words[i]);
				namesMap.put(words[i], ++count);
			} else {
				namesMap.put(words[i], 1);
				list.add(words[i]);
			}
		}
		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i) + ":" + namesMap.get(list.get(i)));

		}
	}

}
