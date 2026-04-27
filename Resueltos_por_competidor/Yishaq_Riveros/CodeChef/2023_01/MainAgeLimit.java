/* Problem
Chef wants to appear in a competitive exam. To take the exam, there are following requirements:
Minimum age limit is X (i.e. Age should be greater than or equal to X).
Age should be strictly less than Y.
Chef's current Age is A. Find whether he is currently eligible to take the exam or not.
Input Format
First line will contain T, number of test cases. Then the test cases follow.
Each test case consists of a single line of input, containing three integers 
X,Y, and A as mentioned in the statement.
Output Format
For each test case, output YES if Chef is eligible to give the exam, NO otherwise.
You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).
Constraints
1≤T≤1000
20≤X<Y≤40
10≤A≤50
*/
package CodeChef;

import java.util.Scanner;

public class MainAgeLimit {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t= sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			
			if ( a >= x && a < y) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
	}

}
