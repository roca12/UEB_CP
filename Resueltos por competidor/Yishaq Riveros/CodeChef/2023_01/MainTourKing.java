/*Problem
King loves to go on tours with his friends.
King has N cars that can seat 5 people each and M cars that can seat 7 people each. Determine the maximum number of people that can travel together in these cars.
Input Format
The first line of input contains a single integer T, the number of test cases.
The first and only line of each test case contains two space-separated integers N and M — the number of 5-seaters and 7-seaters, respectively.
Output Format
For each test case, output on a new line the maximum number of people that can travel together.
Constraints
1≤T≤100
0≤N,M≤100
 */
package CodeChef;

import java.util.Scanner;

public class MainTourKing {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int max_people = (n*5)+(m*7);
			
			System.out.println(max_people);
		}
	}

}
