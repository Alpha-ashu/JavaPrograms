package ArraysPrograms;

import java.util.Arrays;

public class Anagrams 
{
	public static void main(String[]args)
	{
		 String str1="listen";
		 String str2="silent";
		 
		 str1=str1.toLowerCase().replaceAll(" ", "");
		 str2=str2.toLowerCase().replaceAll(" ", "");
		 char[] a=str1.toCharArray();
		 char[] b=str2.toCharArray();
		 
		 Arrays.sort(a);
		 Arrays.sort(b);
		 boolean result=Arrays.equals(a, b);
		 System.out.println(result);
	}

}
