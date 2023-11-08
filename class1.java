package Fullrevision;

import java.util.ArrayList;
import java.util.List;

public class class1 {

	public List<Integer> findoutprime(List<Integer> li) {
		List<Integer> temp = new ArrayList<>();
		for (Integer l : li) {
			boolean isPrime = true;
			for (int i = 2; i < l; i++) {
				if (l % i == 0) {
					isPrime = false;
				}
			}
			if (isPrime == true) {
				temp.add(l);
			}
		}
		return temp;
	}
}
