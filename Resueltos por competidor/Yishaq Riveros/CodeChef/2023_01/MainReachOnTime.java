/*Problem
Chef has recently moved into an apartment. It takes 30 minutes for Chef to reach office from the apartment.
Chef left for the office X minutes before Chef was supposed to reach. Determine whether or not Chef will be able to reach on time.
Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of a single integer X.
Output Format
For each test case, output YES if Chef will reach on time, NO otherwise.
The output is case-insensitive. Thus, the strings YES, yes, yeS, and Yes are all considered the same.

Constraints
1≤T≤60
1≤X≤60
 */

package CodeChef;

import java.util.Scanner;

public class MainReachOnTime {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt();
			if (x >= 30) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}
	}

}
