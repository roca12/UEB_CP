/*Problem
Chef appeared for a placement test.
There is a problem worth X points. Chef finds out that the problem has exactly 10 test cases. 
It is known that each test case is worth the same number of points.
Chef passes N test cases among them. Determine the score Chef will get.

Input Format
First line will contain T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, two integers X and N, the total points for the problem and the
 number of test cases which pass for Chef's solution.
Output Format
For each test case, output the points scored by Chef.
Constraints
1≤T≤100
10≤X≤200
0≤N≤10
X is a multiple of 10.
 */

package CodeChef;

import java.util.Scanner;

public class MainDetermineTheScore {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt();
			int n = sc.nextInt();
			int num_casos = 10;
			int puntos_por_caso = x / num_casos;
			
			int puntos_total = puntos_por_caso * n;
			
			System.out.println(puntos_total);
			
		}
	}

}
