package StringPrograms;

public class FindAndCount {

	public static void main(String[] args) {
		String str="USD50,USD50,USD50,USD50,USD50";
		
		String []words=str.split(",");
		int count=0;

		for(String word : words)
		{
			if(word.contains("50"))
			{
				count++;
			}
		}
		System.out.println(count);
	
	}

}
