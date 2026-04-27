/* Problem
Problem Statement
The task is very simple: given two integers A and B, write a program to add these two numbers and output it.
Input Format
The first line contains an integer T, the total number of test cases. Then follow T lines, each line contains two Integers A and B.
Output Format
For each test case, add A and B and display the sum in a new line.
Everything your program prints is considered “output”, so if you output some debugging statements like “Please enter T”, this will be considered as part of your answer, and because it does not satisfy the output format, it will be marked wrong, even if your answer is otherwise correct!
Constraints
1 ≤ T ≤ 1000
0 ≤ A,B ≤ 10000
*/

package CodeChef;

import java.util.Scanner;

public class MainAddTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int suma;
			suma= A+B;
			System.out.println(suma);
			
		}
	}
}
