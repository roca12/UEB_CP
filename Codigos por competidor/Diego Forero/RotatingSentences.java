package ClasificaroriaNacional;

import java.util.ArrayList;
import java.util.Scanner;

public class RotatingSentences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> voltear = new ArrayList<>();
		while(sc.hasNext()) {
			voltear.add(sc.nextLine());
		}
		int max_it = 0;
		for (int i = 0; i < voltear.size(); i++) {
			if(voltear.get(i).length() >= max_it) max_it = voltear.get(i).length();
		}
		
		for (int i = 0; i < max_it; i++) {
			for (int j = voltear.size()-1; j >= 0; j--) {
				if (voltear.get(j).length() >= i+1) {
					System.out.print(voltear.get(j).charAt(i));
				} else {
					System.out.println(" ");
				}
			}
			System.out.println();
		}
	}

}
