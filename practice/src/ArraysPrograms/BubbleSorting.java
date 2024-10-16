package ArraysPrograms;

public class BubbleSorting {

	public static void main(String[] args) {
		// Sorting based on length of the string
		String str[] = { "apple", "banana", "grape", "orange", "pineapple", "watermelon", "apple", "grape" };

		int len = str.length;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (str[i].length() > str[j].length()) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		for(int i=0; i<len; i++)
		{
			System.out.print(str[i]+" ");
		}
	}

}
