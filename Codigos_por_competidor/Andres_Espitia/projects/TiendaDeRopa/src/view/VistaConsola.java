package view;

import java.util.Scanner;

	public class VistaConsola {

		private Scanner leer;
		
		public VistaConsola() {
		   leer = new Scanner(System.in);   
		}
		
		public void mostrarMensaje(String pMensaje) {
		   System.out.println(pMensaje);
		}
		
		public String leerString(String pMensaje) {
		   String cad;
		   System.out.println(pMensaje);
		   cad = leer.nextLine();
		   return cad;
		}
		
		public double leerDecimal(String pMensaje) {
		   double op;
		   System.out.println(pMensaje);
		   op = leer.nextDouble();
		   leer.nextLine();
		   return op;
		}
		public int leerEntero(String pMensaje) {
			   int op;
			   System.out.println(pMensaje);
			   op = leer.nextInt();
			   leer.nextLine();
			   return op;
	    }
		
}





