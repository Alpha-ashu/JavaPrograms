package StreamsMethodsBasedPrograms;
import java.util.*;
import java.util.stream.Collectors;
public class DuplicateInStream {

	public static void main(String[] args) {
		String[] str= {"shaik","shaik","ashraf","hazam","ashifa","chanbee","kalasha","kalasha"};
		
		List<String> uniqueList=Arrays.stream(str)
				                      .distinct()
				                      .sorted()
				                      .collect(Collectors.toList());
		System.out.println(uniqueList);
		
		

	}

}
