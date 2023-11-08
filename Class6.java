package Fullrevision;

public class Class6 {
	public char findvalue(String a) {
		char temp = 0;
		char[] ch = a.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					temp = ch[i];
				}
			}
		}
		return temp;
	}
}
