package ArraysPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenOrODD {

	public static void main(String[] args) {
		int[] num = { 1, 10, 25, 30, 40, 48, 21, 22, 28, 19, 55 };
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		for (int n : num) {
			if (n % 2 == 0) {

				even.add(n);
			} else {
				odd.add(n);
			}
		}
		Collections.sort(even);
		Collections.sort(odd);
		System.out.println(even);
		System.out.println(odd);
	}

}
