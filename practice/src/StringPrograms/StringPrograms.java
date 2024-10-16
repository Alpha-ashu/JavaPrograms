package StringPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class StringPrograms {
	public static void main(String[] Args)

	{
		// String to analyze
		String str1 = "helloimshaikashraf";

		// Checking if the string is a palindrome
		isPalindrome(str1);

		// String Anagram check between two strings
		String str2 = "Silent";
		String str3 = "Listen";
		boolean result = areAnagrams(str2, str3);
		System.out.println(str2 + " and " + str3 + " are anagrams: " + result);

		// Removing duplicate words from a list of strings
		String[] words = { "apple", "banana", "apple", "orange", "pineapple", "banana", "orange" };
		removeDuplicateWords(words);
	}

	// Q1: How do you check if a given string is a palindrome?
	public static void isPalindrome(String str1) {
		// Convert string to lowercase
		str1 = str1.toLowerCase();
		String reversed = new StringBuilder(str1).reverse().toString();

		if (str1.equals(reversed)) {
			System.out.println(str1 + " is a Palindrome");
		} else {
			System.out.println(str1 + " is not a Palindrome");
		}
	}

	// Q2: How do you count vowels, consonants, spaces, numbers, and special
	// characters in a string?
	public static void countCharactersInString(String str1) {
		int vowelsCount = 0;
		int consonantsCount = 0;
		int spacesCount = 0;
		int digitsCount = 0;
		int specialCharCount = 0;

		str1 = str1.toLowerCase();

		for (char c : str1.toCharArray()) {
			if ("aeiou".indexOf(c) != -1) {
				vowelsCount++;
			} else if (Character.isDigit(c)) {
				digitsCount++;
			} else if (Character.isSpaceChar(c)) {
				spacesCount++;
			} else if (Character.isLetter(c)) {
				consonantsCount++;
			} else {
				specialCharCount++;
			}
		}

		System.out.println("Vowels: " + vowelsCount);
		System.out.println("Consonants: " + consonantsCount);
		System.out.println("Spaces: " + spacesCount);
		System.out.println("Digits: " + digitsCount);
		System.out.println("Special Characters: " + specialCharCount);
	}

	// Q3: How do you find the ASCII value of characters in a string?
	public static void printAsciiValues(String str1) {
		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			System.out.println("ASCII value of " + c + " is: " + (int) c);
		}
	}

	// Q4: How do you remove non-alphabetic characters from a string?
	public static void removeNonAlphabets(String str1) {
		String result = str1.replaceAll("[^a-zA-Z]", "");
		System.out.println("Original String: " + str1);
		System.out.println("Alphabets Only: " + result);
	}

	// Q5: How do you reverse a string?
	public static void reverseString(String str1) {
		String reversed = new StringBuilder(str1).reverse().toString();
		System.out.println("Reversed String: " + reversed);
	}

	// Q6: How do you sum all the digits in a string?
	public static void sumDigitsInString(String str1) {
		int sum = 0;
		for (char c : str1.toCharArray()) {
			if (Character.isDigit(c)) {
				sum += Character.getNumericValue(c);
			}
		}
		System.out.println("Sum of Digits: " + sum);
	}

	// Q7: How do you capitalize the first and last letter of a string?
	public static void capitalizeFirstAndLastLetter(String str1) {
		int len = str1.length();
		String capitalized = str1.substring(0, 1).toUpperCase() + str1.substring(1, len - 1).toLowerCase()
				+ str1.substring(len - 1).toUpperCase();
		System.out.println("Formatted String: " + capitalized);
	}

	// Q8: How do you count the occurrences of each character in a string?
	public static void countCharacterOccurrences(String str1) {
		Map<Character, Integer> charCount = new HashMap<>();

		for (char c : str1.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			System.out.println("Character: " + entry.getKey() + ", Occurrences: " + entry.getValue());
		}
	}

	// Q9: How do you find the first non-repeating character in a string?
	public static void findFirstNonRepeatingCharacter(String str1) {
		Map<Character, Integer> charCount = new HashMap<>();

		for (char c : str1.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}

		for (char c : str1.toCharArray()) {
			if (charCount.get(c) == 1) {
				System.out.println("First Non-Repeating Character: " + c);
				return;
			}
		}

		System.out.println("No Non-Repeating Character Found.");
	}

	// Q10: How do you check if two strings are anagrams?
	public static boolean areAnagrams(String str2, String str3) {
		// if (str1.length() != str2.length())
		// {
		// return false;
		// }
		// if if (str1.length() == str2.length())
		// {
		// char[] arr1 = str1.toLowerCase().toCharArray();
		// char[] arr2 = str2.toLowerCase().toCharArray();

		// Arrays.sort(arr1);
		// Arrays.sort(arr2);

		// return Arrays.equals(arr1, arr2);
		// }
		str2 = str2.toLowerCase();
		str3 = str3.toLowerCase();
		HashMap<Character, Integer> countWord = new HashMap<>();
		for (char c : str2.toCharArray()) {
			countWord.put(c, countWord.getOrDefault(c, 0) + 1);
		}
		for (char c : str3.toCharArray()) {
			if (!countWord.containsKey(c)) {
				return false;
			}
			countWord.put(c, countWord.get(c) - 1);
		}

		for (int count : countWord.values()) {
			if (count != 0) {
				return false;
			}
		}
		return true;
	}

	// Q11: How do you find the character with the maximum occurrences in a string?
	public static void findMaxOccurringCharacter(String str1) {
		Map<Character, Integer> charCount = new HashMap<>();

		for (char c : str1.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}

		char maxChar = ' ';
		int maxCount = 0;

		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxChar = entry.getKey();
				maxCount = entry.getValue();
			}
		}

		System.out.println("Max Occurring Character: " + maxChar + " with " + maxCount + " occurrences");
	}

	// Q12: How do you remove duplicate words from an array of strings?
	public static void removeDuplicateWords(String[] words) {
		Set<String> uniqueWords = new HashSet<>();
		Set<String> duplicate = new TreeSet<>();
		for (String word : words) {
			if (!uniqueWords.add(word)) {
				duplicate.add(word);
			}
		}
		System.out.println(duplicate);

	}
}