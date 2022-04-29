import java.util.Scanner;

 class ShoppingChange {

	public static void main(String[] args) {
		//lectura
		//creacion de la variable
		Scanner lector;
		//inicialización 
		lector=new Scanner(System.in);
		int t=lector.nextInt();
		for (int i = 0; i < t; i++) {
			int x=lector.nextInt();
			int res=100-x;
			System.out.println(res);
		}
	}

}
