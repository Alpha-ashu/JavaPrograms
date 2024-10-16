package StringPrograms;

public class SeparateIntegerAndString {

	public static void main(String[] args) {
		String str="abcdefg1234567hijklmnopq891011121314";
		StringBuilder string=new StringBuilder();
		StringBuilder number=new StringBuilder();

		for(int i=0; i<str.length();i++)
		{
			char c=str.charAt(i);
			if(Character.isLetter(c))
			{
				string.append(c);
			}
			if(Character.isDigit(c))
			{
				number.append(c);
			}
		}
		System.out.println(string+" "+number);
	}

}
