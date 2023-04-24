package co.edu.unbosque.controller;
import java.util.ArrayList;

import co.edu.unbosque.model.Conjuntos;
import co.edu.unbosque.model.Conversion;
import co.edu.unbosque.model.Descomposicion;
import co.edu.unbosque.model.EsPrimo;
import co.edu.unbosque.view.VistaVentana;

public class Controller {
	private VistaVentana vista;
	private EsPrimo sel1;
	private Conversion sel2, sel21, operacion;
	private Descomposicion sel4, sel41;
	private Conjuntos con1;
	private String menu = "\t ___________- Bienvenido al selector de opciones, por favor elija la letra que se indica. -___________\n\n"
	    	+"\n\t\t a) Averiguar si un número ingresado es primo.\n"
	    	+"\n\t\t b) Conversión de bases.\n"
	    	+"\n\t\t c) Operación con bases diferentes a la decimal.\n"
	    	+"\n\t\t d) Descomposición de un número a factores primos.\n"
	    	+"\n\t\t e) Encontrar el mcm de 2 números.\n"
	    	+"\n\t\t f) Encontrar el MCD de 2 números.\n"
	    	+"\n\t\t g) Relaciones\n"
	    	+"\n\t\t Otro caracter) Finalizar\n\n\n"
	    	+"\t\t\t\t Ingrese la opción: ";
	private String submenu2 = "\t ___________- Bienvenido al selector de opciones, por favor la letra que se indica. -___________\n\n"
	    	+"\n\t\t a) De decimal a binario.\n"
	    	+"\n\t\t b) De binario a decimal.\n"
	    	+"\n\t\t c) De decimal a octal.\n"
	    	+"\n\t\t d) De octal a decimal.\n"
	    	+"\n\t\t e) De decimal a hexadecimal.\n"
	    	+"\n\t\t f) De hexadecimal a decimal.\n"
	    	+"\n\t\t g) De binario a octal.\n"
	    	+"\n\t\t h) De binario a hexadecimal.\n"
	    	+"\n\t\t i) Más.\n"
	    	+"\n\t\t Otro caracter) Volver\n\n\n"
	    	+"\t\t\t\t Ingrese la opción: ";
	private String submenu22 = "\t ___________- Bienvenido al selector de opciones, por favor elija la letra que se indica. -___________\n\n"
	    	+"\n\t\t a) De octal a hexadecimal.\n"
	    	+"\n\t\t b) De octal a binario.\n"
	    	+"\n\t\t c) De hexadecimal a octal.\n"
	    	+"\n\t\t d) De hexadecimal a binario.\n"
	    	+"\n\t\t Otro caracter) Volver\n\n\n"
	    	+"\t\t\t\t Ingrese la opción: ";
	
	private String submenu3 = "\t ___________- Bienvenido al selector de opciones, por favor elija la letra que se indica. -___________\n\n"
	    	+"\n\t\t a) Suma de binarios.\n"
	    	+"\n\t\t b) Suma de hexadecimales.\n"
	    	+"\n\t\t c) Suma de octales.\n"
	    	+"\n\t\t d) Resta de binarios.\n"
	    	+"\n\t\t e) Resta de hexadecimales.\n"
	    	+"\n\t\t f) Resta de octales.\n"
	    	+"\n\t\t Otro caracter) Volver\n\n\n"
	    	+"\t\t\t\t Ingrese la opción: ";
	
	private String submenurelaciones = "\t ___________- Bienvenido al selector de opciones, por favor elija la letra que se indica. -___________\n\n"
	    	+"\n\t\t a) Averiguar si una Relación es reflexiva.\n"
	    	+"\n\t\t b) Averiguar si una Relación es simetrica.\n"
	    	+"\n\t\t c) Averiguar si una Relación es antisimetrica.\n"
	    	+"\n\t\t d) Averiguar si una Relación es transitiva.\n"
	    	+"\n\t\t e) Averiguar si una Relación es de equivalencia.\n"
	    	+"\n\t\t f) Averiguar si una Relación es de orden.\n"
	    	+"\n\t\t Otro caracter) Finalizar\n\n\n"
	    	+"\t\t\t\t Ingrese la opción: ";
	
	public Controller() {
		vista = new VistaVentana();
		sel1 = new EsPrimo();
		sel2 = new Conversion();
		sel21 = new Conversion();
		operacion = new Conversion();
		sel4 = new Descomposicion();
		sel41 = new Descomposicion();
		con1 = new Conjuntos();
		funcionar();
	}
	
