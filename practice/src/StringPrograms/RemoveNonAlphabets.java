package StringPrograms;

public class RemoveNonAlphabets {

	public static void main(String[] args) {
		String str="12456Ashragfssdfknsdfgeg248942132";
		
		String num=str.replaceAll("[^a-zA-z]","");
		System.out.println(num);

	}

}
