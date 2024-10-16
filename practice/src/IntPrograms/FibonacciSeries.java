package IntPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num=10;//User Input
		
		//template for print till user input 
		int a=0,b=1, c=0;
		System.out.print(a+" "+b);
		for(int i=2; i<=num; i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
		
		System.out.println();
		
		//template for print only true or false
		if(num==c)
		{
			System.out.println(num+" : "+"It is fibonacci series");
		}
		else
		{
			System.out.println(num+" : "+"Its not fibonacci series");
		}
		
		//template for print till value of user input
		while(c<=num)
		{
			c=a+b;
			if(c<=num) 
			{
			 System.out.print(" "+c);
			}
			a=b;
			b=c;
		}
		
	}

}
