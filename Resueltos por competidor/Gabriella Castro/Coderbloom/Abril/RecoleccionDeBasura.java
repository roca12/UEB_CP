import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int total = sc. nextInt();
	int contenedores = sc.nextInt();
	int num = 0;
	
	for(int i = 0; i < contenedores; i++ ){
	    
	    int basura = sc.nextInt();
	    num += basura;
	    
	}
	
	if(num < total){
	    System.out.println(num);
	    System.out.println("ESPERAR");
	}else{
	    System.out.println(num);
	    System.out.println("SALIR");
	}
	
	
	}
}
