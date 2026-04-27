import java.util.Scanner;

public class I_Love_Pizza {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int test= sc.nextInt();
		for (int j = 0; j < test; j++) {
			int m=0,a=0,r=0,g=0,i=0,t=0,pizzas=0;
			String p=sc.next().toLowerCase();
			for (int k = 0; k < p.length(); k++) {
					if(p.charAt(k)=='a') {
						a++;
					}else if(p.charAt(k)=='m') {
						m++;
					}else if(p.charAt(k)=='r') {
						r++;
					}else if(p.charAt(k)=='g') {
						g++;
					}else if(p.charAt(k)=='i') {
						i++;
					}else if(p.charAt(k)=='t') {
						t++;
					}
					while( m>0&&a>2&&r>1&&g>0&i>0&&t>0) {
						pizzas++;
						m-=1;a-=3;r-=2;g-=1;i-=1;t-=1;
					}
				}
			System.out.println(pizzas);
		}
	}
}
