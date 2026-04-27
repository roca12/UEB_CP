package co.edu.unbosque.model;

import java.util.Iterator;

public class Ejemplo1Thread extends Thread{
	private String descripcion;
	
	public Ejemplo1Thread(String str) {
		descripcion = str;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(descripcion + ": Este es el Thread "+getName());
		}
	}
}	
