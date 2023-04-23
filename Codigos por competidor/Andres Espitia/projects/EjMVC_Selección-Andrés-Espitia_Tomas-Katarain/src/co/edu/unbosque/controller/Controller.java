package co.edu.unbosque.controller;
import co.edu.unbosque.model.Ej16;
import co.edu.unbosque.model.Ej17;
import co.edu.unbosque.model.Ej26;
import co.edu.unbosque.model.Ej27;
import co.edu.unbosque.model.Ej36;
import co.edu.unbosque.model.Ej37;
import co.edu.unbosque.model.Ej46;
import co.edu.unbosque.model.Ej47;
import co.edu.unbosque.model.Ej6;
import co.edu.unbosque.model.Ej7;
import co.edu.unbosque.view.VistaConsola;

public class Controller {
	private Ej6 e6;
	private Ej7 e7;
	private Ej16 e16;
	private Ej17 e17;
	private Ej26 e26;
	private Ej27 e27;
	private Ej36 e36;
	private Ej37 e37;
	private Ej46 e46;
	private Ej47 e47;
	private VistaConsola vista;
	
	public Controller() {
		e6 = new Ej6();
		e7 = new Ej7();
		e16 = new Ej16();
		e17 = new Ej17();
		e26 = new Ej26();
		e27 = new Ej27();
		e36 = new Ej36();
		e37 = new Ej37();
		e46 = new Ej46();
		e47 = new Ej47();
		vista = new VistaConsola();
		funcionar();
	}
	
	public void funcionar() {
		boolean rep = true;
		
		do{
			int opc = vista.pedirDatoEnteroTuneado("\t ___________- Bienvenido al selector de ejercicios, por favor elija el n�mero que se indica. -___________\n\n"
			    	+"\t\t 1) Ejercicio n�mero 6: Leer un n�mero entero de dos d�gitos menor que 20 y determinar si es primo.\n"
			    	+"\n\t\t 2) Ejercicio n�mero 7: Leer un n�mero entero de dos d�gitos y determinar si es primo y adem�s si es negativo.\n"
			    	+"\n\t\t 3) Ejercicio n�mero 16: Leer un n�mero entero de tres d�gitos y determinar si al menos dos de sus tres d�gitos son iguales.\n"
			    	+"\n\t\t 4) Ejercicio n�mero 17: Leer un n�mero entero de tres d�gitos y determinar en qu� posici�n est� el mayor d�gito.\n"
			    	+"\n\t\t 5) Ejercicio n�mero 26: Leer un n�mero entero de cuatro d�gitos y determinar a cuanto es igual la suma de sus d�gitos.\n"
			    	+"\n\t\t 6) Ejercicio n�mero 27: Leer un n�mero entero de cuatro d�gitos y determinar cu�ntos d�gitos pares tiene.\n"
			    	+"\n\t\t 7) Ejercicio n�mero 36: Leer un n�mero entero de 4 d�gitos y determinar si tiene m�s d�gitos pares o impares.\n"
			    	+"\n\t\t 8) Ejercicio n�mero 37: Leer dos n�meros enteros y determinar cu�l es m�ltiplo de cu�l.\n"
			    	+"\n\t\t 9) Ejercicio n�mero 46: Leer un n�mero entero de 2 d�gitos y si terminar en 1 mostrar en pantalla su primer d�gito, si termina \n\t\ten 2 mostrar en pantalla la suma de sus d�gitos y si termina en 3 mostrar en pantalla el producto de sus dos d�gitos.\n"
			    	+"\n\t\t 10) Ejercicio n�mero 47: Leer dos n�meros enteros y si la diferencia entre los dos n�meros es par mostrar en pantalla la suma \n\t\tde los d�gitos de los n�meros, si dicha diferencia es un n�mero primo menor que 10 entonces mostrar en pantalla el producto de los dos n�meros y si la \n\t\tdiferencia entre ellos terminar en 4 mostrar en pantalla todos los d�gitos por separado.\n"
			    	+"\n\t\t Otro n�mero) Finalizar\n\n\n"
			    	+"\t\t\t\t Ingrese la opci�n: ");
			switch (opc) {
			case 1:
				ejj6();
				break;
			case 2:
				ejj7();
				break;
			case 3:
				ejj16();
				break;
			case 4:
				ejj17();
				break;
			case 5:
				ejj26();
				break;
			case 6:
				ejj27();
				break;
			case 7:
				ejj36();
				break;
			case 8:
				ejj37();
				break;
			case 9:
				ejj46();
				break;
			case 10:
				ejj47();
				break;
			default:
				vista.mostrarInfoTuneado("Hasta pronto!! :)");
				rep = false;
		}
		}while(rep);
		
	}
	
