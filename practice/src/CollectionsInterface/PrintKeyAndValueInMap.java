package CollectionsInterface;

import java.util.Map;
import java.util.TreeMap;

public class PrintKeyAndValueInMap {

	public static void main(String[] args) {
		Map<Integer,String> friends=new TreeMap<>();
		friends.put(1,"ashraf");
		friends.put(2,"arun");
		friends.put(3,"jijo");
		friends.put(4,"prigith");
		friends.put(5,"preethi");
		
		for(Map.Entry<Integer,String> entry: friends.entrySet())
		{
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}

}
