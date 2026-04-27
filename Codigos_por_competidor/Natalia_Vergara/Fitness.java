import java.util.Scanner;

class Fitness {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numc=sc.nextInt();
		int[] cont=new int[numc];
		for(int i=0;i<numc;i++) {
			int a=sc.nextInt();
			cont[i]=(a*10);
		}
		for(int i=0;i<numc;i++) {
			System.out.println(cont[i]);
		}
	}

}
