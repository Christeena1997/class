package Fullrevision;

public class Class3 {

	public static void main(String[] args) {

//	String a="2013";
//		String[] b=a.split("");
//		int c=Integer.parseInt(b[0]);
//		int d=Integer.parseInt(b[1]);
//		int e=Integer.parseInt(b[2]);
//		int f=Integer.parseInt(b[3]);
//		System.out.println(c+d+e+f);

		int a = 2356;

		int total = 0;
		int remainder = 0;
		for (; a> 0;) {
			remainder = a % 10;
					total =total+remainder;
			a = a/ 10;
		}
System.out.print(total);
		
}
		// Amstrong
//		int n=370;
//int originalno=n;
//int temp;
//int num=0;
//for(int i=0;n>0;i++) {                                    
//	int r=n%10;
//	temp=r*r*r;
//	num=num+temp;
//	n=n/10;
//}
//if(num==originalno) {
//	System.out.println("Amstrong");
//}
//else {
//	System.out.println("not amstrong");
//}

	}

