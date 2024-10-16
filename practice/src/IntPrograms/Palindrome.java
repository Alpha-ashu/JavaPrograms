package IntPrograms;

public class Palindrome {

	public static void main(String[] args) {
		int num=121;
		int rev=0, org=num;
		while(num!=0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if (rev==org)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("sorry the number is not palindrome");
		}
			

	}

}
