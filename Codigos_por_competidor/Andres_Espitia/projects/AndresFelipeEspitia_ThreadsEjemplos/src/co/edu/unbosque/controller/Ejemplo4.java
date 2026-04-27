package co.edu.unbosque.controller;

import co.edu.unbosque.model.Ejemplo4Ping;

public class Ejemplo4 {
	public static void main(String[] args) {
		Ejemplo4Ping p1 = new Ejemplo4Ping("GOLPE 1", 30);
		Ejemplo4Ping p2 = new Ejemplo4Ping("GOLPE 2", 10);
		
		p1.start();
		p2.start();
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		p1.interrupt();
		p2.interrupt();
	}
}
