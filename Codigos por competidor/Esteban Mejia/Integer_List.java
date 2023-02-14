package pCompetiDOM;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Integer_List {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int j = 0; j < t; j++) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			String word = sc.next();
			int n = sc.nextInt();
			String a  = sc.next();
			String v="";
			boolean r=false;
			for (int i = 0; i < a.length()-1; i++) {
				if(a.charAt(i)!='[' && a.charAt(i)!=']' && a.charAt(i)!=',') {
					v = a.charAt(i)+"";
					arr.add(Integer.parseInt(v));
				}
			}
				for (int p = 0; p < word.length(); p++) {
					if(word.charAt(p)== 'R' && !r ) {
						r=true;
					}else if(word.charAt(p)== 'R' && r) {
						r= false;
					}
					if(word.charAt(p)=='D' && !arr.isEmpty() && !r) {
						arr.remove(0);
					}else if(word.charAt(p)=='D' && !arr.isEmpty() && r) {
						arr.remove(arr.size()-1);
					}
				}
				if(arr.isEmpty()) {
					System.out.println("error");
				}else {
					System.out.println(arr.toString().replaceAll(" ", ""));
				}
			}
		}
	}



