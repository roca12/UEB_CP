import java.util.Scanner;

public class GoodTurn {
	public static void main (String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	for(int i = 0; i<n; i++){
	    
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    
	    if (x+y>6){
	        System.out.println("YES");
	    }else{
	        System.out.println("NO");
	    }
	    
	}
	
	}
}
