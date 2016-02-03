import java.util.*;

public class Cards {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
			    //KEY   VALUE
		
		String[] cardsArray = { "J", "A", "A", "A", "A" };

		for (int i = 0; i < cardsArray.length; i++) {
			String card = cardsArray[i];

			if (map.containsKey(card)) {
				int value = map.get(card);
				map.put(card, ++value);
			} else {
				map.put(card, 1);
			}
		}
		if (map.containsValue(2)) {
			System.out.println("Чифт");
		} else if (map.containsValue(3)) {
			System.out.println("Сет");
		} else if (map.containsValue(4)) {
			System.out.println("Каре");
		} else {
			System.out.println("Висока карта");
		}
	}
}
