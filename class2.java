package Fullrevision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class class2 {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>(Arrays.asList(10, 12, 17, 19, 21, 34, 48, 55, 91, 99));
		for (Integer l : li) {
			boolean isprime = true;
			for (int i = 2; i < l; i++) {
				if (l % i == 0) {
					isprime = false;
				}
			}
			if (isprime == true) {
				System.out.println(l + "is prime number");
			} else {
				System.out.println(l + "is not prime number");
			}
		}
	}

}
