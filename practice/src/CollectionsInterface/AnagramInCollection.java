package CollectionsInterface;

import java.util.*;

public class AnagramInCollection {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		Map<Character, Integer> aMap = new HashMap<>();

		for (char c : str1.toCharArray()) {
			aMap.put(c, aMap.getOrDefault(c, 0) + 1);
		}

		Map<Character, Integer> bMap = new HashMap<>();

		for (char c : str2.toCharArray()) {
			bMap.put(c, bMap.getOrDefault(c, 0) + 1);
		}
		
		if(aMap.equals(bMap))
		{
			System.out.println("Yes Its is Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}

	}

}
