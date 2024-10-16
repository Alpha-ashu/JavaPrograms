package CollectionsInterface;
import java.util.Map;
import java.util.stream.*;
public class CountCharStream {

	public static void main(String[] args) {
		String str="Im Shaik Ashraf";
		
		str=str.toLowerCase().replace(" ", "");
		
		
		Map<Character, Long> charCount=str.chars()
				                          .mapToObj(c-> (char)c)
				                          .collect(Collectors.groupingBy(c->c,Collectors.counting()));
		charCount.forEach((character,count)->System.out.println(character +": "+ count));
	}

}
