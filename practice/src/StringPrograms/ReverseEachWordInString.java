package StringPrograms;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String str="Java Interview practice";
		String [] words=str.split(" ");
		String rev="";
		
		for(String word : words)
		{
			int len=word.length();
			String reversed="";
			for(int i=len-1;i>=0;i--)
			{
				char c=word.charAt(i);
				reversed+=c;
			}
			rev+=reversed+" ";
		}
		System.out.println(rev);
	}
}
