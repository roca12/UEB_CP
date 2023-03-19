/*
Problem
Chef and Chefina are playing with dice. In one turn, both of them roll their dice at once.
They consider a turn to be good if the sum of the numbers on their dice is greater than 6
Given that in a particular turn Chef and Chefina got 
X and Y on their respective dice, find whether the turn was good.

Input Format
The first line of input will contain a single integer 
T, denoting the number of test cases.
Each test case contains two space-separated integers 
X and Y — the numbers Chef and Chefina got on their respective dice.
Output Format
For each test case, output on a new line, YES, if the turn was good and NO otherwise.
Each character of the output may be printed in either uppercase or lowercase. That is, the strings NO, no, nO, and No will be treated as equivalent.

Constraints
1 ≤ T ≤ 100

1≤X,Y≤6
*/
package CodeChef;

import java.util.Scanner;

public class MainGoodTurn {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x + y > 6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
