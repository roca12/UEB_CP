/*Problem
The working hours of Chef’s kitchen are from X pm to Y pm (1≤X<Y≤12).Find the number of hours Chef works.
Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of two space-separated integers X and Y — the starting and ending time of working hours 
respectively.
Output Format
For each test case, output on a new line, the number of hours Chef works.
Constraints
1≤T≤100
1≤X<Y≤12
 */

package CodeChef;

import java.util.Scanner;

public class MainKitchenTimings {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int horas_trabajadas;
			horas_trabajadas = y - x;
			
			System.out.println(horas_trabajadas);
			
		}
	}

}
