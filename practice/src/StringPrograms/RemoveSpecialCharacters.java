package StringPrograms;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String str="hello23424 w2423orls4234@%%&&&&&sha*&%ik a{}><?:#@#*)(!@()!_!shraf";
		
		str=str.replaceAll("[^a-zA-Z]"," ").replaceAll(" ", "").trim();
		
		System.out.println(str);
				
	}

}
