package rpc20ag;



import java.util.Scanner;

public class Barclassification {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), cc=0, cf=0;
		sc.nextLine();
		String m[] = new String[n];
		
		for (int i = 0; i < m.length; i++){
			m[i] = sc.nextLine();
		}
		
		boolean res = false;
		for(int i=0; i<n; i++) {
			if(m[0].charAt(i) == '0') {
				for(int j=0; j<n; j++) {
					if(m[j].charAt(i) != '0') {
						res = false;
						break;
					}else {
						res=true;
					}
				}
				if(res) cc++;
			}
		}
		
		res = false;
		for(int i=0; i<n; i++) {
			if(m[i].charAt(0) == '0') {
				for(int j=0; j<n; j++) {
					if(m[i].charAt(j) != '0') {
						res = false;
						break;
					} else {
						res = true;
					}
				}
				if(res) cf++;
			}
		}
		
		if(cc>cf) {
			System.out.println("|");
		}else if(cf>cc) {
			System.out.println("-");
		}else {
			System.out.println("+");
		}
		
		
	}

}
