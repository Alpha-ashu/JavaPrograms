package ArraysPrograms;

public class MinAndMax {

	public static void main(String[] args) {
		
		 int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13};
		 int len=num.length;
		 int min=num[0], max=num[0];
		 for(int i=0; i<len; i++)
		 {
			 if(num[i]<min)
			 {
				 min=num[i];
			 }
			 if(num[i]>max)
			 {
				 max=num[i];
			 }
			 
		 }
		 System.out.println(min+" "+max);

	}

}
