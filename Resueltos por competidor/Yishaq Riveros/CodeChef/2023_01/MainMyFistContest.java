/*
Now to the problem:
In a contest where N new users visited the contest,
A users just saw the problems and didn’t make any submissions and hence won’t get any rating.
B users who made a submission but could not solve any problem correctly. Thus, after the contest, they will get a rating in the range 1000
800−1000.
Everyone else could correctly solve at least 1 problem. Thus, they will get a rating strictly greater than 1000 after the contest.
You need to output the number of new users in the contest who, after the contest, will get a rating and also the number of new users who will get a rating strictly greater than 1000.

Input Format
Each input file contains of a single line, with three integers N,A and B - the number of new users, the number of users who just saw the problem and didn't make any submission, and the number of users who made a submission but could not solve any problem correctly.
Output Format
Output two integers separated by a space in a single line - the number of new users who will get a rating at the end of the contest and the number of new users who will get a rating higher than 1000.
Constraints
2≤N≤1000
1≤A≤1000
1≤B≤1000
A+B≤N
 */

package CodeChef;

import java.util.Scanner;

public class MainMyFistContest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int op1 = a-b;
			int op2 = op1-c;
			
			System.out.println(""+op1+" "+op2);
			
		
	}

}