	public void ejj6() {
		vista.mostrarInfoTuneado("\tBienvenido al Ejercicio 6");
		e6.setN(vista.pedirDatoEnteroTuneado("Ingrese un n�mero de 2 digitos menor a 20 para resolver el ejercicio: "));
		e6.esPrimo();
		vista.mostrarInfoTuneado(e6.toString());
	}
	
	public void ejj7() {
		vista.mostrarInfoTuneado("\tBienvenido al Ejercicio 7");
		e7.setN(vista.pedirDatoEnteroTuneado("Ingrese un n�mero entero de 2 digitos para resolver el ejercicio: "));
		e7.primoyNegativo();
		vista.mostrarInfoTuneado(e7.toString());
	}
	
	public void ejj16() {
		vista.mostrarInfoTuneado("\tBienvenido al Ejercicio 16");
		e16.setN(vista.pedirDatoEnteroTuneado("Ingrese un n�mero entero de 3 digitos para resolver el ejercicio: "));
		e16.minimo2Iguales();
		vista.mostrarInfoTuneado(e16.toString());
	}
	
	public void ejj17() {
		vista.mostrarInfoTuneado("\tBienvenido al Ejercicio 17");
		e17.setN(vista.pedirDatoEnteroTuneado("Ingrese un n�mero entero de 3 digitos para resolver el ejercicio: "));
		e17.digitoMayor();
		vista.mostrarInfoTuneado(e17.toString());
	}
	
	public void ejj26() {
		vista.mostrarInfoTuneado("\tBienvenido al Ejercicio 26");
		e26.setN(vista.pedirDatoEnteroTuneado("Ingrese un n�mero entero de 4 digitos para resolver el ejercicio: "));
		e26.sumaDe4Cifras();
		vista.mostrarInfoTuneado(e26.toString());
	}
	
	public void ejj27() {
		vista.mostrarInfoTuneado("\tBienvenido al Ejercicio 27");
		e27.setN(vista.pedirDatoEnteroTuneado("Ingrese un n�mero entero de 4 digitos para resolver el ejercicio: "));
		e27.cuantosPares();
		vista.mostrarInfoTuneado(e27.toString());
	}
	
	public void ejj36() {
		vista.mostrarInfoTuneado("\tBienvenido al Ejercicio 36");
		e36.setN(vista.pedirDatoEnteroTuneado("Ingrese un n�mero entero de 4 digitos para resolver el ejercicio: "));
		e36.determinarParesImpares();
		vista.mostrarInfoTuneado(e36.toString());
	}
	
	public void ejj37() {
		vista.mostrarInfoTuneado("\t Bienvenido al Ejercicio 37");
		e37.setN(vista.pedirDatoEnteroTuneado("Ingrese el primer dato entero: "));
		e37.setN2(vista.pedirDatoEnteroTuneado("Ingrese el segundo dato entero: "));
		e37.cualMultiplo();
		vista.mostrarInfoTuneado(e37.toString());
	}
	
	public void ejj46() {
		vista.mostrarInfoTuneado("\tBienvenido al Ejercicio 46");
		e46.setN(vista.pedirDatoEnteroTuneado("Ingrese un n�mero entero de 2 digitos para resolver el ejercicio: "));
		e46.determinarNum();
		vista.mostrarInfoTuneado(e46.toString());
	}
	
	public void ejj47() {
		boolean g = false;
		vista.mostrarInfoTuneado("\tBienvenido al Ejercicio 47");
		e47.setN(vista.pedirDatoEnteroTuneado("Ingrese el primer dato entero: "));
		e47.setN2(vista.pedirDatoEnteroTuneado("Ingrese el segundo dato entero: "));
		int aux = vista.pedirDatoEnteroTuneado("Desea ordenar los n�meros de mayor a menor, o en el orden que est� por defecto?\n1)Por defecto\n2)Ordenar");
		if(aux==2) {
			g = true;
		}
		e47.cifras1();
		e47.cifras2();
		e47.resolverG(g);
		vista.mostrarInfoTuneado(e47.toString());
	}
	
}
