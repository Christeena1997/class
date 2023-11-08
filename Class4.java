package Fullrevision;

public class Class4 {
	public String findcountval(String a) {
		int individulcount = 0;
		char temp = '$';
		char[] vals = a.toCharArray();
		String result=" ";
		for (int i = 0; i < vals.length; i++) {
			if (vals[i] == temp) {
				continue;
			}
			for (int j = i + 1; j < vals.length; j++) {
				if (vals[i] == vals[j]) {
					vals[j] = temp;
					individulcount++;
				}
			}

			if (individulcount > 0) {
			result = vals[i] + "-" + individulcount;
			}
			
		}
return result;
	
	}
}
