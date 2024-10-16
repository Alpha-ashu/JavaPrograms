package IntPrograms;

import java.math.BigInteger;

public class RemoveAlphabets {

	public static void main(String[] args) {
		String str="12456Ashragfssdfknsdfgeg248942132";

		String result=str.replaceAll("[^0-9]", "");
		BigInteger num=new BigInteger(result); // Convert the resulting string to BigInteger for large numbers
		/*BigInteger is used instead of int or long to accommodate very large numbers.
		 *BigInteger can handle numbers of arbitrary size, so even if your numeric string is extremely large, it will not throw an exception.
		 */
		System.out.println(num);
	}
}
