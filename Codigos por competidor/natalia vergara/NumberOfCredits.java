import java.util.Scanner;

class NumberCredits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numc=sc.nextInt();
		int[] cont=new int[numc];
		for(int i=0;i<numc;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			cont[i]=(a*4)+(b*2);
		}
		for(int i=0;i<numc;i++) {
			System.out.println(cont[i]);
		}
	}
}