	public void funcionar() {
		
		boolean rep = true;
		//menu principal
		do {
			char opc1 = vista.pedirString(menu).toLowerCase().charAt(0);
			switch (opc1) {
			case 'a':
				sele1();
				break;
			case 'b':
				//opcion 2 menu principal
				menu2();
				break;
			case 'c':
				menu4();
				break;
			case 'd':
				descomponer(sel4);
				break;
			case 'e':
				mcm();
				break;
			case 'f':
				mcd();
				break;
			case 'g':
				menuConjuntos();
				break;
			default:
				rep = repetir();
				break;
			
			}
		}while(rep);
		
	}
	
	public boolean repetir() {
		boolean r=true;
		char s = vista.pedirString("Seguro que quiere salir?\na) Si\nb) No.").toLowerCase().charAt(0);
		if(s != 'b') r=false;
		return r;
	}
	
	public void menu2() {
		char opc2 = vista.pedirString(submenu2).toLowerCase().charAt(0);
		switch (opc2) {
		case 'a':
			decimalabinario();
			break;
		case 'b':
			binarioadecimal();
			break;
		case 'c':
			decimalaoctal();
			break;
		case 'd':
			octaladecimal();
			break;
		case 'e':
			decimalahexadecimal();
			break;
		case 'f':
			hexadecimaladecimal();
			break;
		case 'g':
			binarioaoctal();
			break;
		case 'h':
			binarioahexadecimal();
			break;
		case 'i':
			//opcion 9 submenu2
			menu3();
			break;
		default:
			break;
		}
	}
	
	public void menu3() {
		char opc3 = vista.pedirString(submenu22).toLowerCase().charAt(0);
		switch (opc3) {
		case 'a':
			octalabinario();
			break;
		case 'b':
			octalahexadecimal();
			break;
		case 'c':
			hexadecimalaoctal();
			break;
		case 'd':
			hexadecimalabinario();
			break;
		default:
			break;
		}
	}
	
	public void sele1(){
		sel1.setN(vista.pedirDatoEntero("Ingrese el número a averiguar si es primo: "));
		sel1.resolver();
		vista.mostrarInfo(sel1.toString());
	}
	
	public void binarioadecimal() {
		sel2.setBin(vista.pedirString("Ingrese el número en binario: "));
		vista.mostrarInfo("El número en decimal es: "+sel2.binarioADecimal());
	}
	
	public void decimalabinario() {
		sel2.setDec(vista.pedirDatoEntero("Ingrese el número en decimal: "));
		vista.mostrarInfo("El numero en binario es: "+sel2.decimalABinario());
	}
	
	public void octaladecimal() {
		sel2.setOct(vista.pedirString("Ingrese el número en octal: "));
		vista.mostrarInfo("El numero en decimal es: "+sel2.octalADecimal());
	}
	
	public void decimalaoctal() {
		sel2.setDec(vista.pedirDatoEntero("Ingrese el numero en decimal: "));
		vista.mostrarInfo("El numero en octal es: "+sel2.decimalAOctal());	
	}
	
	public void decimalahexadecimal() {
		sel2.setDec(vista.pedirDatoEntero("Ingrese el numero en decimal: "));
		vista.mostrarInfo("El numero en hexadecimal es: "+sel2.decimalAHexadecimal());
	}
	
	public void hexadecimaladecimal() {
		sel2.setHex(vista.pedirString("Ingrese el numero en hexadecimal: ").toUpperCase());
		vista.mostrarInfo("El numero en decimal es: "+sel2.hexadecimalADecimal());
	}
	
	public void binarioaoctal() {
		sel2.setBin(vista.pedirString("Ingrese el numero en binario: "));
		sel2.binarioADecimal();
		vista.mostrarInfo("El número en octal es: "+sel2.decimalAOctal());
	}
	
	public void binarioahexadecimal() {
		sel2.setBin(vista.pedirString("Ingrese el numero en binario: "));
		sel2.binarioADecimal();
		vista.mostrarInfo("El número en hexadecimal es: "+sel2.decimalAHexadecimal());
	}
	
	public void octalabinario() {
		sel2.setOct(vista.pedirString("Ingrese el numero en octal: "));
		sel2.octalADecimal();
		vista.mostrarInfo("El número en binario es: "+sel2.decimalABinario());
	}
	
	public void octalahexadecimal() {
		sel2.setOct(vista.pedirString("Ingrese el numero en octal: "));
		sel2.octalADecimal();
		vista.mostrarInfo("El número en hexadecimal es: "+sel2.decimalAHexadecimal());
	}
	
