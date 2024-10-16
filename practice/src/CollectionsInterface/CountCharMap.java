package CollectionsInterface;

import java.util.*;

public class CountCharMap {

	public static void main(String[] args) {
		
		String str="Im, Shaik Ashraf";
		str=str.toLowerCase().replace(" ", "").replace(",","");
		
		Map <Character,Integer> countChar=new TreeMap<>();
		
		for(char c : str.toCharArray())
		{
			countChar.put(c, countChar.getOrDefault(c,0)+1);
		}
		System.out.print(countChar);

	}

}
