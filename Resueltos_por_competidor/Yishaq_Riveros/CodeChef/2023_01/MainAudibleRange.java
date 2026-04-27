/*Problem
Chef's dog binary hears frequencies starting from 67 Hertz to 45000 Hertz (both inclusive).
If Chef's commands have a frequency of X Hertz, find whether binary can hear them or not.
Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of a single integer X - the frequency of Chef's commands in Hertz.
Output Format
For each test case, output on a new line YES, if binary can hear Chef's commands. Otherwise, print NO.
The output is case-insensitive. Thus, the strings YES, yes, yeS, and Yes are all considered the same.
Constraints
1≤T≤10^4
1≤X≤10^6
 */

package CodeChef;

import java.util.Scanner;

public class MainAudibleRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt();
			if(x>=67 && x<=45000) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}
	}
}
