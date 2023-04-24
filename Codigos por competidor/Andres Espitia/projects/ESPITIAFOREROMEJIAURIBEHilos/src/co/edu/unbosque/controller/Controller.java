package co.edu.unbosque.controller;

import co.edu.unbosque.model.*;
import co.edu.unbosque.view.Console;

public class Controller {
	private Console console;
	private Bank bank;
	private Customer customers[];
	private int q;
	
	public Controller() {
		init();
		exe();
	}
	
	public void init() {
		console = new Console();
		//Cantidad de cajeros
		do {
			console.printMessage("Bienvenido elija la cantidad de cajeros automáticos que requiere su banco (Un número entero positivo)");
			q = console.parse(console.readString());
		}while(q<=0);
		
		//Variables
		customers = new Customer[50];
		bank = new Bank(q);
		
		for (int i = 0; i < customers.length; i++) {
			customers[i] = new Customer(i+1);
		}
	}
	
	public void exe() {
		int i = 0;
		
		for (int j = 0; j < 50; j++) {
			customers[j].start();
			try {
				synchronized (Bank.getAtms()[i]) {
					Thread.sleep(1000);
					if (!Bank.getAtms()[i].isOccupied()) {				
						Bank.getAtms()[i].notifyAll();
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			console.printMessage(customers[j].getText_to_print());
			if ((i+1) > Bank.getAtms().length-1) {
				i = 0;
			} else {					
				i++;
			}
		}
	}

}
