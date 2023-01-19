import java.util.Scanner;

class WhoTaller {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numc=sc.nextInt();
		String[] cont=new String[numc];
		for(int i=0;i<numc;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a>b) {
				cont[i]="A";
			}else {
				cont[i]="B";
			}
		}
		for(int i=0;i<numc;i++) {
			System.out.println(cont[i]);
		}
	}

}