	public void hexadecimalabinario() {
		sel2.setHex(vista.pedirString("Ingrese el numero en hexadecimal: "));
		sel2.hexadecimalADecimal();
		vista.mostrarInfo("El número en binario es: "+sel2.decimalABinario());
	}
	
	public void hexadecimalaoctal() {
		sel2.setHex(vista.pedirString("Ingrese el numero en hexadecimal: "));
		sel2.hexadecimalADecimal();
		vista.mostrarInfo("El número en octal es: "+sel2.decimalAOctal());
	}
	
	public void menu4() {
		char opc = vista.pedirString(submenu3).toLowerCase().charAt(0);
		switch (opc) {
		case 'a':
			sumarBin();
			break;
		case 'b':
			sumarHex();
			break;
		case 'c':
			sumarOct();
			break;
		case 'd':
			restarBin();
			break;
		case 'e':
			restarHex();
			break;
		case 'f':
			restarOct();
			break;
		default:
			break;
		}
	}
	
	public void sumarBin() {
		sel2.setBin(vista.pedirString("Ingrese el primer número de la suma: "));
		sel21.setBin(vista.pedirString("Ingrese el segundo número de la suma: "));
		operacion.setDec((sel2.binarioADecimal()) + (sel21.binarioADecimal()));
		vista.mostrarInfo("La suma es: "+operacion.decimalABinario());
	}
	
	public void sumarHex() {
		sel2.setHex(vista.pedirString("Ingrese el primer número de la suma: ").toUpperCase());
		sel21.setHex(vista.pedirString("Ingrese el segundo número de la suma: ").toUpperCase());
		operacion.setDec((sel2.hexadecimalADecimal() + sel21.hexadecimalADecimal()));
		System.out.println(sel2.hexadecimalADecimal() + sel21.hexadecimalADecimal());
		vista.mostrarInfo("La suma es: "+operacion.decimalAHexadecimal());
	}
	
	public void sumarOct() {
		sel2.setOct(vista.pedirString("Ingrese el primer numero de la suma: "));
		sel21.setOct(vista.pedirString("Ingrese el segundo numero de la suma: "));
		operacion.setDec((sel2.octalADecimal()) + (sel21.octalADecimal()));
		vista.mostrarInfo("La suma es: "+operacion.octalADecimal());
	}
	
	public void restarBin() {
		sel2.setBin(vista.pedirString("Ingrese el primer número de la resta: "));
		sel21.setBin(vista.pedirString("Ingrese el segundo número de la resta: "));
		operacion.setDec((sel2.binarioADecimal()) - (sel21.binarioADecimal()));
		vista.mostrarInfo("La resta es: "+operacion.decimalABinario());
	}
	
	public void restarHex() {
		sel2.setHex(vista.pedirString("Ingrese el primer número de la resta: ").toUpperCase());
		sel21.setHex(vista.pedirString("Ingrese el segundo número de la resta: ").toUpperCase());
		operacion.setDec((sel2.hexadecimalADecimal() - sel21.hexadecimalADecimal()));
		vista.mostrarInfo("La resta es: "+operacion.decimalAHexadecimal());
	}
	
	public void restarOct() {
		sel2.setOct(vista.pedirString("Ingrese el primer numero de la resta: "));
		sel21.setOct(vista.pedirString("Ingrese el segundo numero de la resta: "));
		operacion.setDec((sel2.octalADecimal()) - (sel21.octalADecimal()));
		vista.mostrarInfo("La resta es: "+operacion.octalADecimal());
	}
	
	public void descomponer(Descomposicion sel4) {
		sel4.setN(vista.pedirDatoEntero("Ingrese el numero a descomponer: "));
		sel4.factoresPrimos();
		vista.mostrarInfo(sel4.imprimirArreglo());
	}
	
	public void mcm() {
		ArrayList<Integer> mcm = new ArrayList<>();
		descomponer(sel4);
		descomponer(sel41);
		
		ArrayList<Integer> auxiliar = new ArrayList<>();
		if(sel4.getN()>sel41.getN()) {
			auxiliar = sel4.getPrimos();
		}
		else {
			auxiliar = sel41.getPrimos();
		}
		
		for(int i=0; i<auxiliar.size(); i++) {
			int rep1 = 0;
			int rep2 = 0;
			for(int j=0; j<sel4.getDescomp().size(); j++) {
				if(sel4.getDescomp().get(j)==auxiliar.get(i)) rep1++;
			}
			for(int j=0; j<sel41.getDescomp().size(); j++) {
				if(sel41.getDescomp().get(j)==auxiliar.get(i)) rep2++;
			}
			int may = 0;
			if(rep1>=rep2) may = rep1;
			else may = rep2;
			for(int j=0; j<may; j++) mcm.add(auxiliar.get(i));
		}
		
		int mcmn = 1;
		for(int i=0; i<mcm.size(); i++) {
			mcmn *= mcm.get(i);
		}
		
		vista.mostrarInfo("El mcm entre "+sel4.getN()+" y "+sel41.getN()+" es: \n"+mcm.toString()+" = "+mcmn);	
	}
	
