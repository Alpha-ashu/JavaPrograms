package StringPrograms;

public class ReverseAString {

	public static void main(String[] args)
	{
		String str="Programming";
		
		StringBuilder rev=new StringBuilder(str).reverse();
		System.out.println(rev);
		
		//for Loop
		int len=str.length();
		String rev1="";
		for(int i=len-1;i>=0;i--)
		{
			char c=str.charAt(i);
			rev1+=c;
		}
		System.out.println(rev1);
	}

}
