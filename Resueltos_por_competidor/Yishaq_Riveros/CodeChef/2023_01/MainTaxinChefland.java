/*Problem
In Chefland, a tax of rupees 10 is deducted if the total income is strictly greater than rupees 100.
Given that total income is X rupees, find out how much money you get.
Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
The first and only line of each test case contains a single integer X — your total income.
Output Format
For each test case, output on a new line, the amount of money you get.
Constraints
1≤T≤100
1≤X≤1000
 */

package CodeChef;

import java.util.Scanner;

public class MainTaxinChefland {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt();
			int tax_deducted = 10;
			if (x>100) {
				int total_amount = x - tax_deducted;
				System.out.println(total_amount);
			}else {
				System.out.println(x);
			}
			
		}
	}

}
