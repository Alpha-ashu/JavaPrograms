package IntPrograms;

public class CountInteger {

	public static void main(String[] args) 
	{
		long num =12345678901124533L;
		
		String numb=String.valueOf(num);
		int len=numb.length();
		System.out.println("Simple String conversion methods : "+len);
		
		//Approch 2
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Count the number by iterating : "+count);
		
		
	}

}
