package CollectionsInterface;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "First Non-Repeating Character";

		Map<Character, Integer> non = new HashMap<>();
		for (char c : str.toCharArray()) {
			non.put(c, non.getOrDefault(c, 0) + 1);
		}
		for (char c : str.toCharArray()) {
			if (non.get(c) == 1) {
				System.out.println(c);
				return;
			}
		}
	}

}
