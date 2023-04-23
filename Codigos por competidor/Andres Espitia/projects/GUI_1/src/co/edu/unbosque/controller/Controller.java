package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{
	
	private VentanaPrincipal vista;
	
	public Controller() {
		vista = new VentanaPrincipal();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		vista.getP1().getB_sumar().addActionListener(this);
		vista.getP1().getB_restar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if(comando.equals("SUMAR")) {
			System.out.println("Oprime el botón sumar");
		}else if(comando.equals("RESTAR")) {
			System.out.println("Oprime el botón restar");
		}
		
	}

}
