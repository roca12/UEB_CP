/*Problem
Chef wants to become fit for which he decided to walk to the office and return home by walking. 
It is known that Chef's office is X km away from his home. If his office is open on 5 days in a week, find the 
number of kilometers Chef travels through office trips in a week.
Input Format
First line will contain T, number of test cases. Then the test cases follow.
Each test case contains of a single line consisting of single integer X.
Output Format
For each test case, output the number of kilometers Chef travels through office trips in a week.
Constraints
1≤T≤10
1≤X≤10 
*/
package CodeChef;

import java.util.Scanner;

public class MainFitness {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt();
			int tot_km = 2*x;
			int days_work = 5;
			int km_recorridos = tot_km * days_work;
			
			System.out.println(km_recorridos);
			
		}
	}

}
