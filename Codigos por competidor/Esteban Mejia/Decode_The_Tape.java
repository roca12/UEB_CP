package pCompetiDOM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Deconde_The_Tape {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		StringBuilder sb=new StringBuilder();
		sc.nextLine(); 
		while (!(s=sc.nextLine()).equals("___________")) {
			s=s.replaceAll("|","");
			StringBuilder binario=new StringBuilder();
			for (char c : s.toCharArray()) {
				if (c==' ') {
					binario.append('0'); 
				}
				else if (c=='o') {
					binario.append('1');
				}
			}sb.append((char)Integer.parseInt(binario.toString(),2));
		}
		System.out.print(sb.toString());
	}
}
