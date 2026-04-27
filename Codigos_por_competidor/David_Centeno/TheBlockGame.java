package codechef;

import java.util.Scanner;
import java.util.*;
public class TheBlockGame {
//palindromo
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		
		int t=sc.nextInt();
		while (t-->0) {
			String n=sc.next();
			int [] asd = new int[n.length()];
			int [] p = new int[n.length()];
			for (int i = 0; i < n.length(); i++) {
				p[i]=p[i]+n.charAt(i);
				System.out.println(p[1]);
			}
			int xd=Integer.valueOf(n);
			System.out.println(xd);
			for (int i = p.length; i < 0; i--){
				a++;
				asd[a]=asd[a]+p[i];	
		}
			
				if (p!=asd) {
					System.out.println("wins");
				} else {
					System.out.println("loses");
				}
			}
			
		}
	}


