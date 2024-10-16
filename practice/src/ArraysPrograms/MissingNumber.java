package ArraysPrograms;

public class MissingNumber {

	public static void main(String[] args) {

		int num[] = { 1, 2, 3,4, 5, 6, 7, 8,9, 12, 13 };
		int actual=0, expected=0, missing=0;
		
		int len=num.length;
		int last=num[len-1];
		
		for(int i=0; i<len; i++)
		{
			actual+=num[i];
		}
		expected=last*(last+1)/2;
		missing=expected-actual;
		
		// Output the results
        System.out.println("Sum of array: " + actual);
        System.out.println("Expected sum: " + expected);
        System.out.println("The missing number is: " + missing);
		
        
        //If interview ask for find two missing in array
		if(missing>last)
		{
			System.out.println("Two numbers are missing");
			int midpoint=missing/2;
			
			int actualLow=0, expectedLow=midpoint*(midpoint+1)/2;
			
			for(int i=0; i<len; i++)
			{
				if(num[i]<=midpoint)
				actualLow+=num[i];
			}
			int firstMissing=expectedLow-actualLow;
			int secondMissing=missing-firstMissing;
			System.out.println("First Missing Number: "+firstMissing);
			System.out.println("Second Missing Number: "+secondMissing);
		}
	}

}
