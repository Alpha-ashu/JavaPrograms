package StringPrograms;

public class FindFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "First Non-Repeating Character";
		boolean nonRepeating = true;
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				char b = str.charAt(j);
				if (i != j && a == b) {
					nonRepeating = false;
					break;
				}
			}
			if (nonRepeating) {
				System.out.println(a);
			}
		}

	}

}
