package StringPrograms;

public class FindVowelsInString {

	public static void main(String[] args) {
		String str="im practicing java programing for interview";
		
		// Loop through the string to find and print all vowels with their respective indices
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ("aeiou".indexOf(c) != -1) {
                System.out.println(c + ": Index Of = " + i);
            }
		}

	}

}
