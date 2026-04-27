
import java.util.ArrayList;
import java.util.Scanner;
public class Robot {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int t=sc.nextInt();
		for (int i = 0; i <t; i++) {
			int n=sc.nextInt();
			sc.nextLine();
			int res=0;
			ArrayList<Integer> pos=new ArrayList<>();
			for (int j = 0; j < n; j++) {
				String s=sc.nextLine();
				if(s.equals("LEFT")) {
					pos.add(-1);
				}else if(s.equals("RIGHT")) {
					pos.add(1);
				}else {
					pos.add(pos.get(Integer.parseInt(s.substring(8))-1));
				}
			}
			for (int j = 0; j < pos.size(); j++) {
				res+=pos.get(j);
			}
			System.out.println(res);
		}
	}
}
