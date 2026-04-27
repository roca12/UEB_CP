package co.edu.unbosque.controller;

import co.edu.unbosque.model.Ejemplo1Thread;

public class Ejemplo1 {
	public static void main(String[] args) {
		Ejemplo1Thread t1 = new Ejemplo1Thread("Hilo1");
		t1.start();
		Ejemplo1Thread t2 = new Ejemplo1Thread("Hilo2");
		t2.start();
	}
}
