package Clasificatorio;

import java.util.ArrayList;
import java.util.Scanner;

public class Rotating {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> voltear = new ArrayList<>();
		while(sc.hasNext()) {
			voltear.add(sc.nextLine());
		}
		
		int max = 0;
		for (int i = 0; i < voltear.size(); i++) {
			if(voltear.get(i).length() >= max) max = voltear.get(i).length();
		}
		
		for (int i = 0; i < max; i++) {
			for (int j = voltear.size()-1; j >= 0; j--) {
				if(voltear.get(j).length()>=i+1) {
					System.out.print(voltear.get(j).charAt(i));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
