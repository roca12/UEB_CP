/*Problem
Chef is fond of burgers and decided to make as many burgers as possible.
Chef has A patties and B buns. To make 1 burger, Chef needs 1 patty and 1 bun.
Find the maximum number of burgers that Chef can make.

Input Format
The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.
The first and only line of each test case contains two space-separated integers A and B, the number of patties and buns respectively.
Output Format
For each test case, output the maximum number of burgers that Chef can make.
Constraints
1≤T≤1000
1≤A,B≤10^5 
 */

package CodeChef;

import java.util.Scanner;

public class MainBurgers {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a<b) {
				System.out.println(a);
			}else {
				System.out.println(b);
			}
			
		}
	}

}
