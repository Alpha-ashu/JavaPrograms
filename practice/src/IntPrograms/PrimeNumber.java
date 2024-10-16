package IntPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=5;
		boolean isPrime=true;
		
		for(int i=2; i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println("Its Prime Number");
		}
		else
		{
			System.out.println("Its Not Prime Number");
		}
	}

}
