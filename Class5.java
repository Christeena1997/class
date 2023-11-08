package Fullrevision;

public class Class5 {
	public int fintcountnum(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1 + i; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
		}
		return count;

	}
}
