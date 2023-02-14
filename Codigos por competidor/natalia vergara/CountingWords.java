import java.util.Scanner;

class CountingWords {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numc=sc.nextInt();
		int[] cont=new int[numc];
		for(int i=0;i<numc;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			cont[i]=(a*b);
		}
		for(int i=0;i<numc;i++) {
			System.out.println(cont[i]);
		}
	}

}
