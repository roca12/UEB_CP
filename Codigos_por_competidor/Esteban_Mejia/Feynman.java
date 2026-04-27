
import java.util.Scanner;
public class Feynman {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	while(n!=0){
		int suma=0;
		int mul=0;
		for (int i = 1; i <= n; i++) {
			 mul=i*i;
			suma+=mul;
		}
		System.out.println(suma);
		n=sc.nextInt();
	}
}
}
