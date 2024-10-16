package StringPrograms;

public class ReverseOnlyStringNotInteger {

	public static void main(String[] args) {
		String str="123abcd456efghi789jklmno0123";
		StringBuilder reverse=new StringBuilder();
		StringBuilder result=new StringBuilder();
		
		for(int i=0; i<str.length();i++)
		{
			char c=str.charAt(i);
			if (Character.isDigit(c))
			{
				result.append(c);
			}
			else
			{
				reverse.insert(0, c);
			}
			if(i<str.length()-1 && Character.isDigit(str.charAt(i+1)))
			{
				result.append(reverse);
				reverse.setLength(0);
			}
			
		}
		result.append(reverse);
		System.out.println(result);
	}

}
