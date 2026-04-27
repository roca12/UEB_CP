package CompDom;

import java.util.Scanner;

public class Pizza {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int it = 0; it < n; it++) {
			int m = 0, a = 0, r = 0, g = 0, i = 0, t = 0;
			String str = sc.nextLine();
			for (int j = 0; j < str.length(); j++) {
				switch (str.charAt(j)) {
				case 'M':
					m++;
					break;
				case 'A':
					a++;
					break;
				case 'R':
					r++;
					break;
				case 'G':
					g++;
					break;
				case 'I':
					i++;
					break;
				case 'T':
					t++;
					break;
				}
			}
			a = a/3;
			r = r/2;
			
			menor(m, a, r, g, i, t);
		}
	}
	
	public static void menor(int m, int a, int r, int g, int i, int t) {
		if(m<=a && m<=r && m<=g && m<=i && m<=t)
			System.out.println(m);
        else if(a<=r && a<=g && a<=i && a<=t)
        	System.out.println(a);
        else if(r<=g && r<=i && r<=t)
        	System.out.println(r);
        else if(g<=i && g<=t)
        	System.out.println(g);
        else if(i<=t)
        	System.out.println(i);
        else
        	System.out.println(t);
	} 
}
