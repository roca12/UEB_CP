import java.util.*;

public class Rise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		for(int c=0; c<t; c++) {
			int control = 0;
			String s = sc.nextLine();
			char[] imp = s.toCharArray();
			for(int i=1; i<s.length(); i++) {
				if(control == 0) {
					if(Integer.parseInt(imp[i]+"")< Integer.parseInt(imp[i-1]+"")) {
						control = 1;
					}
				}else if(control == 1) {
					if(Integer.parseInt(imp[i]+"") > Integer.parseInt(imp[i-1]+"")) {
						for(int j=i; j<s.length(); j++) {
							imp[j] = imp[i-1];
						}
						break;
					}
				}
			}
			System.out.println(imp);
			
		}

	}

}
