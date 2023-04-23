/*Problem
Chef's son wants to go on a roller coaster ride. The height of Chef's son is X inches while the minimum height required to go on the ride is 
H inches. Determine whether he can go on the ride or not.
Input Format
The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers X and H - the height of Chef's son and the minimum height required for the ride respectively.
Output Format
For each test case, output in a single line, YES if Chef's son can go on the ride. Otherwise, output NO.
You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical)

Constraints
1≤T≤1000
1≤X,H≤100
 */

package CodeChef;

import java.util.Scanner;

public class MainRollerCoaster {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt();
			int h = sc.nextInt();
			if (x>=h) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}