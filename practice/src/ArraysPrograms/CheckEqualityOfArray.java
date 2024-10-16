package ArraysPrograms;

public class CheckEqualityOfArray {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int [] b= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		if (a.length!=b.length)
		{
			System.out.println("Array is not same length");
			return ;
		}
		boolean result=true;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=b[i])
			{
				result=false;
				break;
			}
		}
		if(result)
		{
			System.out.println("Arrays are same");
		}
		else
		{
			System.out.println("Arrays are not same");
		}
	
	}
}