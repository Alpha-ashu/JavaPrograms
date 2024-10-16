package ArraysPrograms;

public class SortInteger {

	public static void main(String[] args) 
	{
		int num[]= {9,2,5,8,6,7,1,3,4,8,2,5,10,20,28,3,4,66,100};
		
		for(int i=0; i<num.length; i++)
		{
			for(int j=i+1; j<num.length;j++)
			{
				if(num[i]>num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
			for(int i=0; i<num.length; i++)
			{
				System.out.print(num[i]+" ");
			}
		}
		
	}

