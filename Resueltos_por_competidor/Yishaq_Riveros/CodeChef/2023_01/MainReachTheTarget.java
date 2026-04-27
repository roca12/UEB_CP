/*Problem
There is a cricket match going on between two teams A and B.
Team B is batting second and got a target of X runs. Currently, team B has scored Y runs. Determine how many more runs Team 
B should score to win the match.
Note: The target score in cricket matches is one more than the number of runs scored by the team that batted first.
Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of two space-separated integers X and Y, the target for team B and the current score of team 
B respectively.
Output Format
For each test case, output how many more runs team B should score to win the match.
Constraints
1≤T≤10
50≤Y<X≤200
 */
package CodeChef;

import java.util.Scanner;

public class MainReachTheTarget {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int carreras_necesarias = x - y;
			System.out.println(carreras_necesarias);		
		}
	}

}
