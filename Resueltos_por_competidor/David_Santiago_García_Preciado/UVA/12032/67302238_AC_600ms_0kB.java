import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
			int nums = sc.nextInt();
			int res = 0;
	        int [] data = new int[nums];
	        
			for (int j = 0; j < nums; j++) {
				data[j] = sc.nextInt();
			}
			res = data[0];
			
			for (int j = 1; j < nums; j++) {
				res = Math.max(res,(data[j]-data[j-1]));
			}
			
			int k = res;

			if(data[0]==k) {
				k--;
			}
			for (int j = 1; j < nums; j++) {
				if((data[j]-data[j-1])>k) {
					res++;
					break;
				}
				else if((data[j]-data[j-1])==k) {
					k--;
				}
			}
			
			System.out.println("Case "+(i+1)+": "+res);
		}
    }
}
