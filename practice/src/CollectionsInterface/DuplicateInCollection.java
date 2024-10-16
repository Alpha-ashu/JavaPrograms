package CollectionsInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateInCollection {

	public static void main(String[] args) 
	{
		String[] str= {"shaik","shaik","ashraf","hazam","ashifa","chanbee","kalasha","kalasha"};
		
		Set<String> dup=new TreeSet<>();//We can use HashSet or TreeSet
		for(String word :str)
		{
			dup.add(word);
		}
		System.out.println(dup);
		
		int [] num= {1,2,3,4,1,2,5,3,4,2,8,7,6,9};
		
		Set<Integer> dupNum=new HashSet<>();//We can use HashSet or TreeSet
		for(int n :num)
		{
			dupNum.add(n);
		}
		System.out.println(dupNum);
		
		//Remove Duplicate from Sentence 
		String sentence="this is duplicate program";
		Set<Character> removeDupChar=new HashSet<>();
		for(char c : sentence.toCharArray())
		{
			removeDupChar.add(c);
		}
		System.out.println(removeDupChar);
		//Conversion from collection to String.
		StringBuilder sb=new StringBuilder();
		for(char c : removeDupChar)
		{
			sb.append(c);
		}
		System.out.println(sb.toString().trim());
		
		String st="k.shaik";
		st=st.replace(".", "");
		Set<Character> s=new LinkedHashSet<>();
		for(char c : st.toCharArray())
		{
			s.add(c);
			
		}
		System.out.println(s);
		StringBuilder result=new StringBuilder();
		for(char c: s)
		{
			result.append(c);
		}
		System.out.println(result);
	}

}
