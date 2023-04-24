package co.edu.unbosque.controller;

import co.edu.unbosque.model.Ejemplo2Runnable;

public class Ejemplo2 {
	public static void main(String[] args) {
		Ejemplo2Runnable m1 = new Ejemplo2Runnable("m1");
		Thread t1 = new Thread(m1);
		t1.start();
		
		Ejemplo2Runnable m2 = new Ejemplo2Runnable("m2");
		Thread t2 = new Thread(m2);
		t2.start();
	}
}
