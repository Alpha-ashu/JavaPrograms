package StringPrograms;

public class ReverseTheWordButOrginalSpace {

	public static void main(String[] args) {
		String str = "Lets Reverse the sentence with same space";
		String words = str.replaceAll(" ", "");
		StringBuilder sb = new StringBuilder(words).reverse();
		StringBuilder result = new StringBuilder();
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == ' ') {
				result.append(" ");
			} else {
				result.append(sb.charAt(index));
				index++;
			}
		}
		System.out.println(result.toString().trim());
	}
}
