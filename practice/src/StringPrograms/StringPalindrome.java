package StringPrograms;

public class StringPalindrome {

	public static void main(String[] args) {
		String str="Madam";
		String rev="";
		str=str.toLowerCase();
		for(int i=str.length()-1; i>=0; i--)
		{
			char c=str.charAt(i);
			rev+=c;
		}
		if(str.equals(rev))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}

	}

}
