package co.edu.unbosque.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class VistaConsola {
	
	private Scanner leer;
	
	public VistaConsola() {
		leer = new Scanner(System.in);
	}
	
	
	public void mostrarInformacion(String mensaje) {
		System.out.println(mensaje);
	}
	
	public void mostrarInfoTuneado(String mensaje) {
		System.out.println(mensaje);
	}
	
	public int pedirDatoEnteroTuneado(String mensaje) {
		System.out.println(mensaje);
		int dato = leer.nextInt();
		leer.nextLine();
		return dato;
	}
	
	public String pedirStringTuneado(String mensaje) {
		System.out.println(mensaje);
		String dato = leer.nextLine();
		return dato;
	}
}

