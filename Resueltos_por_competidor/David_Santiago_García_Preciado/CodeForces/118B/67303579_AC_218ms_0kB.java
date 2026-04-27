import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> patterns = new ArrayList<>();

        int n = sc.nextInt();
        
        for (int i = n; i >= 0; i--) {
        	String left = "";
        	String right = "";
        	String center = i+"";
        	for (int j = 1; j < n+1; j++) {
        		int info = i-j;
        		if(info>=0) {
        			right += " "+info;
    				left = info+" "+left;
        		}else {
    				left = "  "+left;
        		}
			}
        	patterns.add(left+center+right);
        }
        
        boolean lap = false;
        int i = n;
        while(i<=n || !lap) {
        	System.out.println(patterns.get(i));
        	if(i==0) {
        		lap = true;
        	}
        	if(lap) {
        		i++;
        	}else {
        		i--;
        	}
        }
    }
}
