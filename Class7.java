package Fullrevision;

public class Class7 {

	public static void main(String[] args) {
		String a = "programming";
		char[] vals = a.toCharArray();
		
		char temp = '$';
		for (int i = 0; i < vals.length; i++) {
			if (vals[i] == temp) {
				continue;
			}
			
			int individualcount = 0;
			for (int j = i+1; j < vals.length; j++) {
				if (vals[i] == vals[j]) {
					vals[j] = temp;
					individualcount++;
				}
			}
			
			if (individualcount > 0) {
				System.out.println(vals[i] + "-" + individualcount);
			}
		}
	}
}
