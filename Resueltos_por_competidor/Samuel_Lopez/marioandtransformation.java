import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
			int T = sc.nextInt();
			String output = "";
			for (int j = 0; j < T; j++) {
				int estado = 2;
				int hongo = sc.nextInt();
				
				for (int i = 0; i < hongo; i++) {
					
					if(estado == 2) {
						estado = 3;
					}else if(estado == 3) {
						estado = 1;
					}else if(estado == 1) {
						estado = 2;
					}
					
				}
				if(estado == 2) {
					output += "NORMAL \n";
				}else if(estado == 3) {
					output += "HUGE \n";
				}else if(estado == 1) {
					output += "SMALL \n";
				}
			}
			
			System.out.println(output);	
				
				
				
			
			
		}

	}
