package StringPrograms;

public class CountUpperAndLowerOfString {

	public static void main(String[] args) {
		String str="This is Shaik Ashraf";
		
		//Find the Character of String is UpperCase or LowerCase
		int upCount=0, lowCount=0;
		for (char c : str.toCharArray())
		{
			if(Character.isUpperCase(c))
			{
				upCount++;
			}
			if(Character.isLowerCase(c))
			{
				lowCount++;
			}
		}
		System.out.println("Uppercase Letter: "+upCount);
		System.out.println("Lowercase Letter: "+lowCount);

	}

}
