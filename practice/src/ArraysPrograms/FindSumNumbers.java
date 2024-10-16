package ArraysPrograms;

public class FindSumNumbers {

	public static void main(String[] args) {
		int [] num= {1,2,3,4,5,6,7,8,9};
		
		for(int i=0; i<num.length; i++)
		{
			for(int j=0; j<num.length; j++)
			{
				if(num[i]+num[j]==5)
				{
					System.out.println(num[i]+" + "+num[j]+" = 10 ");
				}
			}
		}

	}

}
