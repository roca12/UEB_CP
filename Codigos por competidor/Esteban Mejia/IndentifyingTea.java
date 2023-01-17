
import java.util.Scanner;

public class IndentifyingTea {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	while(sc.hasNext()) {
		int t=sc.nextInt(),conteo=0,a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt(),e=sc.nextInt();
		if(a==t) {
			conteo++;
		}if(b==t) {
			conteo++;
		}if(c==t) {
			conteo++;
		}if(d==t) {
			conteo++;
		}if(e==t) {
			conteo++;
		}
		System.out.println(conteo);
	}
}
}
