package CollectionsInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindMaxOccurringCharacter {

	public static void main(String[] args) 
	{
		String str="findMaxOccurringCharacter";
		str=str.toLowerCase();
		Map<Character, Integer> count=new LinkedHashMap<>();
		for(char c : str.toCharArray())
		{
			count.put(c, count.getOrDefault(c, 0)+1);
		}
		char ch=' ';
		int maxCount=0;
		
		for(Map.Entry<Character, Integer> entry : count.entrySet())
		{
			if(entry.getValue()>maxCount)
			{
				ch=entry.getKey();
				maxCount=entry.getValue();
			}
			
		}
		System.out.println(ch +":"+maxCount);

	}

}
