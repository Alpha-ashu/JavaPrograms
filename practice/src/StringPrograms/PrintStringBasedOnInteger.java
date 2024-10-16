package StringPrograms;

public class PrintStringBasedOnInteger {

	public static void main(String[] args) {
		String str = "a1b2c3d4e5f6g7h8i9";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isLetter(c) && i + 1 < str.length()) {
				int count = Character.getNumericValue(str.charAt(i+1));
				for (int j = 0; j < count; j++) {
					System.out.print(c);
				}
			}
		}
	}
}
