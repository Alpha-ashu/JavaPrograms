package StringPrograms;

public class ASCIIValueOfString {

	public static void main(String[] args) {
		String str="String";
		
		for(int i=0; i<str.length(); i++)
		{
			char c=str.charAt(i);
			System.out.println(c+": "+(int)c);
		}

	}

}
