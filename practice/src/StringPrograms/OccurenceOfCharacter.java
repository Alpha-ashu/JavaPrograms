package StringPrograms;

public class OccurenceOfCharacter {

	public static void main(String[] args) {
		String str="im shaik ashraf";
		
		int []count=new int[256]; 
	
		for(int i=0; i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c !=' ')
			{
				count[c]++;
			}
		}
		for(int i=0; i<count.length;i++)
		{
			if(count[i]>0)
			{
				System.out.println((char)i+": "+count[i]);
			}
		}
	}
}
