import java.util.Scanner;

class AgeLimit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numc=sc.nextInt();
		String[] cont=new String[numc];
		for(int i=0;i<numc;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			if(c>=a&&c<b) {
				cont[i]="YES";
			}
			else {
				cont[i]="NO";
			}
		}
		for(int i=0;i<numc;i++) {
			System.out.println(cont[i]);
		}
	}
}
