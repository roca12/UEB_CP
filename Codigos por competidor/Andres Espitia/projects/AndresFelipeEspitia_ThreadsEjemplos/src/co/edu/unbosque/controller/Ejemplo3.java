package co.edu.unbosque.controller;

import java.util.Iterator;

public class Ejemplo3 extends Thread{
	public Ejemplo3(String str) {
		setName(str);
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" "+getName());
		}
		System.out.println("Termina Thread "+getName());
	}
	
	public static void main(String[] args) {
		new Ejemplo3("Pepe").start();
		new Ejemplo3("Juan").start();
		System.out.println("Termina Thread Main");
	}
}
