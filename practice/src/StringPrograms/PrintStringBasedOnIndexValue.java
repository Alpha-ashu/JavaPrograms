package StringPrograms;

public class PrintStringBasedOnIndexValue {

	public static void main(String[] args) {
		String str = "demo";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			for (int j = 0; j <= i; j++) {
				System.out.print(c);
			}
		}

	}

}
