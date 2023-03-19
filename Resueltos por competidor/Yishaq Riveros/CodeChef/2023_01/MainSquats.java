/* Problem
Somu went to the gym today. He decided to do X sets of squats. Each set consists of 
15 squats. Determine the total number of squats that he did today.
Input Format
The first line contains a single integer T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains an integer X — the total number of sets of squats that Somu did.
Output Format
For each test case, output the total number of squats done by Somu.
Constraints
1≤T≤1000
1≤X≤10^5
*/
package CodeChef;

import java.util.Scanner;

public class MainSquats {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t= sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt();
			int sets;
			int num_squats=15;
			sets=x*num_squats;
			
			System.out.println(sets);
		}
	}

}