	public void mcd() {
		ArrayList<Integer> mcd = new ArrayList<>();
		descomponer(sel4);
		descomponer(sel41);
		
		ArrayList<Integer> auxiliar = new ArrayList<>();
		if(sel4.getN()>sel41.getN()) {
			auxiliar = sel4.getPrimos();
		}
		else {
			auxiliar = sel41.getPrimos();
		}
		
		for(int i=0; i<auxiliar.size(); i++) {
			int rep1 = 0;
			int rep2 = 0;
			for(int j=0; j<sel4.getDescomp().size(); j++) {
				if(sel4.getDescomp().get(j)==auxiliar.get(i)) rep1++;
			}
			for(int j=0; j<sel41.getDescomp().size(); j++) {
				if(sel41.getDescomp().get(j)==auxiliar.get(i)) rep2++;
			}
			int men = 0;
			if(rep1<rep2) men = rep1;
			else men = rep2;
			for(int j=0; j<men; j++) mcd.add(auxiliar.get(i));
		}
		
		int mcdn = 1;
		for(int i=0; i<mcd.size(); i++) {
			mcdn *= mcd.get(i);
		}
		
		vista.mostrarInfo("El MCD entre "+sel4.getN()+" y "+sel41.getN()+" es: \n"+mcd.toString()+" = "+mcdn);	
	}
	
	public void menuConjuntos() {
		char opc = vista.pedirString(submenurelaciones).toLowerCase().charAt(0);
		switch (opc) {
		case 'a':
			pedirConjuntos();
			if(con1.reflexiva()) {
				vista.mostrarInfo("La relacion "+con1.impr()+" SI ES Reflexiva");
			}else {
				vista.mostrarInfo("La relacion "+con1.impr()+" NO ES Reflexiva");
			}
			break;
		case 'b':
			pedirConjuntos();
			if(con1.simetrica()) {
				vista.mostrarInfo("La relacion "+con1.impr()+" SI ES Simetrica");
			}else {
				vista.mostrarInfo("La relacion "+con1.impr()+" NO ES Simetrica");
			}
			break;
		case 'c':
			pedirConjuntos();
			if(con1.antisimetrica()) {
				vista.mostrarInfo("La relacion "+con1.impr()+" SI ES Antisimetrica");
			}else {
				vista.mostrarInfo("La relacion "+con1.impr()+" NO ES Antisimetrica");
			}
			break;
		case 'd':
			pedirConjuntos();
			if(con1.transitiva()) {
				vista.mostrarInfo("La relacion "+con1.impr()+" SI ES Transitiva");
			}else {
				vista.mostrarInfo("La relacion "+con1.impr()+" NO ES Transitiva");
			}
			break;
		case 'e':
			pedirConjuntos();
			if(con1.reflexiva() && con1.simetrica() && con1.transitiva()) {
				vista.mostrarInfo("La relacion "+con1.impr()+" SI ES de Equivalencia");
			}else {
				vista.mostrarInfo("La relacion "+con1.impr()+" NO ES de Equivalencia");
			}
			break;
		case 'f':
			pedirConjuntos();
			if(con1.reflexiva() && con1.antisimetrica() && con1.transitiva()) {
				vista.mostrarInfo("La relacion "+con1.impr()+" SI ES de Orden");
			}else {
				vista.mostrarInfo("La relacion "+con1.impr()+" NO ES de Orden");
			}
			break;
		default:
			break;
		}
	}
	
	public void pedirConjuntos() {
		con1 = new Conjuntos();
		con1.recibirConjuntoBase(vista.pedirString("Ingrese el conjunto de elementos separados por comas, sin espacios y sin ningún caracter adicional.\nPor ejemplo: A = {a, b, c}, debe ser digitado como: a,b,c"));
		con1.recibirConjunto(vista.pedirString("Ingrese la relación, sin espacios y sin ningún caracter adicional.\nPor ejemplo: R = {(a,b),(c,d)(e,f)}, debe ser digitado como: a,b,c,d,e,f"));
	}
	
}
