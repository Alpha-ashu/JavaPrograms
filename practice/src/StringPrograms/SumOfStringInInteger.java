package StringPrograms;

public class SumOfStringInInteger {

	public static void main(String[] args) {
		String str="123456789";
		int sum=0;
		for(char c : str.toCharArray())
		{
			if(Character.isDigit(c))
			{
				sum=sum+Character.getNumericValue(c);
			}
		}
		System.out.println(sum);

	}

}
