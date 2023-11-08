package Fullrevision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseClass1 {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>(Arrays.asList(10, 12, 17, 19, 21, 34, 48, 55, 91, 99));
		class1 f = new class1();
		System.out.println(f.findoutprime(li));

	}

}
