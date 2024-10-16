package StringPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class SortTheStringBasedOnLength {

	public static void main(String[] args) 
	{
		String str="https github.com Alpha-ashu JavaPrograms upload";
		String [] words=str.split(" ");
		
		Arrays.sort
		(words, new Comparator<String>()
		{ public int compare(String s1, String s2)
			{ return s1.length()-s2.length(); }
		});
		for(String word: words)
		{
			System.out.print(word+" ");
		}
	}

}
