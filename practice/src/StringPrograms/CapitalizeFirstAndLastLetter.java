package StringPrograms;

public class CapitalizeFirstAndLastLetter {

	public static void main(String[] args) {
		String str="samsung galaxy";
		
		int last=str.length()-1;
		
		String result=str.substring(0,1).toUpperCase()+str.subSequence(1, last)+str.substring(last).toUpperCase();
		System.out.println(result);

	}

}
