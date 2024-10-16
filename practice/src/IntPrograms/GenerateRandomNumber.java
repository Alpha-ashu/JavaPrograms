package IntPrograms;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		Random num=new Random();
		//nextInt
		//nextLong
		//nextDouble
		//nextBoolean
		//double n=num.nextExponential();
		long numbers=num.nextLong(12345678910L);
		System.out.println(numbers);
		

	}

}
