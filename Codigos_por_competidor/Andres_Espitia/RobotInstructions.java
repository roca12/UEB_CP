package interuniversitario1;

import java.util.ArrayList;
import java.util.Scanner;

public class RobotInstructions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			sc.nextLine();
			int c=0;
			ArrayList<Integer> mov = new ArrayList<>();
			while(n-->0){
				String aux = sc.nextLine();
				if(aux.equals("LEFT")) mov.add(-1);
				else if(aux.equals("RIGHT")) mov.add(1);
				else{
					mov.add(mov.get(Integer.parseInt(aux.substring(8))-1));
				}
			}
			for(int i=0; i<mov.size(); i++){
				c += mov.get(i);
			}
			System.out.println(c);;
		}
	}

}
